package pro.pawelczyk.pppetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pro.pawelczyk.pppetclinic.model.Vet;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 18.04.2020
 * created VetRepository in pro.pawelczyk.pppetclinic.repositories
 * in project pp-pet-clinic
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
