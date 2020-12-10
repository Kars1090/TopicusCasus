package nl.kars.topicuscasus.repository;

import nl.kars.topicuscasus.model.Recept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceptRepository extends JpaRepository<Recept, Integer> {
}
