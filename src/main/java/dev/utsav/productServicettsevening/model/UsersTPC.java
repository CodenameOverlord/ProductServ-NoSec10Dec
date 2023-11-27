package dev.utsav.productServicettsevening.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "users_tpc")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class UsersTPC {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String emailId;
}
