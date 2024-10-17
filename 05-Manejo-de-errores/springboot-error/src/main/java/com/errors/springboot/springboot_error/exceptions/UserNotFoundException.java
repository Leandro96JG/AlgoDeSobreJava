package com.errors.springboot.springboot_error.exceptions;


//Error Personalizado, recibe el msje donde instanciamos nuestra excepcion y lo manda a la excepcion padre
public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message){
        super(message);
    }
}
