package com.valkryst.temperature;

import org.junit.Assert;
import org.junit.Test;

public class TemperatureTest {
    @Test
    public void getAsCelsius() {
        // Using the values of "Absolute Zero" as the temperatures. Taken from the following page:
        // http://wiki.homedistiller.org/index.php/Temperature_conversion_formulas
        final Temperature celsiusTemp = new Temperature(TemperatureUnit.CELSIUS, -273.15);
        final Temperature delisleTemp = new Temperature(TemperatureUnit.DELISLE, 559.73);
        final Temperature fahrenheitTemp = new Temperature(TemperatureUnit.FAHRENHEIT, -459.67);
        final Temperature kelvinTemp = new Temperature(TemperatureUnit.KELVIN, 0);
        final Temperature newtonTemp = new Temperature(TemperatureUnit.NEWTON, -90.14);
        final Temperature rankineTemp = new Temperature(TemperatureUnit.RANKINE, 0);
        final Temperature reaumurTemp = new Temperature(TemperatureUnit.REAUMUR, -218.52);
        final Temperature romerTemp = new Temperature(TemperatureUnit.ROMER, -135.9);

        final double celsiusResult = celsiusTemp.getAsCelsius();
        final double delisleResult = delisleTemp.getAsCelsius();
        final double fahrenheitResult = fahrenheitTemp.getAsCelsius();
        final double kelvinResult = kelvinTemp.getAsCelsius();
        final double newtonResult = newtonTemp.getAsCelsius();
        final double rankineResult = rankineTemp.getAsCelsius();
        final double reaumurResult = reaumurTemp.getAsCelsius();
        final double romerResult = romerTemp.getAsCelsius();

        // Allow for a 0.02 margin of error caused by rounded values being used as the test data:
        Assert.assertEquals(celsiusResult, celsiusResult, 0.02);
        Assert.assertEquals(celsiusResult, delisleResult, 0.02);
        Assert.assertEquals(celsiusResult, fahrenheitResult, 0.02);
        Assert.assertEquals(celsiusResult, kelvinResult, 0.02);
        Assert.assertEquals(celsiusResult, newtonResult, 0.02);
        Assert.assertEquals(celsiusResult, rankineResult, 0.02);
        Assert.assertEquals(rankineResult, reaumurResult, 0.02);
        Assert.assertEquals(celsiusResult, romerResult, 0.02);
    }

    @Test
    public void getAsDelisle() {
        // Using the values of "Absolute Zero" as the temperatures. Taken from the following page:
        // http://wiki.homedistiller.org/index.php/Temperature_conversion_formulas
        final Temperature celsiusTemp = new Temperature(TemperatureUnit.CELSIUS, -273.15);
        final Temperature delisleTemp = new Temperature(TemperatureUnit.DELISLE, 559.73);
        final Temperature fahrenheitTemp = new Temperature(TemperatureUnit.FAHRENHEIT, -459.67);
        final Temperature kelvinTemp = new Temperature(TemperatureUnit.KELVIN, 0);
        final Temperature newtonTemp = new Temperature(TemperatureUnit.NEWTON, -90.14);
        final Temperature rankineTemp = new Temperature(TemperatureUnit.RANKINE, 0);
        final Temperature reaumurTemp = new Temperature(TemperatureUnit.REAUMUR, -218.52);
        final Temperature romerTemp = new Temperature(TemperatureUnit.ROMER, -135.9);

        final double celsiusResult = celsiusTemp.getAsCelsius();
        final double delisleResult = delisleTemp.getAsCelsius();
        final double fahrenheitResult = fahrenheitTemp.getAsCelsius();
        final double kelvinResult = kelvinTemp.getAsCelsius();
        final double newtonResult = newtonTemp.getAsCelsius();
        final double rankineResult = rankineTemp.getAsCelsius();
        final double reaumurResult = reaumurTemp.getAsCelsius();
        final double romerResult = romerTemp.getAsCelsius();

        // Allow for a 0.02 margin of error caused by rounded values being used as the test data:
        Assert.assertEquals(delisleResult, celsiusResult, 0.02);
        Assert.assertEquals(delisleResult, delisleResult, 0.02);
        Assert.assertEquals(delisleResult, fahrenheitResult, 0.02);
        Assert.assertEquals(delisleResult, kelvinResult, 0.02);
        Assert.assertEquals(delisleResult, newtonResult, 0.02);
        Assert.assertEquals(delisleResult, rankineResult, 0.02);
        Assert.assertEquals(rankineResult, reaumurResult, 0.02);
        Assert.assertEquals(delisleResult, romerResult, 0.02);
    }

