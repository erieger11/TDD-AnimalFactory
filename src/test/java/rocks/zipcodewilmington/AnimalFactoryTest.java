package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
@Test
public void animalDogTest(){
        String expectedName = "Anja";
        Date expectedBirthDate = new Date();

        Dog dog = AnimalFactory.createDog(expectedName, expectedBirthDate);

        String actualName = dog.getName();
        Date actualBirthDate = dog.getBirthDate();

        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedBirthDate,actualBirthDate);

    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void animalCatTest(){
        String expectedName = "Dan";
        Date expectedBirthDate = new Date();


        Cat cat= AnimalFactory.createCat(expectedName,expectedBirthDate);

        String actualName = cat.getName();
        Date actualBirthDate = cat.getBirthDate();

        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedBirthDate,actualBirthDate);

    }
}
