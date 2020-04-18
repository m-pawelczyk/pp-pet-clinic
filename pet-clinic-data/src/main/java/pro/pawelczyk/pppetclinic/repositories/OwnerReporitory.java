package pro.pawelczyk.pppetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pro.pawelczyk.pppetclinic.model.Owner;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 18.04.2020
 * created OwnerReporitory in pro.pawelczyk.pppetclinic.repositories
 * in project pp-pet-clinic
 */
public interface OwnerReporitory extends CrudRepository<Owner, Long> {
}
