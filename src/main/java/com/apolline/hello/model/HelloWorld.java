package com.apolline.hello.model;

import com.apolline.hello.service.LivreService;

public class HelloWorld {

    private String value;
    private LivreService livreService;

    private String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "'" + value + "'";
    }
}
