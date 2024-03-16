package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addDogTest(){
        Dog dog = new Dog(null,null,null);

        DogHouse.add(dog);

        int actual =  DogHouse.getNumberOfDogs();


        int expected = 1;
        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeDogId(){
        Dog dog = new Dog(null,null,981);

        DogHouse.add(dog);

        DogHouse.remove(981);

        int actual = DogHouse.getNumberOfDogs();

        int expected = 0;

        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeDog(){
        Dog dog = new Dog("Turbo",null,null);

        DogHouse.add(dog);

        DogHouse.remove(dog);

        int actual = DogHouse.getNumberOfDogs();

        int expected = 0;

        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogById(){
        Dog dog = new Dog(null,null,981);

        DogHouse.add(dog);

        DogHouse.getDogById(981);

        Dog actual = DogHouse.getDogById(981);

        Dog expected = dog;

        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
