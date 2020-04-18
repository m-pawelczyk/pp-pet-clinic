package pro.pawelczyk.pppetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pro.pawelczyk.pppetclinic.model.PetType;
import pro.pawelczyk.pppetclinic.repositories.PetTypeRepository;
import pro.pawelczyk.pppetclinic.services.PetTypeService;

import java.util.HashSet;
import java.util.Set;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 18.04.2020
 * created PetTypeSDJpaServiceImpl in pro.pawelczyk.pppetclinic.services.springdatajpa
 * in project pp-pet-clinic
 */
@Service
@Profile("springdatajpa")
public class PetTypeSDJpaServiceImpl implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    public PetTypeSDJpaServiceImpl(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> findAll() {

        Set<PetType> petTypes = new HashSet<>();

        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findById(Long aLong) {
        return petTypeRepository.findById(aLong).orElse(null);
    }

    @Override
    public PetType save(PetType object) {
        return petTypeRepository.save(object);
    }

    @Override
    public void delete(PetType object) {
        petTypeRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petTypeRepository.deleteById(aLong);
    }
}
