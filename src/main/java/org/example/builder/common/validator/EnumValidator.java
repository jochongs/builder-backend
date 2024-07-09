package org.example.builder.common.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.example.builder.common.annotation.Enum;

import java.util.Arrays;

public class EnumValidator implements ConstraintValidator<Enum, java.lang.Enum> {

    private Enum annotation;

    @Override
    public void initialize(Enum constraintAnnotation) {
        this.annotation = constraintAnnotation;
    }

    @Override
    public boolean isValid(java.lang.Enum value, ConstraintValidatorContext constraintValidatorContext) {
        Object[] enumValues = this.annotation.target().getEnumConstants();
        if (enumValues == null || value == null) {
            return false;
        }

        return Arrays.asList(enumValues).contains(value);
    }
}
