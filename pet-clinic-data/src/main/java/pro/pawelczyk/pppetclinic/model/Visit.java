package pro.pawelczyk.pppetclinic.model;

import java.time.LocalDate;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 16.04.2020
 * created Visit in pro.pawelczyk.pppetclinic.model
 * in project pp-pet-clinic
 */
public class Visit extends BaseEntity {

    private LocalDate localDate;
    private String description;
    private Pet pet;

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
