package javadev;

import org.junit.Assert;

public class vowelOnlyTest {

    @org.junit.Test
    public void vowelOnlyTest() throws Exception {

        String input = "Hello world";
        String output = vowelOnly.vowelOnly(input);
        String expected = "eoo";
        Assert.assertEquals(expected, output);
    }


    @org.junit.Test
    public void vowelOnlyTest2() throws Exception {

        String input = "Ja sam Tomislav";
        String output = vowelOnly.vowelOnly(input);
        String expected = "aaoia";
        Assert.assertEquals(expected, output);
    }

}
