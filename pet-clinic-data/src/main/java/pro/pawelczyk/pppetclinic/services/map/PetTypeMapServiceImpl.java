package pro.pawelczyk.pppetclinic.services.map;

import org.springframework.stereotype.Service;
import pro.pawelczyk.pppetclinic.model.PetType;
import pro.pawelczyk.pppetclinic.services.PetTypeService;

import java.util.Set;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 16.04.2020
 * created PetTypeMapService in pro.pawelczyk.pppetclinic.services.map
 * in project pp-pet-clinic
 */
@Service
public class PetTypeMapServiceImpl extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}
