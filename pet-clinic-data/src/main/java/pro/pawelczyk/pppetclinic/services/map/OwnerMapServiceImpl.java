package pro.pawelczyk.pppetclinic.services.map;

import org.springframework.stereotype.Service;
import pro.pawelczyk.pppetclinic.model.Owner;
import pro.pawelczyk.pppetclinic.services.OwnerService;

import java.util.Set;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 13.04.2020
 * created OwnerMapServiceImpl in pro.pawelczyk.pppetclinic.services.map
 * in project pp-pet-clinic
 */
@Service
public class OwnerMapServiceImpl extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
