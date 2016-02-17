/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.swing2explore.views;

import com.mycompany.swing2explore.entities.MPerson;
import com.mycompany.swing2explore.service.PersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author juang
 */
@Controller("personViewController")
public class PersonView {

    @Autowired
    private PersonService personService;

    public List<MPerson> personView() {
        List<MPerson> listPersons = personService.listPersons();

        for (MPerson mPerson : listPersons) {
            System.out.println("mPerson.getId :" + mPerson.getId());
            System.out.println("mPerson.getName :" + mPerson.getName());
            System.out.println("mPerson.getAddress :" + mPerson.getAddress());
            System.out.println("+---------------------------------------+");
        }
        return listPersons;
    }
    
    public void pesan(String s){
        personService.msg(s);
    }
    


}
