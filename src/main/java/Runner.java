import Dao.ClientService;
import models.Client;

import java.time.LocalDate;

public class Runner {
    public static void main(String[] args) {
        Client kononowicz = new Client("Krzystof Kononowicz", "01243271223", LocalDate.of(2023, 1, 16));
        ClientService clientService = new ClientService();

//        clientService.addClient(kononowicz);
//        System.out.println(clientService.getClient(1L));
        clientService.deleteClient(12L);
        clientService.close();

    }
}
