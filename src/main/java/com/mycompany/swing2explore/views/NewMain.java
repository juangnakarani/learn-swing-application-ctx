/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.swing2explore.views;

import com.mycompany.swing2explore.config.PersistenceJPAConfig;
import com.mycompany.swing2explore.entities.MPerson;
import com.mycompany.swing2explore.service.PersonService;
import java.util.List;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author juang
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ctx = new AnnotationConfigApplicationContext(PersistenceJPAConfig.class);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(PersistenceJPAConfig.class);
        //ctx.scan("com.mycompany.swing2explore");
        ctx.refresh();
        System.out.println("main is ok");
        // TODO code application logic here
        PersonView personView = ctx.getBean("personViewController", PersonView.class);
        personView.personView();
        personView.pesan("ini adalah pesan untuk service");
    }

}
