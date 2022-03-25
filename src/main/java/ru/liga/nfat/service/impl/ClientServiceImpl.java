package ru.liga.nfat.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;
import ru.liga.nfat.domain.builder.ClientBuilder;
import ru.liga.nfat.domain.dto.ClientDto;
import ru.liga.nfat.domain.entity.Client;
import ru.liga.nfat.repository.ClientRepository;
import ru.liga.nfat.service.ClientService;

import java.util.Optional;

@Slf4j
@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientBuilder clientBuilder;

    private final ClientRepository clientRepository;

    @Override
    public boolean registrationUser(ClientDto clientDto) {
        try {
            log.info("Save client in DB login: {}", clientDto.getLogin());
            clientRepository.save(clientBuilder.build(clientDto));
        }
        catch (RuntimeException e){
            log.info("Error save client in DB login: {}, \n message: {}", clientDto.getLogin(), e.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public boolean authorizationUser(ClientDto clientDto) {
        Optional<Client> optionalClient = clientRepository.findByLogin(clientDto.getLogin());
        return optionalClient.filter(client -> BCrypt.checkpw(clientDto.getPassword(), client.getPassword().trim())).isPresent();
    }
}