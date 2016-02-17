/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.swing2explore.service.impl;

import com.mycompany.swing2explore.entities.MPerson;
import com.mycompany.swing2explore.repository.PersonRepository;
import com.mycompany.swing2explore.service.PersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author juang
 */
@Component
@Service
public class PersonServiceImpl implements PersonService{
    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<MPerson> listPersons() {
        List<MPerson> mPersons = personRepository.listPersons();
        return mPersons;
    }

    @Override
    public void msg(String s) {
        System.out.println("pesan :" + s);
    }
    
}
