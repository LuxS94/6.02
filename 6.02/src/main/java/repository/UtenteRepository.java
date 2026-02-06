package repository;

import org.example._02.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, String> {
    boolean existsByUsername(String username);

    boolean existsByEmail(String email);

}
