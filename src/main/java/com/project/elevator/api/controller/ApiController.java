package com.project.elevator.api.controller;

import com.project.elevator.api.service.CaseService;
import com.project.elevator.api.utils.JsonStringConverterUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@EnableAutoConfiguration
@RequestMapping("/api")
public class ApiController {
    @Autowired
    private CaseService caseService;


    @RequestMapping(value = "/case/{timeCount}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String getCase(@PathVariable int timeCount) {
        return caseService.getJsonById(timeCount);
    }

    @RequestMapping(value = "/action", method = RequestMethod.POST)
    @ResponseBody
    public void addAction(@RequestParam("json") String json){
        System.out.println(json);
    }
}
