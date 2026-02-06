package org.example._02.runners;

import org.example._02.entities.Utente;
import org.example._02.services.EdificioService;
import org.example._02.services.PostazioneService;
import org.example._02.services.PrenotazioneService;
import org.example._02.services.UtenteService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    private final EdificioService ES;
    private final PostazioneService PS;
    private final PrenotazioneService PRS;
    private final UtenteService US;

    public Runner(EdificioService ES, PostazioneService PS, PrenotazioneService PRS, UtenteService US) {
        this.ES = ES;
        this.PS = PS;
        this.PRS = PRS;
        this.US = US;
    }

    @Override
    public void run(String... args) throws Exception {
        Utente Gianni = new Utente("gianni28", "Gianni Celeste", "giannino@libero.it");
        US.saveUtente(Gianni);
    }
}
