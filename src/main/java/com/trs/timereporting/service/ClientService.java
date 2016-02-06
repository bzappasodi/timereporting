package com.trs.timereporting.service;

import com.trs.timereporting.domain.Client;

import java.util.List;

/**
 * Created by williamzappasodi on 12/28/15.
 * The service layer exposes business operations
 * that could be composed of multiple CRUD operations.
 * These CRUD operations are usually performed by the repository objects.
 * For example, you could have a business operation to process a customer order,
 * and in order to perform such a business operation, you would need to perform the following operations:


 *
 */
public interface ClientService {


    Client create(Client client);


    List<Client> getAllClients();



}
