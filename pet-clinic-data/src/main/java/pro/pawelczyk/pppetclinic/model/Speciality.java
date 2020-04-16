package pro.pawelczyk.pppetclinic.model;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 16.04.2020
 * created Speciality in pro.pawelczyk.pppetclinic.model
 * in project pp-pet-clinic
 */
public class Speciality extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
