package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addCatTest(){
        Cat cat = new Cat(null,null,null);

        CatHouse.add(cat);

        int actual =  CatHouse.getNumberOfCats();


        int expected = 1;
        Assert.assertEquals(expected,actual);
    }


    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeCatId(){
        Cat cat = new Cat(null,null,189);

        CatHouse.add(cat);

        CatHouse.remove(189);

        int actual = CatHouse.getNumberOfCats();

        int expected = 0;

        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCat(){
        Cat cat = new Cat("Ethan",null,null);

        CatHouse.add(cat);

        CatHouse.remove(cat);

        int actual = CatHouse.getNumberOfCats();

        int expected = 0;

        Assert.assertEquals(expected,actual);
    }


    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatById(){
        Cat cat = new Cat(null,null,189);

        CatHouse.add(cat);

        CatHouse.getCatById(189);

        Cat actual = CatHouse.getCatById(189);

        Cat expected = cat;

        Assert.assertEquals(expected,actual);
    }


    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest(){
        Cat cat1 = new Cat(null,null,null);
        Cat cat2 = new Cat(null,null,null);
        Cat cat3 = new Cat(null,null,null);
        Cat cat4 = new Cat(null,null,null);
        Cat cat5 = new Cat(null,null,null);


        CatHouse.add(cat1);
        CatHouse.add(cat2);
        CatHouse.add(cat3);
        CatHouse.add(cat4);
        CatHouse.add(cat5);


        int actual =  CatHouse.getNumberOfCats();


        int expected = 5;
        Assert.assertEquals(expected,actual);
    }

}
