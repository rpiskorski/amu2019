package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class SingletonBean {
}
/**
 Adnotacja nie jest konieczna bo domyslnie scope to wlasnie singleton
 **/