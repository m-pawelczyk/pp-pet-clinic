package pro.pawelczyk.pppetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pro.pawelczyk.pppetclinic.model.Owner;
import pro.pawelczyk.pppetclinic.model.PetType;
import pro.pawelczyk.pppetclinic.model.Vet;
import pro.pawelczyk.pppetclinic.services.OwnerService;
import pro.pawelczyk.pppetclinic.services.PetTypeService;
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
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType petType1 = new PetType();
        petType1.setName("Pies");
        PetType savedPetType1 = petTypeService.save(petType1);

        PetType petType2 = new PetType();
        petType2.setName("Kot");
        PetType savedPetType2 = petTypeService.save(petType2);

        Owner owner1 = new Owner();
        owner1.setFirstName("Anna");
        owner1.setLastName("Nowak");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Zenon");
        owner2.setLastName("Radziwil");
        ownerService.save(owner2);

        Owner owner3 = new Owner();
        owner3.setFirstName("Czesiek");
        owner3.setLastName("Z Lasu");
        ownerService.save(owner3);

        System.out.println("Bootstrap loading Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Helmut");
        vet1.setLastName("von Podczaski");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Michael");
        vet2.setLastName("von Mietczynski");
        vetService.save(vet2);

        System.out.println("Bootstrap loading Vet...");
    }
}
