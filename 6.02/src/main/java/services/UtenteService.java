package services;

import org.example._02.entities.Utente;
import org.example._02.exception.AlreadyExist;
import org.example._02.exception.InvalidLength;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UtenteRepository;

@Service
public class UtenteService {
    private final UtenteRepository UR;

    @Autowired
    public UtenteService(UtenteRepository UR) {
        this.UR = UR;
    }

    public void saveUtente(Utente nUtente) {
        if (nUtente.getUsername().length() < 8) {
            throw new InvalidLength("L'username deve essere almeno di 8 caratteri");
        }
        ;
        if (UR.existsByUsername(nUtente.getUsername())) {
            throw new AlreadyExist("Username già esistente");
        }
        ;
        if (UR.existsByEmail(nUtente.getEmail())) {
            throw new AlreadyExist("Email già registrata");
        }
        ;
    }
}
