package pro.pawelczyk.pppetclinic.services.map;

import pro.pawelczyk.pppetclinic.model.Visit;
import pro.pawelczyk.pppetclinic.services.VisitService;

import java.util.Set;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 19.04.2020
 * created VisitMapServiceImpl in pro.pawelczyk.pppetclinic.services.map
 * in project pp-pet-clinic
 */
public class VisitMapServiceImpl extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit visit) {

        if(visit.getPet() == null
                || visit.getPet().getOwner() == null
                || visit.getPet().getId() == null
                || visit.getPet().getOwner().getId() == null){
            throw new RuntimeException("Invalid Visit");
        }

        return super.save(visit);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
