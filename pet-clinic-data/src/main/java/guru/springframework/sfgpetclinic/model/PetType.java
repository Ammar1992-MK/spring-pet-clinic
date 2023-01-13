package guru.springframework.sfgpetclinic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by jt on 7/13/18.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "types")
public class PetType extends BaseEntity {
    @Column(name = "name")
    private String name;
}
