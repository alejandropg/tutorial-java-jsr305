package com.autentia.tutorial.jsr305;

class Client {

    private final Service service =  new Service();

    void main() {
        service.doSomethingWith(null);

        final String s1 = service.returnSomethingNotNull();
        final String st1  = s1.trim();

        final String s2 = service.returnAlwaysNull();
        final String st2  = s2.trim();
    }
}
