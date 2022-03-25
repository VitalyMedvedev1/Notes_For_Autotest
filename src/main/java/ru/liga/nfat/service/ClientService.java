package ru.liga.nfat.service;

import ru.liga.nfat.domain.dto.ClientDto;

public interface ClientService {

    boolean registrationUser(ClientDto clientDto);

    boolean authorizationUser(ClientDto clientDto);
}
