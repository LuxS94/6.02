package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PostazioneRepository;

@Service
public class PostazioneService {
    private final PostazioneRepository PR;

    @Autowired
    public PostazioneService(PostazioneRepository PR) {
        this.PR = PR;
    }


}

