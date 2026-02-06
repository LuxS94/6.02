package org.example._02.services;

import org.example._02.repository.EdificioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EdificioService {
    private final EdificioRepository ER;

    @Autowired
    public EdificioService(EdificioRepository ER) {
        this.ER = ER;
    }

}

