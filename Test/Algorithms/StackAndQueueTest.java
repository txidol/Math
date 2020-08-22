package Algorithms;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackAndQueueTest {

    @Test
    public void isValid() {
        StackAndQueue s = new StackAndQueue();
        Assert.assertTrue(s.isValid("(){}[]"));
        Assert.assertTrue(s.isValid("({}[])"));
        Assert.assertFalse(s.isValid("()){}[]"));
        Assert.assertFalse(s.isValid("({)}[]"));
        Assert.assertFalse(s.isValid("(){}[])"));
    }

    @Test
    public void isValid2() {
        StackAndQueue s = new StackAndQueue();
        Assert.assertTrue(s.isValid2("(){}[]"));
        Assert.assertTrue(s.isValid2("({}[])"));
        Assert.assertFalse(s.isValid2("()){}[]"));
        Assert.assertFalse(s.isValid2("({)}[]"));
        Assert.assertFalse(s.isValid2("(){}[])"));
    }
}