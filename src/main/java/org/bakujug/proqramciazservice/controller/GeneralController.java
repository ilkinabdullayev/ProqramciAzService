/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bakujug.proqramciazservice.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.bakujug.proqramciazservice.enums.UserRoleType;
import org.bakujug.proqramciazservice.processing.GeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Ilkin Abdullayev
 */
@Controller
@RequestMapping("/general/")
public class GeneralController {

    @Autowired
    private GeneralService generalService;

    @ResponseBody
    @RequestMapping(value = "/enum/roletype", method = RequestMethod.GET, produces = "application/json")
    public List<UserRoleType> getAllUserRoleTypes() {        
        return generalService.getUserRoleType();
    }

}