    @Test
    public void getAsFahrenheit() {
        // Using the values of "Absolute Zero" as the temperatures. Taken from the following page:
        // http://wiki.homedistiller.org/index.php/Temperature_conversion_formulas
        final Temperature celsiusTemp = new Temperature(TemperatureUnit.CELSIUS, -273.15);
        final Temperature delisleTemp = new Temperature(TemperatureUnit.DELISLE, 559.73);
        final Temperature fahrenheitTemp = new Temperature(TemperatureUnit.FAHRENHEIT, -459.67);
        final Temperature kelvinTemp = new Temperature(TemperatureUnit.KELVIN, 0);
        final Temperature newtonTemp = new Temperature(TemperatureUnit.NEWTON, -90.14);
        final Temperature rankineTemp = new Temperature(TemperatureUnit.RANKINE, 0);
        final Temperature reaumurTemp = new Temperature(TemperatureUnit.REAUMUR, -218.52);
        final Temperature romerTemp = new Temperature(TemperatureUnit.ROMER, -135.9);

        final double celsiusResult = celsiusTemp.getAsCelsius();
        final double delisleResult = delisleTemp.getAsCelsius();
        final double fahrenheitResult = fahrenheitTemp.getAsCelsius();
        final double kelvinResult = kelvinTemp.getAsCelsius();
        final double newtonResult = newtonTemp.getAsCelsius();
        final double rankineResult = rankineTemp.getAsCelsius();
        final double reaumurResult = reaumurTemp.getAsCelsius();
        final double romerResult = romerTemp.getAsCelsius();

        // Allow for a 0.02 margin of error caused by rounded values being used as the test data:
        Assert.assertEquals(fahrenheitResult, celsiusResult, 0.02);
        Assert.assertEquals(fahrenheitResult, delisleResult, 0.02);
        Assert.assertEquals(fahrenheitResult, fahrenheitResult, 0.02);
        Assert.assertEquals(fahrenheitResult, kelvinResult, 0.02);
        Assert.assertEquals(fahrenheitResult, newtonResult, 0.02);
        Assert.assertEquals(fahrenheitResult, rankineResult, 0.02);
        Assert.assertEquals(rankineResult, reaumurResult, 0.02);
        Assert.assertEquals(fahrenheitResult, romerResult, 0.02);
    }

    @Test
    public void getAsKelvin() {
        // Using the values of "Absolute Zero" as the temperatures. Taken from the following page:
        // http://wiki.homedistiller.org/index.php/Temperature_conversion_formulas
        final Temperature celsiusTemp = new Temperature(TemperatureUnit.CELSIUS, -273.15);
        final Temperature delisleTemp = new Temperature(TemperatureUnit.DELISLE, 559.73);
        final Temperature fahrenheitTemp = new Temperature(TemperatureUnit.FAHRENHEIT, -459.67);
        final Temperature kelvinTemp = new Temperature(TemperatureUnit.KELVIN, 0);
        final Temperature newtonTemp = new Temperature(TemperatureUnit.NEWTON, -90.14);
        final Temperature rankineTemp = new Temperature(TemperatureUnit.RANKINE, 0);
        final Temperature reaumurTemp = new Temperature(TemperatureUnit.REAUMUR, -218.52);
        final Temperature romerTemp = new Temperature(TemperatureUnit.ROMER, -135.9);

        final double celsiusResult = celsiusTemp.getAsCelsius();
        final double delisleResult = delisleTemp.getAsCelsius();
        final double fahrenheitResult = fahrenheitTemp.getAsCelsius();
        final double kelvinResult = kelvinTemp.getAsCelsius();
        final double newtonResult = newtonTemp.getAsCelsius();
        final double rankineResult = rankineTemp.getAsCelsius();
        final double reaumurResult = reaumurTemp.getAsCelsius();
        final double romerResult = romerTemp.getAsCelsius();

        // Allow for a 0.02 margin of error caused by rounded values being used as the test data:
        Assert.assertEquals(kelvinResult, celsiusResult, 0.02);
        Assert.assertEquals(kelvinResult, delisleResult, 0.02);
        Assert.assertEquals(kelvinResult, fahrenheitResult, 0.02);
        Assert.assertEquals(kelvinResult, kelvinResult, 0.02);
        Assert.assertEquals(kelvinResult, newtonResult, 0.02);
        Assert.assertEquals(kelvinResult, rankineResult, 0.02);
        Assert.assertEquals(rankineResult, reaumurResult, 0.02);
        Assert.assertEquals(kelvinResult, romerResult, 0.02);
    }

