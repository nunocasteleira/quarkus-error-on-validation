package org.acme;

import lombok.Data;
import org.acme.constraints.CustomValidation;

@Data
@CustomValidation
public class CustomDTO {
    String name;
    String id;
}
