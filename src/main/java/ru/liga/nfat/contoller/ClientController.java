package ru.liga.nfat.contoller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.liga.nfat.domain.ClientDto;
import ru.liga.nfat.service.ClientService;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @GetMapping("/create")
    public @ResponseBody ClientDto create() {
        return clientService.registrationUser();
    }
}