package peaksoft.repo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.parser.Entity;

@Repository
@RequiredArgsConstructor
@Transactional
public class StudentRepository implements StudentRepo{
    @PersistenceContext
    private final EntityManager entityManager;

    @Override

    public String findAll() {
    }
}
