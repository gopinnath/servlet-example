package org.gopinnath;

import javax.enterprise.context.SessionScoped;

@SessionScoped
public class GreetingServiceImpl implements GreetingService{

    @Override
    public String greet(String name) {
        return "Hello " + name;
    }
}
