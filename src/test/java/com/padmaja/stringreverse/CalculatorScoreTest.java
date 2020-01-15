package com.padmaja.stringreverse;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorScoreTest {
    CalculatorScore calculatorScore;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("set up class");
        // ForLoopExample forLoopExample = new ForLoopExample();
    }

    @Before
    public void setUp() {
        calculatorScore = new CalculatorScore();


    }

    @After
    public void tearDown() {
        System.out.println("tear down");


    }




    @Test
    public void calculatorScore1() {
        int result = CalculatorScore.calculateHighScorePosition(1500);
        CalculatorScore.displayHighScorePosition("One", 6);
        int expectedresult=1;
        assertEquals(expectedresult,result);

    }

    @Test
    public void displayHighScorePosition1() {
        int result = calculatorScore.calculateHighScorePosition(900);
        CalculatorScore.displayHighScorePosition("Two", 60);
        int expectedresult=2;
        assertEquals(expectedresult,result);


    }

    @Test
    public void calculateHighScorePosition() {
        int result = calculatorScore.calculateHighScorePosition(400);
        CalculatorScore.displayHighScorePosition("Three", 50);
        int expectedresult=3;
        assertEquals(expectedresult,result);


    }

    @Test
    public void calculateScore1() {
        int result = calculatorScore.calculateHighScorePosition(50);
        CalculatorScore.displayHighScorePosition("Four", 35);
        int expectedresult=4;
        assertEquals(expectedresult,result);


        calculatorScore.CalculatorScore();
    }

    @Test
    public void calculatorScore11() {
        int result = CalculatorScore.calculateHighScorePosition(1000);
        CalculatorScore.displayHighScorePosition("Five", 5000);
        int expectedresult=4;
        assertEquals(expectedresult,result);



    }

    @Test
    public void calculatorScore12() {
        int result = CalculatorScore.calculateHighScorePosition(500);
        CalculatorScore.displayHighScorePosition("Six", 6);
        int expectedresult=4;
        assertEquals(expectedresult,result);



    }

    @Test
    public void calculatorScore15() {
        int result = CalculatorScore.calculateHighScorePosition(100);
        CalculatorScore.displayHighScorePosition("Seven", 6);
        int expectedresult=4;
        assertEquals(expectedresult,result);



    }

    @Test
    public void calculatorScoreinvalid() {
        int result = CalculatorScore.calculateHighScorePosition(0);
        CalculatorScore.displayHighScorePosition("Tim", 6);
        int expectedresult=4;
        assertEquals(expectedresult,result);



    }
    @Test
    public void calculatorScoreinvalid1() {
        int result = CalculatorScore.calculateHighScorePosition(-1422423);
        CalculatorScore.displayHighScorePosition("Tim", -133345);
        int expectedresult=4;
        assertEquals(expectedresult,result);



    }







}