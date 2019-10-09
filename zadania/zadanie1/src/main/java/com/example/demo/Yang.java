package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Yang {

    public static Logger logger = LoggerFactory.getLogger(Yang.class);

    @Autowired
    private Ying ying;

//    @Autowired
//    public Yang(Ying ying) {
//    }
//
    @Autowired
    public void setYing(Ying ying) {
        this.ying = ying;
        logger.info("Ying has been injected!");
    }
}

/**
 * Uzywajac adnotacji na setterach i polach aplikacja uruchamia sie.
 * W przypadku zastosowania adnotacji na konstruktorze otrzymujemy blad o tresci
 * The dependencies of some of the beans in the application context form a cycle:
 * dzieje sie tak gdyz przy uzyciu kontruktora wstrzykniecie nastepuje od razu, automatycznie
 * dlatego wystepuje pewnego rodzaju 'zakleszczenie' (cykl)
 * W przypadku adnotacji na setterach/polach wstrzykniecie nastepuje w momencie gdy jest potrzebne
 * tj. np. przy uzyciu settera.
 **/