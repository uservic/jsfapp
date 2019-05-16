package com.victest.classes;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "HelloClass", eager = true)
public class HelloClass {

    private String linkToSecond = "second.xhtml";

    public String getMessage() {
        return linkToSecond;
    }
}
