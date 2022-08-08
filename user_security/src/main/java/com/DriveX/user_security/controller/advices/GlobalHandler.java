package com.DriveX.user_security.controller.advices;

import com.DriveX.user_security.service.dto.error.FieldErrorForMultiple;
import com.DriveX.user_security.service.dto.error.MultipleError;
import com.DriveX.user_security.service.dto.error.SingleError;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestControllerAdvice
public class GlobalHandler {
    private static final String FIELD = "Field ";

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public List<SingleError> handle(HttpMessageNotReadableException e){
        List<SingleError> errors = new ArrayList<>();
        errors.add(new SingleError(e.getMessage()));
        return errors;
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public List<SingleError> handle(EntityExistsException e){
        List<SingleError> errors = new ArrayList<>();
        errors.add(new SingleError(e.getMessage()));
        return errors;
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public List<SingleError> handle(SecurityException e){
        List<SingleError> errors = new ArrayList<>();
        errors.add(new SingleError(e.getMessage()));
        return errors;
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public List<SingleError> handle(EntityNotFoundException e){
        List<SingleError> errors = new ArrayList<>();
        errors.add(new SingleError(e.getMessage()));
        return errors;
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public List<SingleError> handle(Exception e){
        List<SingleError> errors = new ArrayList<>();
        errors.add(new SingleError(e.getMessage()));
        return errors;
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public List<MultipleError> handle(ConstraintViolationException e){
        List<MultipleError> multipleErrors = new ArrayList<>();
        List<FieldErrorForMultiple> fieldErrorForMultiples = new ArrayList<>();
        Set<ConstraintViolation<?>> set = e.getConstraintViolations();
            for (ConstraintViolation<?> constraintViolation : set) {
                String s = constraintViolation.getPropertyPath().toString();
                fieldErrorForMultiples.add(new FieldErrorForMultiple((FIELD + s.substring(s.lastIndexOf(".") + 1))
                        ,constraintViolation.getMessage()));
            }
            multipleErrors.add(new MultipleError(fieldErrorForMultiples));
        return multipleErrors;
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public List<MultipleError> handle(MethodArgumentNotValidException e) {
        List<MultipleError> multipleErrors = new ArrayList<>();
        List<FieldErrorForMultiple> fieldErrorForMultiples = new ArrayList<>();
        List<ObjectError> allErrors = e.getBindingResult().getAllErrors();
        for (ObjectError allError : allErrors) {
            String field = ((FieldError) allError).getField();
            fieldErrorForMultiples.add(new FieldErrorForMultiple(field
                    ,allError.getDefaultMessage()));
        }
        multipleErrors.add(new MultipleError(fieldErrorForMultiples));
        return multipleErrors;
    }
}