    @Test
    public void getAsNewton() {
        // Using the values of "Absolute Zero" as the temperatures. Taken from the following page:
        // http://wiki.homedistiller.org/index.php/Temperature_conversion_formulas
        final Temperature celsiusTemp = new Temperature(TemperatureUnit.CELSIUS, -273.15);
        final Temperature delisleTemp = new Temperature(TemperatureUnit.DELISLE, 559.73);
        final Temperature fahrenheitTemp = new Temperature(TemperatureUnit.FAHRENHEIT, -459.67);
        final Temperature kelvinTemp = new Temperature(TemperatureUnit.KELVIN, 0);
        final Temperature newtonTemp = new Temperature(TemperatureUnit.NEWTON, -90.14);
        final Temperature rankineTemp = new Temperature(TemperatureUnit.RANKINE, 0);
        final Temperature reaumurTemp = new Temperature(TemperatureUnit.REAUMUR, -218.52);
        final Temperature romerTemp = new Temperature(TemperatureUnit.ROMER, -135.9);

        final double celsiusResult = celsiusTemp.getAsCelsius();
        final double delisleResult = delisleTemp.getAsCelsius();
        final double fahrenheitResult = fahrenheitTemp.getAsCelsius();
        final double kelvinResult = kelvinTemp.getAsCelsius();
        final double newtonResult = newtonTemp.getAsCelsius();
        final double rankineResult = rankineTemp.getAsCelsius();
        final double reaumurResult = reaumurTemp.getAsCelsius();
        final double romerResult = romerTemp.getAsCelsius();

        // Allow for a 0.02 margin of error caused by rounded values being used as the test data:
        Assert.assertEquals(newtonResult, celsiusResult, 0.02);
        Assert.assertEquals(newtonResult, delisleResult, 0.02);
        Assert.assertEquals(newtonResult, fahrenheitResult, 0.02);
        Assert.assertEquals(newtonResult, kelvinResult, 0.02);
        Assert.assertEquals(newtonResult, newtonResult, 0.02);
        Assert.assertEquals(newtonResult, rankineResult, 0.02);
        Assert.assertEquals(rankineResult, reaumurResult, 0.02);
        Assert.assertEquals(newtonResult, romerResult, 0.02);
    }

    @Test
    public void getAsRankine() {
        // Using the values of "Absolute Zero" as the temperatures. Taken from the following page:
        // http://wiki.homedistiller.org/index.php/Temperature_conversion_formulas
        final Temperature celsiusTemp = new Temperature(TemperatureUnit.CELSIUS, -273.15);
        final Temperature delisleTemp = new Temperature(TemperatureUnit.DELISLE, 559.73);
        final Temperature fahrenheitTemp = new Temperature(TemperatureUnit.FAHRENHEIT, -459.67);
        final Temperature kelvinTemp = new Temperature(TemperatureUnit.KELVIN, 0);
        final Temperature newtonTemp = new Temperature(TemperatureUnit.NEWTON, -90.14);
        final Temperature rankineTemp = new Temperature(TemperatureUnit.RANKINE, 0);
        final Temperature reaumurTemp = new Temperature(TemperatureUnit.REAUMUR, -218.52);
        final Temperature romerTemp = new Temperature(TemperatureUnit.ROMER, -135.9);

        final double celsiusResult = celsiusTemp.getAsCelsius();
        final double delisleResult = delisleTemp.getAsCelsius();
        final double fahrenheitResult = fahrenheitTemp.getAsCelsius();
        final double kelvinResult = kelvinTemp.getAsCelsius();
        final double newtonResult = newtonTemp.getAsCelsius();
        final double rankineResult = rankineTemp.getAsCelsius();
        final double reaumurResult = reaumurTemp.getAsCelsius();
        final double romerResult = romerTemp.getAsCelsius();

        // Allow for a 0.02 margin of error caused by rounded values being used as the test data:
        Assert.assertEquals(rankineResult, celsiusResult, 0.02);
        Assert.assertEquals(rankineResult, delisleResult, 0.02);
        Assert.assertEquals(rankineResult, fahrenheitResult, 0.02);
        Assert.assertEquals(rankineResult, kelvinResult, 0.02);
        Assert.assertEquals(rankineResult, newtonResult, 0.02);
        Assert.assertEquals(rankineResult, rankineResult, 0.02);
        Assert.assertEquals(rankineResult, reaumurResult, 0.02);
        Assert.assertEquals(rankineResult, romerResult, 0.02);
    }

