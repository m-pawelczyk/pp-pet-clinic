package pro.pawelczyk.pppetclinic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 16.04.2020
 * created Speciality in pro.pawelczyk.pppetclinic.model
 * in project pp-pet-clinic
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity {

    @Column(name = "description")
    private String description;
}
