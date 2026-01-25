package com.ProjectIRP.InstituteResourcePlanning.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @RequestMapping("/test-ims")
    public String greet() {
        return "IMS Working";
    }
}
