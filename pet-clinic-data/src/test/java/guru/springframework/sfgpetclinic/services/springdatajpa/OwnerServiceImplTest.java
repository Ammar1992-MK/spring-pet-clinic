package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.repositories.OwnerRepository;
import guru.springframework.sfgpetclinic.repositories.PetRepository;
import guru.springframework.sfgpetclinic.repositories.PetTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OwnerServiceImplTest {

    public static final String LAST_NAME = "smith";
    @Mock
    OwnerRepository ownerRepository;
    @Mock
    PetRepository petRepository;
    @Mock
    PetTypeRepository petTypeRepository;

    @InjectMocks
    OwnerServiceImpl ownerService;

    @InjectMocks
    Owner returnOwner;

    @BeforeEach
    void setUp() {
        returnOwner.setId(1L);
        returnOwner.setLastName(LAST_NAME);

    }

    @Test
    void findAll() {

        Set<Owner> owners = new HashSet<>();
        Owner owner1 = new Owner();
        owner1.setId(1L);
        Owner owner2 =new Owner();
        owner2.setId(2L);
        owners.add(owner1);
        owners.add(owner2);

        when(ownerRepository.findAll()).thenReturn(owners);

        Set<Owner> ownerSet = ownerService.findAll();

        assertNotNull(ownerSet);
        assertEquals(2, ownerSet.size());
    }

    @Test
    void findById() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(returnOwner));

        Owner owner = ownerService.findById(1L);
        assertNotNull(owner);
        assertEquals(1L, owner.getId());
    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void findByLastName() {

        when(ownerRepository.findByLastName(any())).thenReturn(returnOwner);

        Owner smith = ownerService.findByLastName(LAST_NAME);

        assertEquals(LAST_NAME,smith.getLastName());
        verify(ownerRepository).findByLastName(any());
    }
}