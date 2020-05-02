package pro.pawelczyk.pppetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pro.pawelczyk.pppetclinic.model.Owner;
import pro.pawelczyk.pppetclinic.repositories.OwnerReporitory;
import pro.pawelczyk.pppetclinic.repositories.PetRepository;
import pro.pawelczyk.pppetclinic.repositories.PetTypeRepository;
import pro.pawelczyk.pppetclinic.services.OwnerService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 18.04.2020
 * created OwnerSDJpaService in pro.pawelczyk.pppetclinic.services.springdatajpa
 * in project pp-pet-clinic
 */
@Service
@Profile("springdatajpa")
public class OwnerSDJpaServiceImpl implements OwnerService {

    private final OwnerReporitory ownerReporitory;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public OwnerSDJpaServiceImpl(OwnerReporitory ownerReporitory, PetRepository petRepository,
                                 PetTypeRepository petTypeRepository) {
        this.ownerReporitory = ownerReporitory;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerReporitory.findByLastName(lastName);
    }

    @Override
    public List<Owner> findAllByLastNameLike(String lastName) {
        return ownerReporitory.findAllByLastNameLike(lastName);
    }

    @Override
    public Set<Owner> findAll() {

        Set<Owner> owners = new HashSet<>();

        ownerReporitory.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerReporitory.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerReporitory.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerReporitory.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerReporitory.deleteById(aLong);
    }
}
