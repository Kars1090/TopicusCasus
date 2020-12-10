package nl.kars.topicuscasus.Service;

import nl.kars.topicuscasus.model.Verpakking;
import nl.kars.topicuscasus.repository.VerpakkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VerpakkingService {

    @Autowired
    private VerpakkingRepository verpakkingRepository;

    public List<Verpakking> getVerpakkingen() {
        return verpakkingRepository.findAll();
    }
}
