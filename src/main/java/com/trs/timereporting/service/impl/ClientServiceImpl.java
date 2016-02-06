package com.trs.timereporting.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.trs.timereporting.domain.Client;
import com.trs.timereporting.domain.repository.ClientRepository;
import com.trs.timereporting.service.ClientService;

/**
 * Created by williamzappasodi on 1/1/16.
 * The service layer exposes business operations that could be
 * composed of multiple CRUD operations. These CRUD operations are usually
 * performed by the repository objects. For example, you could have a business
 * operation to process a customer order, and in order to perform such a business operation,
 * you would need to perform the following operations:


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
