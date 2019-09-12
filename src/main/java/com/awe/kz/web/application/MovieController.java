package com.awe.kz.web.application;

import com.awe.kz.business.domain.MovieScreening;
import com.awe.kz.business.service.impl.ScreeningService;
import com.awe.kz.data.entity.Movie;
import com.awe.kz.data.repository.MovieRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

@RestController
@Controller
@RequestMapping("/movies")
public class MovieController {
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ScreeningService screeningService;
    @Autowired
    private MovieRepository movieRepository;

    @RequestMapping(method = RequestMethod.GET)
    public String getMovies(@RequestParam(value = "date", required = false)String dateString, Model model) {
        Date date = null;
        if (dateString != null) {
            try {
                date = DATE_FORMAT.parse(dateString);

            } catch (ParseException pe) {
                date = new Date();
            }
        } else {
            date = new Date();
        }

        Set<Movie> result = this.screeningService.getMoviesByDate(date);
        model.addAttribute("movies", result);
        model.addAttribute("movieBooking", new MovieScreening());
        return "movies";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/all", produces = "application/json")
    public List<Movie> getAllMovies() {
        return (List<Movie>) movieRepository.findAll();
    }
}
