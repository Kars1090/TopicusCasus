package nl.kars.topicuscasus.repository;

import nl.kars.topicuscasus.model.Medicijn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicijnRepository extends JpaRepository<Medicijn, String> {
}
