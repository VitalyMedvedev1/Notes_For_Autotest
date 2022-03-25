package ru.liga.nfat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.liga.nfat.domain.entity.Client;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Long> {
    Optional<Client> findByLogin(String login);
}
