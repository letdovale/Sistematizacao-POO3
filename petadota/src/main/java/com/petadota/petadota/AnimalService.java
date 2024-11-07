package com.petadota.petadota;

import com.petadota.entity.Animal;
import com.petadota.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    
    public List<Animal> findAll() {
        return animalRepository.findAll();
    }

    
    public Optional<Animal> findById(Long id) {
        return animalRepository.findById(id);
    }

    
    @Transactional
    public Animal save(Animal animal) {
        return animalRepository.save(animal);
    }

    
    @Transactional
    public Animal update(Long id, Animal animalDetails) {
        Optional<Animal> animal = animalRepository.findById(id);
        if (animal.isPresent()) {
            Animal existingAnimal = animal.get();
            existingAnimal.setNome(animalDetails.getNome());
            existingAnimal.setTipo(animalDetails.getTipo());
            existingAnimal.setIdade(animalDetails.getIdade());
            return animalRepository.save(existingAnimal);
        } else {
            
            return null;
        }
    }

    @Transactional
    public void delete(Long id) {
        animalRepository.deleteById(id);
    }
}
