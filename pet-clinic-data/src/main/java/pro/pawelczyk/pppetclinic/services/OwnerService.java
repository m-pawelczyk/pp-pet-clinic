package pro.pawelczyk.pppetclinic.services;

import pro.pawelczyk.pppetclinic.model.Owner;

import java.util.Set;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 11.04.2020
 * created OwnerService in pro.pawelczyk.pppetclinic.services
 * in project pp-pet-clinic
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
