package pro.pawelczyk.pppetclinic.services;

import java.util.Set;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 13.04.2020
 * created CrudService in pro.pawelczyk.pppetclinic.services
 * in project pp-pet-clinic
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteByID(ID id);
}
