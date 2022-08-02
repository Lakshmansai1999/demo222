package com.user.custom.annotation.validators;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(value = { ElementType.FIELD, ElementType.PARAMETER })
@Constraint(validatedBy = CustomDateValidator.class)
public @interface ValidDate {
	// error message
		public String message() default "{invalid.date}";

		// represents group of constraints
		public Class<?>[] groups() default {};

		// represents additional information about annotation
		public Class<? extends Payload>[] payload() default {};
}
