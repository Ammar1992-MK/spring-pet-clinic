package guru.springframework.sfgpetclinic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by jt on 7/29/18.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "specialties")
public class Speciality extends BaseEntity {
    @Column(name = "description")
    private String description;
}
