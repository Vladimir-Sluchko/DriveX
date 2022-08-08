package com.DriveX.user_security.service.dto.error;

public class SingleError {
    private final String logref = "error";
    private String message;

    public SingleError(String message) {
        this.message = message;
    }

    public SingleError() {
    }

    public String getLogref() {
        return logref;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
