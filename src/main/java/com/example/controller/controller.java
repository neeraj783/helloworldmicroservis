package com.example.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@Api(value="Hello world controller", description=" This is hello world controller")
@RequestMapping("example/")
public class controller {
    @ApiOperation(value="This Method return hello world ")

    @RequestMapping("/helloworld")
    public String helloworld(@RequestBody final String hello){
        return"hello world";
    }
    @ApiOperation(value="This Method for post add operation ")

    @RequestMapping("/Add")
    public int add(@RequestBody final String add){
int a=6;
int b=7;
return a+b;
}
    @ApiOperation(value="This Method for post multiple operation ")
@RequestMapping("/multiple")
    public int multiple(@RequestBody final String multiple){

        int a=5;
        int b=6;
        return a*b;
}


}
