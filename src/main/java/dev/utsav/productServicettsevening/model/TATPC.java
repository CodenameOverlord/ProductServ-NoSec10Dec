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
@Entity(name = "ta_tpc")
public class TATPC
        extends UsersTPC
{
    private Double averageRating;

}
