package pro.pawelczyk.pppetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pro.pawelczyk.pppetclinic.model.Visit;
import pro.pawelczyk.pppetclinic.repositories.VisitRepository;
import pro.pawelczyk.pppetclinic.services.VisitService;

import java.util.HashSet;
import java.util.Set;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 19.04.2020
 * created VisitSDJpaServiceImpl in pro.pawelczyk.pppetclinic.services.springdatajpa
 * in project pp-pet-clinic
 */
@Service
@Profile("springdatajpa")
public class VisitSDJpaServiceImpl implements VisitService {

    private final VisitRepository visitRepository;

    public VisitSDJpaServiceImpl(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {

        Set<Visit> visits = new HashSet<>();

        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }
}
