package org.example._02.services;

import org.example._02.entities.Edificio;
import org.example._02.exception.NotFoundException;
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

    public void saveEdificio(Edificio edificio) {
        ER.save(edificio);
        System.out.println("Edificio " + edificio.getId() + " salvato con successo!");
    }

    public Edificio findById(long id) {
        return ER.findById(id).orElseThrow(() -> new NotFoundException("Edificio non trovato..."));
    }

    public void findByIdAndDelete(long id) {
        Edificio found = ER.findById(id).orElseThrow(() -> new NotFoundException("Edificio non trovato..."));
        ER.delete(found);
        System.out.println("Edificio eliminato con successo!");

    }
}

