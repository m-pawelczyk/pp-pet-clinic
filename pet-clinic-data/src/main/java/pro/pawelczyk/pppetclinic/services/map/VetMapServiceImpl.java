package pro.pawelczyk.pppetclinic.services.map;

import org.springframework.stereotype.Service;
import pro.pawelczyk.pppetclinic.model.Speciality;
import pro.pawelczyk.pppetclinic.model.Vet;
import pro.pawelczyk.pppetclinic.services.SpecialityService;
import pro.pawelczyk.pppetclinic.services.VetService;

import java.util.Set;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 13.04.2020
 * created VetMapServiceImpl in pro.pawelczyk.pppetclinic.services.map
 * in project pp-pet-clinic
 */
@Service
public class VetMapServiceImpl extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialityService specialityService;

    public VetMapServiceImpl(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {

        if (object.getSpecialities().size() > 0) {
            object.getSpecialities().forEach(speciality -> {
                if (object.getId() == null) {
                    Speciality savedSpeciality = specialityService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }

        return super.save(object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }
}
