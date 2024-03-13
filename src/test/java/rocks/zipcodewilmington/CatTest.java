package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


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
    @Test
    public void testSetName() {
        // Given
        Cat cat = new Cat("Zula",null,null);
        String expected = "Ethan";

        // When
        cat.setName(expected);
        String actual = cat.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        // Given
        Cat cat = new Cat("Zula",new Date(),0);
        String expected = "meow!";

        // When
        String actual = cat.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setBirthDate(){
       //Given
        Cat cat = new Cat("Zula",new Date(),0);
        Date expected = new Date();

        //When
        Date actual = cat.getBirthDate();

        //Then
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void eatTest() {
        // Given
        Cat cat = new Cat("Zula",new Date(),0);
        String expected = "meow!";

        // When
        String actual = cat.eat();

        // Then
        Assert.assertEquals(expected, actual);
    }


//    private ArrayList<Food> eatenMeals;

//    this.eatenMeals = new ArrayList<>();

//    public Integer getNumberOfMealsEaten() {
//        return eatenMeals.size();
//    }

    //    public void eat(Food food) {
//        eatenMeals.add(food);
//    }



}
