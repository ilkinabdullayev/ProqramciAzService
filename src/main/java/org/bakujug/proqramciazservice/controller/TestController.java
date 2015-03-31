/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bakujug.proqramciazservice.controller;

import java.util.List;
import org.bakujug.proqramciazservice.beans.Taxonomy;
import org.bakujug.proqramciazservice.dao.TaxonomyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/xml")
    public Taxonomy printWelcome(@PathVariable int id) {
        return taxonomyService.getTaxonomy(id);
    }

    @ResponseBody
    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET, produces = "application/xml")
    public List<Taxonomy> printWelcome2(@PathVariable int id) {
        return taxonomyService.getAllTaxonomy();
    }

}
