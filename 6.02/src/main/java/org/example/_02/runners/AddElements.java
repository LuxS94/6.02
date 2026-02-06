package org.example._02.runners;

import org.example._02.services.EdificioService;
import org.example._02.services.PostazioneService;
import org.example._02.services.PrenotazioneService;
import org.example._02.services.UtenteService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//Per popolare DB-------------------------------------------------------------------
@Component
public class AddElements implements CommandLineRunner {
    private final EdificioService ES;
    private final PostazioneService PS;
    private final PrenotazioneService PRS;
    private final UtenteService US;

    public AddElements(EdificioService ES, PostazioneService PS, PrenotazioneService PRS, UtenteService US) {
        this.ES = ES;
        this.PS = PS;
        this.PRS = PRS;
        this.US = US;
    }

    @Override
    public void run(String... args) throws Exception {
//        Utente Gianni = new Utente("gianni28", "Gianni Celeste", "giannino@libero.it");
//        US.saveUtente(Gianni);
//        Utente Luca = new Utente("luche0101", "Luca Nardo", "lucak@gmail.it");
//        US.saveUtente(Luca);
//        Utente Antonia = new Utente("anto1414", "Antonia Esposito", "ninna88@hotmail.it");
//        US.saveUtente(Antonia);
//        Edificio Pecoraro = new Edificio("Pecoraro", "via carboni 3", "Roma");
//        ES.saveEdificio(Pecoraro);
//        Edificio BuonaStella = new Edificio("BuonaStella", "Via Manzoni 157", "Napoli");
//        ES.saveEdificio(BuonaStella);
//        Edificio Gatti = new Edificio("Gatti", "via Montenapoleone 3", "Milano");
//        ES.saveEdificio(Gatti);
//        Postazione A = new Postazione("larga", Tipo_postazione.SALA_RIUNIONI, 40, Gatti);
//        PS.savePostazione(A);
//        Postazione B = new Postazione("stretta", Tipo_postazione.ONESPACE, 5, BuonaStella);
//        PS.savePostazione(B);
//        Postazione C = new Postazione("singola", Tipo_postazione.PRIVATO, 1, Pecoraro);
//        PS.savePostazione(C);
//        Prenotazione x = new Prenotazione(Luca, LocalDate.of(2026, 03, 11), A);
//        PRS.savePrenotazione(x);
//        Prenotazione y = new Prenotazione(Antonia, LocalDate.of(2028, 04, 11), B);
//        PRS.savePrenotazione(y);
//        Prenotazione z = new Prenotazione(Gianni, LocalDate.of(2026, 07, 10), C);
//        PRS.savePrenotazione(z);

    }
}
