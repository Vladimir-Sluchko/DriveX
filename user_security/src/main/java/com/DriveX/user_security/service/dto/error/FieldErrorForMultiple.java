package com.DriveX.user_security.service.dto.error;

public class FieldErrorForMultiple {
    private String field;
    private String message;


    public FieldErrorForMultiple(String field, String message) {
        this.field = field;
        this.message = message;
    }

    public FieldErrorForMultiple() {
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
