package com.serenitydojo;

import org.junit.Test;

import java.util.Locale;

public class HelloWorldWriterTest {
    @Test
    public void shouldWriteHelloWorldToTheConsole(){
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }

    @Test
    public void declaringNumericalVariables() {
        int ageThisYear = 42;
        int ageNextYear = ageThisYear + 1;

        long starsInTheGalaxy = 1000000000000000000L;
        double weight = 15.5;

        System.out.println("age = " + ageNextYear);

    }
        @Test
                public void workingWithStrings() {
        String firstName = "Sarah-Jane";

        String uppercaseFirstName = firstName.toUpperCase();

        System.out.println(uppercaseFirstName);

    }

}