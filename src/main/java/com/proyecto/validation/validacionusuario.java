package com.proyecto.validation;
import com.proyecto.dominio.repository.AsignatureRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExistByUsernameValidation implements ConstraintValidator<ExistByUsername, String> {

    @Autowired
    private UserRepository repository;

    @Override
    public boolean isValid(String username, ConstraintValidatorContext context) {
        if (repository == null ){

            return true;
        }
        return !repository.existsByUsername(username);
    }
}