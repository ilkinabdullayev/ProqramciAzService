/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bakujug.proqramciazservice.controller;

import org.bakujug.proqramciazservice.beans.Taxonomy;
import org.bakujug.proqramciazservice.dao.PostService;
import org.bakujug.proqramciazservice.dao.TaxonomyService;
import org.bakujug.proqramciazservice.enums.TaxonomyType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Administrator
 */
@Controller
@RequestMapping("/welcome")
public class TestController {
    
    @Autowired
    private TaxonomyService taxonomyService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET,produces="text/plain")
    public @ResponseBody String printWelcome(@PathVariable int id) {
        
        Taxonomy taxonomy=new Taxonomy();
        taxonomy.setName("Java");
        taxonomy.setTaxonomyType(TaxonomyType.CATEGORY);
        
        taxonomyService.save(taxonomy);       
        return taxonomy.toString();
    }
    
}
