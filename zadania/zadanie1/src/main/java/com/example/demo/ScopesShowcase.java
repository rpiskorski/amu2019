package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ScopesShowcase {

    public static Logger logger = LoggerFactory.getLogger(ScopesShowcase.class);

    @Autowired
    private ApplicationContext context;

    @Autowired
    private SingletonBean singletonBean;

    @Autowired
    private PrototypeBean prototypeBean;

    @PostConstruct
    public void runShowcase(){
        logger.info("Singleton: "+singletonBean.toString());
        logger.info("Prototype: "+prototypeBean.toString());
        showcase();
        showcase();
/**    Podwojne wywolanie metody showcase powoduje utworzenie dwa razy obiektu PrototypeBean
       natomast tylko jeden raz SingletonBean
       Dziej sie tak dlatego ze scope SingletonBean to singleton czyli tworzona jest tylko jedna instancja
       tego beana w Springu, natomiast dla PrototypeBean scope to prototype co powoduje ze kazde odwolanie(wstrzykniecie)
       tworzy nowego beana tej klasy.

       WYNIK Z LOGGERA
       com.example.demo.SingletonBean@acdb094
       com.example.demo.PrototypeBean@2072acb2
       com.example.demo.SingletonBean@acdb094
       com.example.demo.PrototypeBean@50ecde95 **/
    }
    public void showcase(){
//
//        logger.info("Singleton: "+singletonBean.toString());
//        logger.info("Prototype: "+prototypeBean.toString());
        logger.info(getSingleton().toString());
        logger.info(getPrototype().toString());


    }

    public Object getSingleton(){
        return context.getBean(SingletonBean.class);
    }

    public Object getPrototype(){
        return context.getBean(PrototypeBean.class);
    }
}
