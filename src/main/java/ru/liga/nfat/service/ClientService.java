package ru.liga.nfat.service;

import ru.liga.nfat.domain.ClientDto;

public interface ClientService {

    ClientDto registrationUser();

    boolean authorizationUser();
}
