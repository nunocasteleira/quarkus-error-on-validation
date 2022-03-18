package org.acme.constraints;

import org.acme.CustomValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Constraint(validatedBy = { CustomValidator.class })
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomValidation {
    String message() default "This object failed validation.";

    Class<? extends Payload>[] payload() default {};

    Class<?>[] groups() default {};
}
