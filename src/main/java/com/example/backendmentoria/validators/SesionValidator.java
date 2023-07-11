package com.example.backendmentoria.validators;

import com.example.backendmentoria.exceptions.IncorrectResourceRequestException;
import com.example.backendmentoria.models.Sesion;

public class SesionValidator {

    public static void validate(Sesion sesion){

        if(sesion.getNombre() == null || sesion.getNombre().trim().isEmpty()) {
            throw new IncorrectResourceRequestException("El nombre es requerido");
        }

        if(sesion.getNombre().length() < 3) {
            throw new IncorrectResourceRequestException("El nombre debe ser mayor a 3 caracteres");
        }

        if(sesion.getLink() == null || sesion.getLink().trim().isEmpty()) {
            throw new IncorrectResourceRequestException("El link es requerido");
        }

        if(sesion.getLink().length() < 3) {
            throw new IncorrectResourceRequestException("El link debe ser mayor a 3 caracteres");
        }

        if(sesion.getAnotaciones() == null || sesion.getAnotaciones().trim().isEmpty()) {
            throw new IncorrectResourceRequestException("La anotación es requerida");
        }

        if(sesion.getAnotaciones().length() < 3) {
            throw new IncorrectResourceRequestException("La anotación debe ser mayor a 3 caracteres");
        }

    }

}
