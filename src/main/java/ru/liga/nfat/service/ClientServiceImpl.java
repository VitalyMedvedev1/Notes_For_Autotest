package ru.liga.nfat.service;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.liga.nfat.domain.ClientDto;

@Service
public class ClientServiceImpl implements ClientService {

    @Override
    public ClientDto registrationUser() {
        return new ClientDto(111, "Vitaly", "password");
    }

    @Override
    public boolean authorizationUser() {
        return false;
    }
}