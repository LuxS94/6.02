package org.example._02.services;

import org.example._02.entities.Prenotazione;
import org.example._02.exception.AlreadyReserved;
import org.example._02.exception.MaxReservations;
import org.example._02.exception.NotFoundException;
import org.example._02.repository.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrenotazioneService {
    private final PrenotazioneRepository PR;

    @Autowired
    public PrenotazioneService(PrenotazioneRepository PR) {
        this.PR = PR;
    }

    public void savePrenotazione(Prenotazione nPrenotazione) {
        if (PR.existsByDataAndPostazione(nPrenotazione.getData(), nPrenotazione.getPostazione())) {
            throw new AlreadyReserved("La postazione " + nPrenotazione.getPostazione() + " non è disponibile per la data " + nPrenotazione.getData() + ";");
        }
        ;
        if (PR.existsByDataAndUtente(nPrenotazione.getData(), nPrenotazione.getUtente())) {
            throw new MaxReservations("L'utente " + nPrenotazione.getUtente() + " ha raggiunto il massimo di prenotazioni per la data " + nPrenotazione.getData() + ";");
        }
        this.PR.save(nPrenotazione);
        System.out.println("La prenotazione " + nPrenotazione.getId() + " è stata salvata con successo!");
    }

    public Prenotazione findById(long id) {
        return PR.findById(id).orElseThrow(() -> new NotFoundException("Prenotazione non trovata..."));
    }

    public void findByIdAndDelete(long id) {
        Prenotazione found = PR.findById(id).orElseThrow(() -> new NotFoundException("Prenotazione non trovata..."));
        PR.delete(found);
        System.out.println("Prenotazione eliminata con successo!");

    }
};
