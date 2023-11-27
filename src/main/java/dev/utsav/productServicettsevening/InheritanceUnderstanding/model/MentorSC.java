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
@Entity(name = "mentor_sc")
@DiscriminatorValue(value = "1")
public class MentorSC
        extends UsersSC
{
    private Integer session;
}
