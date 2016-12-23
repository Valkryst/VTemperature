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

    @Test
    public void convertToCelsius() {
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

        Assert.assertEquals(celsiusTemp.getTemperature(), celsiusTemp.convertToUnit(TemperatureUnit.CELSIUS).get().getTemperature(), 0.2);
        Assert.assertEquals(celsiusTemp.getTemperature(), delisleTemp.convertToUnit(TemperatureUnit.CELSIUS).get().getTemperature(), 0.2);
        Assert.assertEquals(celsiusTemp.getTemperature(), fahrenheitTemp.convertToUnit(TemperatureUnit.CELSIUS).get().getTemperature(), 0.2);
        Assert.assertEquals(celsiusTemp.getTemperature(), kelvinTemp.convertToUnit(TemperatureUnit.CELSIUS).get().getTemperature(), 0.2);
        Assert.assertEquals(celsiusTemp.getTemperature(), newtonTemp.convertToUnit(TemperatureUnit.CELSIUS).get().getTemperature(), 0.2);
        Assert.assertEquals(celsiusTemp.getTemperature(), rankineTemp.convertToUnit(TemperatureUnit.CELSIUS).get().getTemperature(), 0.2);
        Assert.assertEquals(celsiusTemp.getTemperature(), reaumurTemp.convertToUnit(TemperatureUnit.CELSIUS).get().getTemperature(), 0.2);
        Assert.assertEquals(celsiusTemp.getTemperature(), romerTemp.convertToUnit(TemperatureUnit.CELSIUS).get().getTemperature(), 0.2);
    }

    @Test
    public void convertToDelisle() {
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

        Assert.assertEquals(delisleTemp.getTemperature(), celsiusTemp.convertToUnit(TemperatureUnit.DELISLE).get().getTemperature(), 0.2);
        Assert.assertEquals(delisleTemp.getTemperature(), delisleTemp.convertToUnit(TemperatureUnit.DELISLE).get().getTemperature(), 0.2);
        Assert.assertEquals(delisleTemp.getTemperature(), fahrenheitTemp.convertToUnit(TemperatureUnit.DELISLE).get().getTemperature(), 0.2);
        Assert.assertEquals(delisleTemp.getTemperature(), kelvinTemp.convertToUnit(TemperatureUnit.DELISLE).get().getTemperature(), 0.2);
        Assert.assertEquals(delisleTemp.getTemperature(), newtonTemp.convertToUnit(TemperatureUnit.DELISLE).get().getTemperature(), 0.2);
        Assert.assertEquals(delisleTemp.getTemperature(), rankineTemp.convertToUnit(TemperatureUnit.DELISLE).get().getTemperature(), 0.2);
        Assert.assertEquals(delisleTemp.getTemperature(), reaumurTemp.convertToUnit(TemperatureUnit.DELISLE).get().getTemperature(), 0.2);
        Assert.assertEquals(delisleTemp.getTemperature(), romerTemp.convertToUnit(TemperatureUnit.DELISLE).get().getTemperature(), 0.2);
    }

    @Test
    public void convertToFahrenheit() {
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

        Assert.assertEquals(fahrenheitTemp.getTemperature(), celsiusTemp.convertToUnit(TemperatureUnit.FAHRENHEIT).get().getTemperature(), 0.2);
        Assert.assertEquals(fahrenheitTemp.getTemperature(), delisleTemp.convertToUnit(TemperatureUnit.FAHRENHEIT).get().getTemperature(), 0.2);
        Assert.assertEquals(fahrenheitTemp.getTemperature(), fahrenheitTemp.convertToUnit(TemperatureUnit.FAHRENHEIT).get().getTemperature(), 0.2);
        Assert.assertEquals(fahrenheitTemp.getTemperature(), kelvinTemp.convertToUnit(TemperatureUnit.FAHRENHEIT).get().getTemperature(), 0.2);
        Assert.assertEquals(fahrenheitTemp.getTemperature(), newtonTemp.convertToUnit(TemperatureUnit.FAHRENHEIT).get().getTemperature(), 0.2);
        Assert.assertEquals(fahrenheitTemp.getTemperature(), rankineTemp.convertToUnit(TemperatureUnit.FAHRENHEIT).get().getTemperature(), 0.2);
        Assert.assertEquals(fahrenheitTemp.getTemperature(), reaumurTemp.convertToUnit(TemperatureUnit.FAHRENHEIT).get().getTemperature(), 0.2);
        Assert.assertEquals(fahrenheitTemp.getTemperature(), romerTemp.convertToUnit(TemperatureUnit.FAHRENHEIT).get().getTemperature(), 0.2);
    }

    @Test
    public void convertToKelvin() {
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

        Assert.assertEquals(kelvinTemp.getTemperature(), celsiusTemp.convertToUnit(TemperatureUnit.KELVIN).get().getTemperature(), 0.2);
        Assert.assertEquals(kelvinTemp.getTemperature(), delisleTemp.convertToUnit(TemperatureUnit.KELVIN).get().getTemperature(), 0.2);
        Assert.assertEquals(kelvinTemp.getTemperature(), fahrenheitTemp.convertToUnit(TemperatureUnit.KELVIN).get().getTemperature(), 0.2);
        Assert.assertEquals(kelvinTemp.getTemperature(), kelvinTemp.convertToUnit(TemperatureUnit.KELVIN).get().getTemperature(), 0.2);
        Assert.assertEquals(kelvinTemp.getTemperature(), newtonTemp.convertToUnit(TemperatureUnit.KELVIN).get().getTemperature(), 0.2);
        Assert.assertEquals(kelvinTemp.getTemperature(), rankineTemp.convertToUnit(TemperatureUnit.KELVIN).get().getTemperature(), 0.2);
        Assert.assertEquals(kelvinTemp.getTemperature(), reaumurTemp.convertToUnit(TemperatureUnit.KELVIN).get().getTemperature(), 0.2);
        Assert.assertEquals(kelvinTemp.getTemperature(), romerTemp.convertToUnit(TemperatureUnit.KELVIN).get().getTemperature(), 0.2);
    }

    @Test
    public void convertToNewton() {
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

        Assert.assertEquals(newtonTemp.getTemperature(), celsiusTemp.convertToUnit(TemperatureUnit.NEWTON).get().getTemperature(), 0.2);
        Assert.assertEquals(newtonTemp.getTemperature(), delisleTemp.convertToUnit(TemperatureUnit.NEWTON).get().getTemperature(), 0.2);
        Assert.assertEquals(newtonTemp.getTemperature(), fahrenheitTemp.convertToUnit(TemperatureUnit.NEWTON).get().getTemperature(), 0.2);
        Assert.assertEquals(newtonTemp.getTemperature(), kelvinTemp.convertToUnit(TemperatureUnit.NEWTON).get().getTemperature(), 0.2);
        Assert.assertEquals(newtonTemp.getTemperature(), newtonTemp.convertToUnit(TemperatureUnit.NEWTON).get().getTemperature(), 0.2);
        Assert.assertEquals(newtonTemp.getTemperature(), rankineTemp.convertToUnit(TemperatureUnit.NEWTON).get().getTemperature(), 0.2);
        Assert.assertEquals(newtonTemp.getTemperature(), reaumurTemp.convertToUnit(TemperatureUnit.NEWTON).get().getTemperature(), 0.2);
        Assert.assertEquals(newtonTemp.getTemperature(), romerTemp.convertToUnit(TemperatureUnit.NEWTON).get().getTemperature(), 0.2);
    }

    @Test
    public void convertToRankine() {
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

        Assert.assertEquals(rankineTemp.getTemperature(), celsiusTemp.convertToUnit(TemperatureUnit.RANKINE).get().getTemperature(), 0.2);
        Assert.assertEquals(rankineTemp.getTemperature(), delisleTemp.convertToUnit(TemperatureUnit.RANKINE).get().getTemperature(), 0.2);
        Assert.assertEquals(rankineTemp.getTemperature(), fahrenheitTemp.convertToUnit(TemperatureUnit.RANKINE).get().getTemperature(), 0.2);
        Assert.assertEquals(rankineTemp.getTemperature(), kelvinTemp.convertToUnit(TemperatureUnit.RANKINE).get().getTemperature(), 0.2);
        Assert.assertEquals(rankineTemp.getTemperature(), newtonTemp.convertToUnit(TemperatureUnit.RANKINE).get().getTemperature(), 0.2);
        Assert.assertEquals(rankineTemp.getTemperature(), rankineTemp.convertToUnit(TemperatureUnit.RANKINE).get().getTemperature(), 0.2);
        Assert.assertEquals(rankineTemp.getTemperature(), reaumurTemp.convertToUnit(TemperatureUnit.RANKINE).get().getTemperature(), 0.2);
        Assert.assertEquals(rankineTemp.getTemperature(), romerTemp.convertToUnit(TemperatureUnit.RANKINE).get().getTemperature(), 0.2);
    }

    @Test
    public void convertToReaumur() {
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

        Assert.assertEquals(reaumurTemp.getTemperature(), celsiusTemp.convertToUnit(TemperatureUnit.REAUMUR).get().getTemperature(), 0.2);
        Assert.assertEquals(reaumurTemp.getTemperature(), delisleTemp.convertToUnit(TemperatureUnit.REAUMUR).get().getTemperature(), 0.2);
        Assert.assertEquals(reaumurTemp.getTemperature(), fahrenheitTemp.convertToUnit(TemperatureUnit.REAUMUR).get().getTemperature(), 0.2);
        Assert.assertEquals(reaumurTemp.getTemperature(), kelvinTemp.convertToUnit(TemperatureUnit.REAUMUR).get().getTemperature(), 0.2);
        Assert.assertEquals(reaumurTemp.getTemperature(), newtonTemp.convertToUnit(TemperatureUnit.REAUMUR).get().getTemperature(), 0.2);
        Assert.assertEquals(reaumurTemp.getTemperature(), rankineTemp.convertToUnit(TemperatureUnit.REAUMUR).get().getTemperature(), 0.2);
        Assert.assertEquals(reaumurTemp.getTemperature(), reaumurTemp.convertToUnit(TemperatureUnit.REAUMUR).get().getTemperature(), 0.2);
        Assert.assertEquals(reaumurTemp.getTemperature(), romerTemp.convertToUnit(TemperatureUnit.REAUMUR).get().getTemperature(), 0.2);
    }

    @Test
    public void convertToRomer() {
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

        Assert.assertEquals(romerTemp.getTemperature(), celsiusTemp.convertToUnit(TemperatureUnit.ROMER).get().getTemperature(), 0.2);
        Assert.assertEquals(romerTemp.getTemperature(), delisleTemp.convertToUnit(TemperatureUnit.ROMER).get().getTemperature(), 0.2);
        Assert.assertEquals(romerTemp.getTemperature(), fahrenheitTemp.convertToUnit(TemperatureUnit.ROMER).get().getTemperature(), 0.2);
        Assert.assertEquals(romerTemp.getTemperature(), kelvinTemp.convertToUnit(TemperatureUnit.ROMER).get().getTemperature(), 0.2);
        Assert.assertEquals(romerTemp.getTemperature(), newtonTemp.convertToUnit(TemperatureUnit.ROMER).get().getTemperature(), 0.2);
        Assert.assertEquals(romerTemp.getTemperature(), rankineTemp.convertToUnit(TemperatureUnit.ROMER).get().getTemperature(), 0.2);
        Assert.assertEquals(romerTemp.getTemperature(), reaumurTemp.convertToUnit(TemperatureUnit.ROMER).get().getTemperature(), 0.2);
        Assert.assertEquals(romerTemp.getTemperature(), romerTemp.convertToUnit(TemperatureUnit.ROMER).get().getTemperature(), 0.2);
    }
}
