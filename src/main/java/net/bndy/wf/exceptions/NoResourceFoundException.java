/*******************************************************************************
 * Copyright (C) 2017 http://bndy.net
 * Created by Bendy (Bing Zhang)
 ******************************************************************************/
package net.bndy.wf.exceptions;

public class NoResourceFoundException extends AppException {

    private static final long serialVersionUID = 1L;

    public NoResourceFoundException() {
        super("error.msgNoResourceFound");
    }

    public NoResourceFoundException(String resourceName) {
        super(resourceName);
    }
}