package dev.utsav.productServicettsevening.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "instuctor_tpc")
public class InstructorsTPC
        extends UsersTPC
{
    private Boolean isHandsome;
}
