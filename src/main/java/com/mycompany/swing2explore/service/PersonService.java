/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.swing2explore.service;

import com.mycompany.swing2explore.entities.MPerson;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author juang
 */
@Component
public interface PersonService {
    List<MPerson> listPersons();
    void msg(String s);
}
