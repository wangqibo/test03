package com.service.controller;

import com.service.model.Person;

import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringCodegen", date = "2017-11-17T14:08:42.472Z")

@RestSchema(schemaId = "test03")
@RequestMapping(path = "/wang03", produces = MediaType.APPLICATION_JSON)
public class Test03Impl {

    @Autowired
    private Test03Delegate userTest03Delegate;


    @RequestMapping(value = "/add",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public Integer add( @RequestParam(value = "a", required = true) Integer a, @RequestParam(value = "b", required = true) Integer b){

        return userTest03Delegate.add(a, b);
    }


    @RequestMapping(value = "/sayhei",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String sayHei( @RequestHeader(value="name", required=true) String name){

        return userTest03Delegate.sayHei(name);
    }


    @RequestMapping(value = "/sayhello/{name}",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    public String sayHello( @PathVariable("name") String name){

        return userTest03Delegate.sayHello(name);
    }


    @RequestMapping(value = "/sayhi",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String sayHi( @RequestParam(value = "name", required = true) String name){

        return userTest03Delegate.sayHi(name);
    }


    @RequestMapping(value = "/saysomething",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    public String saySomething( @RequestParam(value = "prefix", required = true) String prefix, @RequestBody Person user){

        return userTest03Delegate.saySomething(prefix, user);
    }

}
