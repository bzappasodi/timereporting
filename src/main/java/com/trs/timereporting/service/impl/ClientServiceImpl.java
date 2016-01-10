package com.trs.timereporting.service.impl;


import com.trs.timereporting.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



import com.trs.timereporting.domain.Client;
import com.trs.timereporting.domain.repository.ClientRepository;
import com.trs.timereporting.service.ClientService;

/**
 * Created by williamzappasodi on 1/1/16.
 */
@Service
public class ClientServiceImpl implements ClientService {


    @Autowired
    private ClientRepository clientsRepository;

    @Override
    public Client create(Client client) {

        return clientsRepository.create(client);
    }


    @Override
    public List<Client> getAllClients() {

        return clientsRepository.getAllClients();
    }


}
