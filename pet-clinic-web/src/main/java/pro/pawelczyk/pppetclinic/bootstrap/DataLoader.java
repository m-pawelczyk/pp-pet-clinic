package pro.pawelczyk.pppetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pro.pawelczyk.pppetclinic.model.Owner;
import pro.pawelczyk.pppetclinic.model.Vet;
import pro.pawelczyk.pppetclinic.services.OwnerService;
import pro.pawelczyk.pppetclinic.services.VetService;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 14.04.2020
 * created DataLoader in pro.pawelczyk.pppetclinic.bootstrap
 * in project pp-pet-clinic
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Anna");
        owner1.setLastName("Nowak");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Zenon");
        owner2.setLastName("Radziwil");
        ownerService.save(owner2);

        Owner owner3 = new Owner();
        owner3.setId(3L);
        owner3.setFirstName("Czesiek");
        owner3.setLastName("Z Lasu");
        ownerService.save(owner3);

        System.out.println("Bootstrap loading Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Helmut");
        vet1.setLastName("von Podczaski");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Michael");
        vet2.setLastName("von Mietczynski");
        vetService.save(vet2);

        System.out.println("Bootstrap loading Vet...");
    }
}
