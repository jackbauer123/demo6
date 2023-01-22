package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RequestController {

    private static final Logger log = LoggerFactory.getLogger(RequestController.class);

    @Autowired
    HandleService handleService;

    @RequestMapping(value = "/demo2/save", method = RequestMethod.GET)
    public String save() {
        log.info("demo6 request....");
        handleService.save();
        return "demo2 save";
    }
}
