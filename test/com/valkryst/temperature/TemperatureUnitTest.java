package com.valkryst.temperature;

import org.junit.Assert;
import org.junit.Test;

public class TemperatureUnitTest {
    @Test
    public void getCelsiusSymbol() {
        final String expectedSymbol = TemperatureUnit.getSymbol(TemperatureUnit.CELSIUS);
        Assert.assertEquals("°C", expectedSymbol);
    }

    @Test
    public void getDelisleSymbol() {
        final String expectedSymbol = TemperatureUnit.getSymbol(TemperatureUnit.DELISLE);
        Assert.assertEquals("°De", expectedSymbol);
    }

    @Test
    public void getFahrenheitSymbol() {
        final String expectedSymbol = TemperatureUnit.getSymbol(TemperatureUnit.FAHRENHEIT);
        Assert.assertEquals("°F", expectedSymbol);
    }

    @Test
    public void getKelvinSymbol() {
        final String expectedSymbol = TemperatureUnit.getSymbol(TemperatureUnit.KELVIN);
        Assert.assertEquals("K", expectedSymbol);
    }

    @Test
    public void getNewtonSymbol() {
        final String expectedSymbol = TemperatureUnit.getSymbol(TemperatureUnit.NEWTON);
        Assert.assertEquals("°N", expectedSymbol);
    }

    @Test
    public void getRankineSymbol() {
        final String expectedSymbol = TemperatureUnit.getSymbol(TemperatureUnit.RANKINE);
        Assert.assertEquals("°Ra", expectedSymbol);
    }

    @Test
    public void getReaumurSymbol() {
        final String expectedSymbol = TemperatureUnit.getSymbol(TemperatureUnit.REAUMUR);
        Assert.assertEquals("°R", expectedSymbol);
    }

    @Test
    public void getRomerSymbol() {
        final String expectedSymbol = TemperatureUnit.getSymbol(TemperatureUnit.ROMER);
        Assert.assertEquals("°Rø", expectedSymbol);
    }
}
