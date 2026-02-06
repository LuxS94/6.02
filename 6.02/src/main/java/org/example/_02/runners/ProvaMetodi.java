package org.example._02.runners;

import org.example._02.services.EdificioService;
import org.example._02.services.PostazioneService;
import org.example._02.services.PrenotazioneService;
import org.example._02.services.UtenteService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//Per provare metodi----------------------------------------------------------------
@Component
public class ProvaMetodi implements CommandLineRunner {
    private final EdificioService ES;
    private final PostazioneService PS;
    private final PrenotazioneService PRS;
    private final UtenteService US;

    public ProvaMetodi(EdificioService ES, PostazioneService PS, PrenotazioneService PRS, UtenteService US) {
        this.ES = ES;
        this.PS = PS;
        this.PRS = PRS;
        this.US = US;
    }

    @Override
    public void run(String... args) throws Exception {
        //metodo per cercare per tipo di postazione e città:
        // PS.cercaPerTipoEcitta(Tipo_postazione.SALA_RIUNIONI, "Milano");
        //Cancellare prenotazione:
        // PRS.findByIdAndDelete(52);
//  Cancellare utente:
//        US.findByUsernameAndDelete("anto1414");
        //Cancellare postazione:
        //PS.findByIdAndDelete(52);
        // Cancellare edificio:
        //        // ES.findByIdAndDelete(104);
    }
}
