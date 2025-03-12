package com.apolline.hello.model;

public class HelloWorld {
    private String value;
    private String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "value='" + value + '\'' +
                '}';
    }
}
