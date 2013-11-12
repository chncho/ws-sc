package com.service.impl;

import com.service.WebServiceSample;

public class WebServiceSampleImpl implements WebServiceSample {

    public String say(String name) {
        return "Hello," + name;
    }
}