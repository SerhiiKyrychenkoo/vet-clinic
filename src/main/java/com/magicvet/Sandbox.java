package main.java.com.magicvet;

import main.java.com.magicvet.model.Dog;
import main.java.com.magicvet.model.Pet;

import java.util.Arrays;
import java.util.Comparator;

public class Sandbox {

    public static void main(String[] args) {
        Dog[] dogs = {
            new Dog(Dog.Size.M),
            new Dog(Dog.Size.S),
            new Dog(Dog.Size.XL),
            new Dog(Dog.Size.XL),
            new Dog(Dog.Size.XS),
            new Dog(Dog.Size.S)
        };

        Arrays.sort(dogs, new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.getSize().getValue() - o2.getSize().getValue();
            }
        });

        for (Dog dog : dogs) {
            System.out.println(dog.getSize());
        }

        Pet[] pets = {
                new Pet(Pet.HealthStatus.GOOD),
                new Pet(Pet.HealthStatus.SICK),
                new Pet(Pet.HealthStatus.GOOD),
                new Pet(Pet.HealthStatus.CRITICAL)

        };
        Arrays.sort(pets, new Comparator<Pet>() {
            @Override
            public int compare(Pet o1, Pet o2) {
                return o1.getHealthStatus().getValueHS() - o2.getHealthStatus().getValueHS();
            }
        });
        for (Pet pet : pets) {
            System.out.println(pet.getHealthStatus());
        }

    }

}
