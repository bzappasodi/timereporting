package com.trs.timereporting.domain.repository;

/**
 * Created by williamzappasodi on 1/1/16.
 * , we just created an interface called ClientRepository,
 * which defines the expected behavior of a client repository. code to an interfacce
 * Remember that we are actually creating a persistence layer for our application.
 * Who is going to use our persistence layer repository object? It will possibly be used by a
 * controller object (in our case, ProductController) from the controller layer, so it is not the best
 * practice to connect two layers (controller and persistence) with a direct reference. Instead, we can,
 * in future, have an interface reference in the controller so that we can easily switch to different
 * implementations of the repository without doing any code changes in the controller class, if we want.
 */
import com.trs.timereporting.domain.Client;

import java.util.List;


public interface ClientRepository {

    Client create(Client client);
    List<Client> getAllClients();



}
