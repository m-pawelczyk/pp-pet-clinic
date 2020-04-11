package pro.pawelczyk.pppetclinic.model;

import java.io.Serializable;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 11.04.2020
 * created BaseEntity in pro.pawelczyk.pppetclinic.model
 * in project pp-pet-clinic
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
