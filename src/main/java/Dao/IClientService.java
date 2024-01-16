package Dao;

import models.Client;

public interface IClientService {
    void addClient(Client client);
    Client getClient(Long id);
    public void deleteClient(Long id);

}
