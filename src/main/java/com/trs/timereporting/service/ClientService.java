package com.trs.timereporting.service;

import com.trs.timereporting.domain.Client;

import java.util.List;

/**
 * Created by williamzappasodi on 12/28/15.
 */
public interface ClientService {


    Client create(Client client);


    List<Client> getAllClients();



}
