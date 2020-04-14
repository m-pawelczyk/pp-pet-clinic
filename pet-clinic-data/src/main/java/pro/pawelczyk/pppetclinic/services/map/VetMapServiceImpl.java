package pro.pawelczyk.pppetclinic.services.map;

import pro.pawelczyk.pppetclinic.model.Vet;
import pro.pawelczyk.pppetclinic.services.VetService;

import java.util.Set;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 13.04.2020
 * created VetMapServiceImpl in pro.pawelczyk.pppetclinic.services.map
 * in project pp-pet-clinic
 */
public class VetMapServiceImpl extends AbstractMapService<Vet, Long> implements VetService {
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
        return super.save(object.getId(), object);
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
