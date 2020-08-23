package Algorithms;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class S11RecursionAndDivideConquerTest {

    S11RecursionAndDivideConquer test;
    @Before
    public void setUp() throws Exception {
        test = new S11RecursionAndDivideConquer();
    }

    @Test
    public void generatePDivi() {
        List<String> results = test.generateParenthesis(3);
        for (String result :results){
            System.out.println(result);
        }
    }


}