/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bakujug.proqramciazservice.controller;

import org.bakujug.proqramciazservice.dao.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Administrator
 */
@Controller
@RequestMapping("/welcome")
public class TestController {
    
    @Autowired
    private PostService postService;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String printWelcome(@PathVariable String name, ModelMap model) {

        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml", "Spring-Hibernate.xml");

        model.addAttribute("message", name);
        return "response";
    }

//    public PostService getPostService() {
//        return postService;
//    }
//
//    public void setPostService(PostService postService) {
//        this.postService = postService;
//    }    

}
