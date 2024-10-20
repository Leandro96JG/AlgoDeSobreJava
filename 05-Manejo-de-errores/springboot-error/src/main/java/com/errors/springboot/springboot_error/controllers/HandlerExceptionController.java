package com.errors.springboot.springboot_error.controllers;


import com.errors.springboot.springboot_error.exceptions.UserNotFoundException;
import com.errors.springboot.springboot_error.models.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.util.Date;

@RestControllerAdvice
public class HandlerExceptionController {

    //Errores Globales usando la clase error creada por nosotros
    //Qué tipo de error vamos a manejar
    //Las llaves son para cuando queres controlar varios tipos de errores, aca no hace falta pero para recordar
    @ExceptionHandler({ArithmeticException.class})
    public ResponseEntity<Error> divisionByZero(Exception e){
        Error error = new Error();
        error.setDate(new Date());
        error.setError("Error de calculo en el servidor");
        error.setMessage(e.getMessage());
        error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());


        // internalServerError por que es el tipo de error (sale en postman)
//        return ResponseEntity.internalServerError().body(error);

        //* Otra forma de retornar el error
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(error);
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<?> notFoundEx(NoHandlerFoundException e){

        Error error = new Error();
        error.setDate(new Date());
        error.setError("Api rest no encontrada");
        error.setMessage(e.getMessage());
        error.setStatus(HttpStatus.NOT_FOUND.value());

        //notFound() no tiene body
        //Se busca el tipo de error con el número de status
        return ResponseEntity.status(HttpStatus.NOT_FOUND.value()).body(error);
    }

    @ExceptionHandler({HttpMessageNotWritableException.class, UserNotFoundException.class})
    public ResponseEntity<?> notWriteExc(Exception e){
        Error error = new Error();
        error.setDate(new Date());
        error.setError("Usuario o Rol no encontrado");
        error.setMessage(e.getMessage().toString());
        error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(error);
    }

}
