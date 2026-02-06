package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PrenotazioneRepository;

@Service
public class PrenotazioneService {
    private final PrenotazioneRepository PR;

    @Autowired
    public PrenotazioneService(PrenotazioneRepository PR) {
        this.PR = PR;
    }
    
}
