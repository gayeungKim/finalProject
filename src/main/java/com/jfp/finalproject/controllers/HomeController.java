package com.jfp.finalproject.controllers;

import com.jfp.finalproject.daos.HomeDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;

@Controller
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getHome() throws SQLException, ClassNotFoundException {
        ModelAndView modelAndView = new ModelAndView("/home");
        HomeDao homeDao = new HomeDao();
        int test = homeDao.testDaoClass(1);
        System.out.println("test");
        System.out.println(test);

        return modelAndView;
    }
}
