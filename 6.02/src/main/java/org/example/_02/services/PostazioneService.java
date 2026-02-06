package org.example._02.services;

import org.example._02.repository.PostazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostazioneService {
    private final PostazioneRepository PR;

    @Autowired
    public PostazioneService(PostazioneRepository PR) {
        this.PR = PR;
    }


}

