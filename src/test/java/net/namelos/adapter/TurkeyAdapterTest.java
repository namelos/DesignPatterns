package net.namelos.adapter;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TurkeyAdapterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private MallardDuck duck;
    private WildTurkey turkey;
    private Duck turkeyAdapter;


    @Before
    public void setup() {
        System.setOut(new PrintStream(outContent));

        duck = new MallardDuck();

        turkey = new WildTurkey();

        turkeyAdapter = new TurkeyAdapter(turkey);
    }

    @Test
    public void turkeyShouldGobbleAndFly() {
        turkey.gobble();
        turkey.fly();

        Assert.assertEquals("Gobble gobble\n" +
                "I'm flying a short distance\n", outContent.toString());
    }

    @Test
    public void mallardDuckShouldQuackAndFly() {
        testDuck(duck);

        Assert.assertEquals("Quack\n" +
                "I'm flying\n", outContent.toString());
    }

    @Test
    public void turkeyAdapterShouldQuackAndFly() {
        testDuck(turkeyAdapter);

        Assert.assertEquals("Gobble gobble\n" +
                "I'm flying a short distance\n" +
                "I'm flying a short distance\n" +
                "I'm flying a short distance\n" +
                "I'm flying a short distance\n" +
                "I'm flying a short distance\n", outContent.toString());
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

    @After
    public void tearDown() {
        System.setOut(null);
    }
}
