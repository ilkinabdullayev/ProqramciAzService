/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bakujug.proqramciazservice.processing;

import java.util.Arrays;
import java.util.List;
import org.bakujug.proqramciazservice.enums.UserRoleType;
import org.springframework.stereotype.Component;

/**
 *
 * @author Ilkin Abdullayev
 */
@Component
public class GeneralService {

    public List<UserRoleType> getUserRoleType() {
        return Arrays.asList(UserRoleType.values());
    }

}