    @Test
    public void getAsReaumur() {
        // Using the values of "Absolute Zero" as the temperatures. Taken from the following page:
        // http://wiki.homedistiller.org/index.php/Temperature_conversion_formulas
        final Temperature celsiusTemp = new Temperature(TemperatureUnit.CELSIUS, -273.15);
        final Temperature delisleTemp = new Temperature(TemperatureUnit.DELISLE, 559.73);
        final Temperature fahrenheitTemp = new Temperature(TemperatureUnit.FAHRENHEIT, -459.67);
        final Temperature kelvinTemp = new Temperature(TemperatureUnit.KELVIN, 0);
        final Temperature newtonTemp = new Temperature(TemperatureUnit.NEWTON, -90.14);
        final Temperature rankineTemp = new Temperature(TemperatureUnit.RANKINE, 0);
        final Temperature reaumurTemp = new Temperature(TemperatureUnit.REAUMUR, -218.52);
        final Temperature romerTemp = new Temperature(TemperatureUnit.ROMER, -135.9);

        final double celsiusResult = celsiusTemp.getAsCelsius();
        final double delisleResult = delisleTemp.getAsCelsius();
        final double fahrenheitResult = fahrenheitTemp.getAsCelsius();
        final double kelvinResult = kelvinTemp.getAsCelsius();
        final double newtonResult = newtonTemp.getAsCelsius();
        final double rankineResult = rankineTemp.getAsCelsius();
        final double reaumurResult = reaumurTemp.getAsCelsius();
        final double romerResult = romerTemp.getAsCelsius();

        // Allow for a 0.02 margin of error caused by rounded values being used as the test data:
        Assert.assertEquals(reaumurResult, celsiusResult, 0.02);
        Assert.assertEquals(reaumurResult, delisleResult, 0.02);
        Assert.assertEquals(reaumurResult, fahrenheitResult, 0.02);
        Assert.assertEquals(reaumurResult, kelvinResult, 0.02);
        Assert.assertEquals(reaumurResult, newtonResult, 0.02);
        Assert.assertEquals(reaumurResult, rankineResult, 0.02);
        Assert.assertEquals(reaumurResult, reaumurResult, 0.02);
        Assert.assertEquals(reaumurResult, romerResult, 0.02);
    }

    @Test
    public void getAsRomer() {
        // Using the values of "Absolute Zero" as the temperatures. Taken from the following page:
        // http://wiki.homedistiller.org/index.php/Temperature_conversion_formulas
        final Temperature celsiusTemp = new Temperature(TemperatureUnit.CELSIUS, -273.15);
        final Temperature delisleTemp = new Temperature(TemperatureUnit.DELISLE, 559.73);
        final Temperature fahrenheitTemp = new Temperature(TemperatureUnit.FAHRENHEIT, -459.67);
        final Temperature kelvinTemp = new Temperature(TemperatureUnit.KELVIN, 0);
        final Temperature newtonTemp = new Temperature(TemperatureUnit.NEWTON, -90.14);
        final Temperature rankineTemp = new Temperature(TemperatureUnit.RANKINE, 0);
        final Temperature reaumurTemp = new Temperature(TemperatureUnit.REAUMUR, -218.52);
        final Temperature romerTemp = new Temperature(TemperatureUnit.ROMER, -135.9);

        final double celsiusResult = celsiusTemp.getAsCelsius();
        final double delisleResult = delisleTemp.getAsCelsius();
        final double fahrenheitResult = fahrenheitTemp.getAsCelsius();
        final double kelvinResult = kelvinTemp.getAsCelsius();
        final double newtonResult = newtonTemp.getAsCelsius();
        final double rankineResult = rankineTemp.getAsCelsius();
        final double reaumurResult = reaumurTemp.getAsCelsius();
        final double romerResult = romerTemp.getAsCelsius();

        // Allow for a 0.02 margin of error caused by rounded values being used as the test data:
        Assert.assertEquals(romerResult, celsiusResult, 0.02);
        Assert.assertEquals(romerResult, delisleResult, 0.02);
        Assert.assertEquals(romerResult, fahrenheitResult, 0.02);
        Assert.assertEquals(romerResult, kelvinResult, 0.02);
        Assert.assertEquals(romerResult, newtonResult, 0.02);
        Assert.assertEquals(romerResult, rankineResult, 0.02);
        Assert.assertEquals(romerResult, reaumurResult, 0.02);
        Assert.assertEquals(romerResult, romerResult, 0.02);
    }
}
