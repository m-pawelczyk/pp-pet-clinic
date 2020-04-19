package pro.pawelczyk.pppetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pro.pawelczyk.pppetclinic.model.*;
import pro.pawelczyk.pppetclinic.services.*;

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
    private final SpecialityService specialityService;
    private final VisitService visitService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {

        if (petTypeService.findAll().size() == 0) {
            loadData();
        }
    }

    private void loadData() {
        PetType petType1 = new PetType();
        petType1.setName("Pies");
        PetType savedPetType1 = petTypeService.save(petType1);

        PetType petType2 = new PetType();
        petType2.setName("Kot");
        PetType savedPetType2 = petTypeService.save(petType2);

        Speciality speciality1 = new Speciality();
        speciality1.setDescription("radiolog");
        Speciality specRadiology = specialityService.save(speciality1);

        Speciality speciality2 = new Speciality();
        speciality2.setDescription("chirurg");
        Speciality specSurgery = specialityService.save(speciality2);

        Speciality speciality3 = new Speciality();
        speciality3.setDescription("dentysta");
        Speciality specDentist = specialityService.save(speciality3);

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

        Visit visit1 = new Visit();
        visit1.setPet(annaDog);
        visit1.setLocalDate(LocalDate.now());
        visit1.setDescription("Piesek sie nudzi");

        visitService.save(visit1);

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
        vet1.getSpecialities().add(specDentist);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Michael");
        vet2.setLastName("von Mietczynski");
        vet2.getSpecialities().add(specRadiology);
        vet2.getSpecialities().add(specSurgery);
        vetService.save(vet2);

        System.out.println("Bootstrap loading Vet...");
    }
}
