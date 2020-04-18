package pro.pawelczyk.pppetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pro.pawelczyk.pppetclinic.model.Pet;
import pro.pawelczyk.pppetclinic.repositories.PetRepository;
import pro.pawelczyk.pppetclinic.services.PetService;

import java.util.HashSet;
import java.util.Set;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 18.04.2020
 * created PetSDJpaServiceImpl in pro.pawelczyk.pppetclinic.services.springdatajpa
 * in project pp-pet-clinic
 */
@Service
@Profile("springdatajpa")
public class PetSDJpaServiceImpl implements PetService {

    private final PetRepository petRepository;

    public PetSDJpaServiceImpl(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Set<Pet> findAll() {

        Set<Pet> pets = new HashSet<>();

        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet findById(Long aLong) {
        return petRepository.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return petRepository.save(object);
    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petRepository.deleteById(aLong);
    }
}
