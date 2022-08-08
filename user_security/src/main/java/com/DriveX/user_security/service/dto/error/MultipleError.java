package com.DriveX.user_security.service.dto.error;

import java.util.List;

public class MultipleError {
    private final String logref = "structured_error";
    private List<FieldErrorForMultiple> errors;

    public MultipleError() {
    }

    public MultipleError(List<FieldErrorForMultiple> errors) {
        this.errors = errors;
    }

    public String getLogref() {
        return logref;
    }

    public List<FieldErrorForMultiple> getErrors() {
        return errors;
    }

    public void setErrors(List<FieldErrorForMultiple> errors) {
        this.errors = errors;
    }
}
