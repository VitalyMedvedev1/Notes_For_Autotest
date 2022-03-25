package ru.liga.nfat.contoller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.liga.nfat.domain.dto.ClientDto;
import ru.liga.nfat.service.ClientService;

@Slf4j
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @PostMapping("/auth")
    public boolean authorization(@RequestBody ClientDto clientDto) {
        log.info("Start AUTH process with login: {}, password: {}", clientDto.getLogin(), clientDto.getPassword());
        return clientService.authorizationUser(clientDto);
    }


    @PostMapping("/create")
    public boolean create(@RequestBody ClientDto clientDto) {
        log.info("Start create client process with login: {}, password: {}", clientDto.getLogin(), clientDto.getPassword());
        return clientService.registrationUser(clientDto);
    }


}