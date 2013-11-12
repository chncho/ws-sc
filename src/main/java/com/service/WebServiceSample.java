package com.service;

import javax.jws.WebService;

@WebService()
public interface WebServiceSample {
    String say(String name);

}