package com.moshecorp.universityunion.controller;



import com.moshecorp.universityunion.model.user.Clients;
import com.moshecorp.universityunion.service.ClientsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

@RestController()
@RequestMapping("/clients")
@AllArgsConstructor
public class ClientsController {

    private final ClientsService clientsService;

    @GetMapping("/setNewClient")
    public String setNewClient(@RequestParam("surname") String surname, @RequestParam("name") String name, @RequestParam("patronymic") String patronymic) {
        clientsService.setClientToDatabase(surname, name, patronymic);
        return "Client's data was saved";
    }

    @PostMapping(value="/getClientByID")
    public Clients getResultByID(@RequestBody Long id) {
        Clients client = clientsService.getClientByID(id);
        return client;
    }

    @GetMapping("/getAll")
    public List<Clients> getAll(){
        return clientsService.getAll();
    }

    @GetMapping("/getAllInitials")
    public List<String> getAllInitials(){return clientsService.getInitials();}



}