package com.awe.kz.web.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seats")
public class SeatsController {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(method = RequestMethod.GET)
    public String bookSeats(@RequestParam(value = "count", required = true) int seatCount, Model model) {
        model.addAttribute("count", seatCount);
        return "seats";
    }
}
