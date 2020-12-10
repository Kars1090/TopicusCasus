package nl.kars.topicuscasus.repository;

import nl.kars.topicuscasus.model.Verpakking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerpakkingRepository extends JpaRepository<Verpakking, Integer> {
}
