package com.moshecorp.universityunion.service;

import com.moshecorp.universityunion.model.user.Clients;

import java.util.List;

public interface ClientsService {

        void setClientToDatabase(String surname, String name, String patronymic);
        Clients getClientByID(Long id);
        List<Clients> getAll();
        List<String> getInitials();

}
