package pro.pawelczyk.pppetclinic.services.springdatajpa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.pawelczyk.pppetclinic.model.Owner;
import pro.pawelczyk.pppetclinic.repositories.OwnerReporitory;
import pro.pawelczyk.pppetclinic.repositories.PetRepository;
import pro.pawelczyk.pppetclinic.repositories.PetTypeRepository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class OwnerSDJpaServiceImplTest {

    public static final String SMITH_LAST_NAME = "Smith";
    @Mock
    OwnerReporitory ownerReporitory;
    @Mock
    PetRepository petRepository;
    @Mock
    PetTypeRepository petTypeRepository;

    @InjectMocks
    OwnerSDJpaServiceImpl service;

    Owner returnOwner;

    @BeforeEach
    void setUp() {
        returnOwner = Owner.builder().id(1L).lastName(SMITH_LAST_NAME).build();
    }

    @Test
    void findByLastName() {
        when(ownerReporitory.findByLastName(any())).thenReturn(returnOwner);

        Owner smith = service.findByLastName(SMITH_LAST_NAME);

        assertEquals(SMITH_LAST_NAME, smith.getLastName());
    }

    @Test
    void findAll() {
        Set<Owner> returnOwnersSet = new HashSet<>();
        returnOwnersSet.add(Owner.builder().id(1l).build());
        returnOwnersSet.add(Owner.builder().id(2l).build());

        when(ownerReporitory.findAll()).thenReturn(returnOwnersSet);

        Set<Owner> owners = service.findAll();

        assertNotNull(owners);
        assertEquals(2, owners.size());
    }

    @Test
    void findById() {
        when(ownerReporitory.findById(anyLong())).thenReturn(Optional.of(returnOwner));

        Owner owner = service.findById(1L);

        assertNotNull(owner);
    }

    @Test
    void findByIdNotFound() {
        when(ownerReporitory.findById(anyLong())).thenReturn(Optional.empty());

        Owner owner = service.findById(1L);

        assertNull(owner);
    }


    @Test
    void save() {
        Owner ownerToSave = Owner.builder().id(1L).build();

        when(ownerReporitory.save(any())).thenReturn(returnOwner);

        Owner savedOwner = service.save(ownerToSave);

        assertNotNull(savedOwner);

        verify(ownerReporitory).save(any());
    }

    @Test
    void delete() {
        service.delete(returnOwner);

        //default is 1 times
        verify(ownerReporitory, times(1)).delete(any());
    }

    @Test
    void deleteById() {
        service.deleteById(1L);

        verify(ownerReporitory).deleteById(anyLong());
    }
}