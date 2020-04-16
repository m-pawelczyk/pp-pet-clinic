package pro.pawelczyk.pppetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pro.pawelczyk.pppetclinic.model.Owner;
import pro.pawelczyk.pppetclinic.model.Pet;
import pro.pawelczyk.pppetclinic.model.PetType;
import pro.pawelczyk.pppetclinic.model.Vet;
import pro.pawelczyk.pppetclinic.services.OwnerService;
import pro.pawelczyk.pppetclinic.services.PetTypeService;
import pro.pawelczyk.pppetclinic.services.VetService;

import java.time.LocalDate;

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
        owner1.setAddress("Stawowa 123");
        owner1.setCity("Katowice");
        owner1.setTelephone("123707070");

        Pet annaDog = new Pet();
        annaDog.setPetType(petType1);
        annaDog.setOwner(owner1);
        annaDog.setBirthDate(LocalDate.now());
        annaDog.setName("Fryt");
        owner1.getPets().add(annaDog);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Zenon");
        owner2.setLastName("Radziwil");
        owner2.setAddress("Wiejska 123");
        owner2.setCity("Warszawa");
        owner2.setTelephone("226956588");

        Pet zenonCat = new Pet();
        zenonCat.setPetType(petType2);
        zenonCat.setOwner(owner2);
        zenonCat.setBirthDate(LocalDate.now());
        zenonCat.setName("Brudas");
        owner2.getPets().add(zenonCat);

        ownerService.save(owner2);

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
