package pro.pawelczyk.pppetclinic.model;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 11.04.2020
 * created PetType in pro.pawelczyk.pppetclinic.model
 * in project pp-pet-clinic
 */
public class PetType extends BaseEntity{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
