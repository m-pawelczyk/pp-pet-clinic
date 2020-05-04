package pro.pawelczyk.pppetclinic.services.map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pro.pawelczyk.pppetclinic.model.Pet;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 04.05.2020
 * created PetMapServiceImplTest in pro.pawelczyk.pppetclinic.services.map
 * in project pp-pet-clinic
 */
public class PetMapServiceImplTest {
    private PetMapServiceImpl petMapService;

    private final Long petId = 1L;

    @BeforeEach
    void setUp() {
        petMapService = new PetMapServiceImpl();
        petMapService.save(Pet.builder().id(petId).build());
    }

    @Test
    void findAll() {
        // when
        Set<Pet> petSet = petMapService.findAll();
        // then
        assertEquals(1, petSet.size());
    }

    @Test
    void findByIdExistingId() {
        // when
        Pet pet = petMapService.findById(petId);
        // then
        assertEquals(petId, pet.getId());
    }

    @Test
    void findByIdNotExistingId() {
        // when
        Pet pet = petMapService.findById(5L);
        // then
        assertNull(pet);
    }

    @Test
    void findByIdNullId() {
        // when
        Pet pet = petMapService.findById(null);
        // then
        assertNull(pet);
    }

    @Test
    void saveExistingId() {
        // given
        Long id = 2L;
        // when
        Pet pet2 = Pet.builder().id(id).build();
        Pet savedPet = petMapService.save(pet2);
        // then
        assertEquals(id, savedPet.getId());
    }

    @Test
    void saveDuplicateId() {
        // given
        Long id = 1L;
        Pet pet2 = Pet.builder().id(id).build();
        // when
        Pet savedPet = petMapService.save(pet2);
        // then
        assertEquals(id, savedPet.getId());
        assertEquals(1, petMapService.findAll().size());
    }

    @Test
    void saveNoId() {
        // when
        Pet savedPet = petMapService.save(Pet.builder().build());
        // then
        assertNotNull(savedPet);
        assertNotNull(savedPet.getId());
        assertEquals(2, petMapService.findAll().size());
    }

    @Test
    void deletePet() {
        // when
        petMapService.delete(petMapService.findById(petId));
        // then
        assertEquals(0, petMapService.findAll().size());
    }

    @Test
    void deleteWithWrongId() {
        // given
        Pet pet = Pet.builder().id(5L).build();
        // when
        petMapService.delete(pet);
        // then
        assertEquals(1, petMapService.findAll().size());
    }

    @Test
    void deleteWithNullId() {
        Pet pet = Pet.builder().build();
        // when
        petMapService.delete(pet);
        // then
        assertEquals(1, petMapService.findAll().size());
    }

    @Test
    void deleteNull() {
        // when
        petMapService.delete(null);
        // then
        assertEquals(1, petMapService.findAll().size());
    }

    @Test
    void deleteByIdCorrectId() {
        // when
        petMapService.deleteById(petId);
        // then
        assertEquals(0, petMapService.findAll().size());
    }

    @Test
    void deleteByIdWrongId() {
        // when
        petMapService.deleteById(5L);
        // then
        assertEquals(1, petMapService.findAll().size());
    }

    @Test
    void deleteByIdNullId() {
        // when
        petMapService.deleteById(null);
        // then
        assertEquals(1, petMapService.findAll().size());
    }
}
