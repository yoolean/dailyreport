package com.artofcode.dailyreport.web.conroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by harchen on 8/28/2015.
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {
    @RequestMapping(method = GET)
    public String home() {
        return "home";
    }
}
