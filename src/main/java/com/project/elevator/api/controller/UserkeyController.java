package com.project.elevator.api.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.project.elevator.api.service.UserkeyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/userkey")
public class UserkeyController {
    @ Autowired
    private UserkeyService userkeyService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String generateUserKey(@RequestParam("userid") String userid) {
        
        String userkey = userkeyService.generateUserkey(userid);
        
        return userkey;
    }

}