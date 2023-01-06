package org.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

public class CalcCharTest extends TestCase {

    private final String text = "Hello world!";

    @Test
    public void testCalcA() {
        Assert.assertThat(new CalcChar().calc(text), is(12));
    }

    @Test
    public void testCalcB() {
        Assert.assertThat(new CalcChar().calc(text), not(10));
    }

}