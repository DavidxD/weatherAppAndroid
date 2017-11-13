package com.example.davidrodriguezbaez.weatherapp;

import org.junit.Test;

import static org.junit.Assert.*;
import com.example.davidrodriguezbaez.weatherapp.FragmentWeather;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void testConvertKelvinToCelsius() {
        String actual = FragmentWeather.KelvinToCelsius("277,15");
        // expected value is 100
        String expected = "4";
        // use this method because float is not precise
        assertEquals("Conversion from kelvin to Celsius failed", expected, actual);
    }
}