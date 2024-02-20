package org.example.helper.impl;

import org.example.helper.api.Helper;

public class HelperImpl1 implements Helper {


    public String getHelp(int count) {
        System.out.println("In getHelper in HelperImpl1");
        return String.valueOf(count * 2);
    }

}    
