package guru.springframework.sfgpetclinic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
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
@MappedSuperclass
public class Person extends BaseEntity {

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;


}
