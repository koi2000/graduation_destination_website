package com.sdu.graduate.controller;

import com.sdu.graduate.common.annotations.ApiResponseBody;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author koi
 * @date 2023/2/25 21:54
 */

@Controller
@RequestMapping("/data")
public class DataController {

    @GetMapping("/test")
    @ApiResponseBody
    public String query() {
        return "Hello World";
    }

    @GetMapping("/addBachelor")
    @ApiResponseBody
    public String addBachelor() {

    }


    @GetMapping("/addBachelor")
    @ApiResponseBody
    public String addBachelor() {

    }

    @GetMapping("/batchAddBachelor")
    @ApiResponseBody
    public String batchAddBachelor() {

    }

    @GetMapping("/addMaster")
    @ApiResponseBody
    public String addMaster() {

    }

    @GetMapping("/batchAddMaster")
    @ApiResponseBody
    public String batchAddMaster() {

    }
}
