package com.autentia.tutorial.jsr305;

import javax.annotation.Nullable;

class Service {

    void doSomethingWith(String parameter) {
        if (parameter == null)
            return;

        final String st = parameter.trim();
    }

    String returnSomethingNotNull() {
        return null;
    }

    @Nullable
    String returnAlwaysNull() {
        final String s = null;
        s.toUpperCase();
        return null;
    }

}
