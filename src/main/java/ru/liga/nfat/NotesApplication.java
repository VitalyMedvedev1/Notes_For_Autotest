package ru.liga.nfat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotesApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotesApplication.class, args);
    }

/*    @EventListener(ApplicationReadyEvent.class)
    private void testJpaMethods(){
        System.out.println(123);
        List<Client> client = clientRepository.findAll();
        System.out.println(client);
    }*/
}
