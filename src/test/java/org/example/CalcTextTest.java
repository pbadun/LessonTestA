package org.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

public class CalcTextTest extends TestCase {

    private final String text = "Hello my world";

    @Test
    public void testCountWorldA() {
        Assert.assertThat(new CalcText().countWorld(text), is(3));
    }

    @Test
    public void testCountWorldB() {
        Assert.assertThat(new CalcText().countWorld(text), not(2));
    }

    //@Ignore
    @Test
    public void testCountWorldC() {
        //TODO Тут заведомо провальный тест.
        Assert.assertThat(new CalcText().countWorld(text), not(3));
    }

    @Test
    public void testCountWorldD() {
        assertEquals(new CalcText().countWorld(text), 3);
    }
}