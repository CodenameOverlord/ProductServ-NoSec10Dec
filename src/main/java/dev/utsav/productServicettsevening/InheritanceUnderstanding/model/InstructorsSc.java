package dev.utsav.productServicettsevening.InheritanceUnderstanding.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "instuctor_sc")
@DiscriminatorValue(value = "2")
public class InstructorsSc
        extends UsersSC
{
    private Boolean isHandsome;
}
