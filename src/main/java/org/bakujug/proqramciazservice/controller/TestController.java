/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bakujug.proqramciazservice.controller;

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

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String printWelcome(@PathVariable String name, ModelMap model) {
        model.addAttribute("message", name);
        return "response";
    }

}
