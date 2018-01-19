package com.dimkonko.apirepo;

public class WgException extends Exception {

    public WgException(String msg, Exception e) {
        super(msg, e);
    }
}
