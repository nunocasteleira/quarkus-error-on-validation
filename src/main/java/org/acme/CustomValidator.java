package org.acme;

import org.acme.constraints.CustomValidation;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@ApplicationScoped
public class CustomValidator implements ConstraintValidator<CustomValidation, CustomDTO> {

    @Inject
    AppConfig appConfig;

    @Override public boolean isValid(CustomDTO customDTO, ConstraintValidatorContext constraintValidatorContext) {
        constraintValidatorContext.disableDefaultConstraintViolation();

        constraintValidatorContext
                .buildConstraintViolationWithTemplate("Error")
                .addConstraintViolation();

        return appConfig.featureToggle().featureShouldBeOffByDefault();
    }
}
