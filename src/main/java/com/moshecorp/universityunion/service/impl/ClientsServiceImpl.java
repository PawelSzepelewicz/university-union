package com.moshecorp.universityunion.service.impl;
import com.moshecorp.universityunion.model.user.Clients;
import com.moshecorp.universityunion.repository.ClientsRepository;
import com.moshecorp.universityunion.service.ClientsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class ClientsServiceImpl implements ClientsService {

    private final ClientsRepository clientsRepository;

    @Override
    public void setClientToDatabase(String surname, String name, String patronymic) {
        Clients client = new Clients(surname, name, patronymic);
        clientsRepository.save(client);
    }

    @Override
    public Clients getClientByID(Long id) {
        return clientsRepository.getById(id);
    }

    @Override
    public List<Clients> getAll() {
        return clientsRepository.findAll();
    }

    @Override
    public List<String> getInitials() {
        return new ArrayList<>(clientsRepository.selectInitials());
    }


}
