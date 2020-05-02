package pro.pawelczyk.pppetclinic.services;

import pro.pawelczyk.pppetclinic.model.Owner;

import java.util.List;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 11.04.2020
 * created OwnerService in pro.pawelczyk.pppetclinic.services
 * in project pp-pet-clinic
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
