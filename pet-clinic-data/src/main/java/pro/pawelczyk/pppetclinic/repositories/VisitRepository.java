package pro.pawelczyk.pppetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pro.pawelczyk.pppetclinic.model.Visit;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 18.04.2020
 * created VisitRepository in pro.pawelczyk.pppetclinic.repositories
 * in project pp-pet-clinic
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
