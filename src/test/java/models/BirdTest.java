package models;

import org.junit.Assert;
import org.junit.Test;

public class BirdTest {

    private Bird bird;

    @org.junit.Before
    public void setUp() {
        bird = new Bird("Гриф", 4, 5.8);
    }

    @org.junit.Test
    public void getName() {
        Assert.assertEquals("Гриф", bird.getName());
    }

    @org.junit.Test
    public void getWeight() {
        Assert.assertEquals(5.8, bird.getWeight(), 0);
    }

    @org.junit.Test
    public void getAge() {
        Assert.assertEquals(4, bird.getAge());
    }

    @org.junit.Test
    public void testToString() {
        Assert.assertEquals("Гриф: Возраст: 4, Вес: 5.8", bird.toString());
    }

    @Test
    public void constructorTest(){
        Assert.assertThrows("Неверное значение имени", IllegalArgumentException.class,
                () -> new Bird("birdbirdbirdbird", 4, 5.5));
        Assert.assertThrows("Неверное значение возраста", IllegalArgumentException.class,
                () -> new Bird("Bird", 13, 5.5));
        Assert.assertThrows("Неверное значение веса", IllegalArgumentException.class,
                () -> new Bird("Bird", 4, 16.5));

    }
}