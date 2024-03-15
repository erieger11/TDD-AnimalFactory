package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }



    // TODO - Create tests for `void setName(String name)`
    @Test
    public void testSetName() {
        // Given
        Cat cat = new Cat(null,null,null);
        String expected = "Ethan";

        // When
        cat.setName(expected);
        String actual = cat.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }




    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        // Given
        Cat cat = new Cat(null,null,null);
        String expected = "meow!";

        // When
        String actual = cat.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }



    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDate(){
       //Given
        Cat cat = new Cat(null,null,null);
        Date expected = new Date(2011, Calendar.APRIL,14);

        //When
        cat.setBirthDate(expected);
        Date actual = cat.getBirthDate();

        //Then
        Assert.assertEquals(expected,actual);

    }


    //TODO    Create tests for void eat(Food food)
    // ensure that when .eat is invoked on an instance of Cat, the numberOfMealsEaten is increased by 1.
    @Test
    public void eatTest() {
        // Given
        Cat cat = new Cat(null,null,null);
        Food food = new Food();
        int expected = cat.getNumberOfMealsEaten();

        // When
        cat.eat(food);
        int actual = cat.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(expected+1, actual);
    }

//   TODO   Create tests for Integer getId()
//    ensure that when .getId is invoked on an instance of Cat, the respective id value is returned.
@Test
public void testId() {
    // Given
    Integer expected = 189;
    Cat cat = new Cat(null,null,expected);

    // When
    Integer actual = cat.getId();

    // Then
    Assert.assertEquals(expected, actual);
}
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
    public void testInstanceOfAnimal() {
        Cat cat = new Cat(null, null, null);
        Assert.assertTrue(cat instanceof Animal);
    }


    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void testInstanceOfMammal() {
        Cat cat = new Cat(null, null, null);
        Assert.assertTrue(cat instanceof Mammal);
    }
}
