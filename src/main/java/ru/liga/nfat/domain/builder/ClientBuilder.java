package ru.liga.nfat.domain.builder;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Component;
import ru.liga.nfat.domain.dto.ClientDto;
import ru.liga.nfat.domain.entity.Client;

@Component
public class ClientBuilder {

    public Client build(ClientDto clientDto){
        return Client.builder()
                .login(clientDto.getLogin())
                .password(BCrypt.hashpw(clientDto.getPassword(), BCrypt.gensalt()))
                .build();
    }
}