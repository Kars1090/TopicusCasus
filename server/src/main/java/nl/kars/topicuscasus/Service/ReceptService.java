package nl.kars.topicuscasus.Service;

import nl.kars.topicuscasus.model.Recept;
import nl.kars.topicuscasus.repository.ReceptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ReceptService {

    @Autowired
    private ReceptRepository receptRepository;

    @Autowired
    private VerpakkingService verpakkingService;

    public List<Recept> getRecepten() {
        return receptRepository.findAll();
    }

    @Transactional
    public Recept saveRecept(Recept recept) {
        return receptRepository.save(recept);
    }
}
