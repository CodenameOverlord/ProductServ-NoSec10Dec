package dev.utsav.productServicettsevening.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Entity(name = "category")
public class Category
        extends BaseModel
{
    private String name;
    private String desc;
    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
