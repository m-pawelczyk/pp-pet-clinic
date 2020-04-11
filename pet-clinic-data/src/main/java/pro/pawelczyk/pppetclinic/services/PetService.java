package pro.pawelczyk.pppetclinic.services;

import pro.pawelczyk.pppetclinic.model.Pet;

import java.util.Set;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 11.04.2020
 * created PetService in pro.pawelczyk.pppetclinic.services
 * in project pp-pet-clinic
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
