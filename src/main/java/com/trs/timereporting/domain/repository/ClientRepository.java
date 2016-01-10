package com.trs.timereporting.domain.repository;

/**
 * Created by williamzappasodi on 1/1/16.
 */
import com.trs.timereporting.domain.Client;

import java.util.List;


public interface ClientRepository {

    Client create(Client client);
    List<Client> getAllClients();



}
