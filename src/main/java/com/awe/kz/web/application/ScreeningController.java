package com.awe.kz.web.application;

import com.awe.kz.business.domain.MovieScreening;
import com.awe.kz.business.service.impl.ScreeningService;
import com.awe.kz.data.repository.MovieRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/screenings")
public class ScreeningController {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private ScreeningService screeningService;

    @RequestMapping(method = RequestMethod.GET)
    public String getScreenings(@RequestParam(value = "movie", required = true) String movieString, Model model) {
        List<MovieScreening> result = this.screeningService.getMovieScreeningsByMovie(movieString);
        model.addAttribute("screenings", result);
        model.addAttribute("movie", movieRepository.findByMovieName(movieString));
        return "screenings";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String bookSeats(@Valid @ModelAttribute MovieScreening movieBooking) {

        LOGGER.info(movieBooking.getMovieName());
        LOGGER.info(movieBooking.getTheatreCity());
        LOGGER.info(movieBooking.getTheatreName());
        LOGGER.info(movieBooking.getScreeningTime());
        LOGGER.info(movieBooking.getScreeningDate());
        LOGGER.info(Integer.toString(movieBooking.getNumSeats()));

        int bookedSeats = this.screeningService.getBookedSeats(movieBooking);
        int totalSeats = this.screeningService.getTotalSeats(movieBooking);

        if ((bookedSeats + movieBooking.getNumSeats()) > totalSeats)
            return "error";

        this.screeningService.bookSeats(movieBooking, bookedSeats + movieBooking.getNumSeats());

        return "result";
    }
}
