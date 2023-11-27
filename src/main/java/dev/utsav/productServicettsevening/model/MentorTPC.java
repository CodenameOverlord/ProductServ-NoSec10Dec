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
@Entity(name = "mentor_tpc")
public class MentorTPC
        extends UsersTPC
{
    private Integer session;
}
