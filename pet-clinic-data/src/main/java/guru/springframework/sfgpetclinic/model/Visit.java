package guru.springframework.sfgpetclinic.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Created by jt on 7/29/18.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity {

    @Column(name = "date")
    private LocalDate date;
    @Column(name = "description")
    private String description;
    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;
}
