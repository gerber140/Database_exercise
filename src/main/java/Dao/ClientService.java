package Dao;

import models.Client;

import javax.persistence.*;

public class ClientService implements IClientService {
    private EntityManagerFactory factory;
    private EntityManager entityManager;

    public ClientService() {
        factory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        entityManager = factory.createEntityManager();
    }

    @Override
    public void addClient(Client client) {
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.persist(client);
        tx.commit();
    }

    @Override
    public Client getClient(Long id) {
        Client client = entityManager.find(Client.class, id);
        return client;
    }

    @Override
    public void deleteClient(Long id) {
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        Client carToDelete = this.getClient(id);
        entityManager.remove(carToDelete);
        entityManager.flush();
        tx.commit();
    }

    public void close() {
        entityManager.close();
    }
}
