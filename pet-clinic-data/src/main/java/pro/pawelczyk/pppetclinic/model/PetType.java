package pro.pawelczyk.pppetclinic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 11.04.2020
 * created PetType in pro.pawelczyk.pppetclinic.model
 * in project pp-pet-clinic
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "types")
public class PetType extends BaseEntity{

    @Column(name = "name")
    private String name;
}
