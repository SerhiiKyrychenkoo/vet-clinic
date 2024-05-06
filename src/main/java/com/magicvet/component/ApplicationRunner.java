package main.java.com.magicvet.component;

import main.java.com.magicvet.Main;
import main.java.com.magicvet.model.Client;
import main.java.com.magicvet.model.Pet;
import main.java.com.magicvet.service.ClientService;
import main.java.com.magicvet.service.PetService;

public class ApplicationRunner {

    private final ClientService clientService = new ClientService();
    private final PetService petService = new PetService();

    public void run() {
        if (Authenticator.auth()) {
            Client client = clientService.registerNewClient();

            if (client != null) {
                String NEED_REG = "yes";
                System.out.print("Do you need to add a new pet (yes/no): ");
                String needReg = Main.SCANNER.nextLine();
                if (NEED_REG.equals(needReg)) {
                    System.out.println("Adding a new pet.");

                    Pet pet = petService.registerNewPet();
                    client.setPet(pet);
                    pet.setOwnerName(client.getFirstName() + " " + client.getLastName());
                    System.out.println("Pet has been added.");
                } else {
                    System.out.println("Pet has not been added"); // Add the option of choosing an existing pet
                }
                System.out.println(client);
            }

        }
    }
}
