package com.valkryst.temperature;

import org.junit.Assert;
import org.junit.Test;

public class TemperatureTest {
    // Using the values of "Absolute Zero" as the temperatures. Taken from the following page:
    // http://wiki.homedistiller.org/index.php/Temperature_conversion_formulas
    private Temperature celsiusTemp;
    private Temperature delisleTemp;
    private Temperature fahrenheitTemp;
    private Temperature kelvinTemp;
    private Temperature newtonTemp;
    private Temperature rankineTemp;
    private Temperature reaumurTemp;
    private Temperature romerTemp;

    private void setTestData() {
        celsiusTemp = new Temperature(TemperatureUnit.CELSIUS, -273.15);
        delisleTemp = new Temperature(TemperatureUnit.DELISLE, 559.73);
        fahrenheitTemp = new Temperature(TemperatureUnit.FAHRENHEIT, -459.67);
        kelvinTemp = new Temperature(TemperatureUnit.KELVIN, 0);
        newtonTemp = new Temperature(TemperatureUnit.NEWTON, -90.14);
        rankineTemp = new Temperature(TemperatureUnit.RANKINE, 0);
        reaumurTemp = new Temperature(TemperatureUnit.REAUMUR, -218.52);
        romerTemp = new Temperature(TemperatureUnit.ROMER, -135.9);
    }

    @Test
    public void getAsCelsius() {
        setTestData();

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
        Assert.assertEquals(celsiusResult, reaumurResult, 0.02);
        Assert.assertEquals(celsiusResult, romerResult, 0.02);
    }

    @Test
    public void getAsDelisle() {
        setTestData();

        final double celsiusResult = celsiusTemp.getAsDelisle();
        final double delisleResult = delisleTemp.getAsDelisle();
        final double fahrenheitResult = fahrenheitTemp.getAsDelisle();
        final double kelvinResult = kelvinTemp.getAsDelisle();
        final double newtonResult = newtonTemp.getAsDelisle();
        final double rankineResult = rankineTemp.getAsDelisle();
        final double reaumurResult = reaumurTemp.getAsDelisle();
        final double romerResult = romerTemp.getAsDelisle();

        // Allow for a 0.02 margin of error caused by rounded values being used as the test data:
        Assert.assertEquals(delisleResult, celsiusResult, 0.02);
        Assert.assertEquals(delisleResult, delisleResult, 0.02);
        Assert.assertEquals(delisleResult, fahrenheitResult, 0.02);
        Assert.assertEquals(delisleResult, kelvinResult, 0.02);
        Assert.assertEquals(delisleResult, newtonResult, 0.02);
        Assert.assertEquals(delisleResult, rankineResult, 0.02);
        Assert.assertEquals(delisleResult, reaumurResult, 0.02);
        Assert.assertEquals(delisleResult, romerResult, 0.02);
    }

    @Test
    public void getAsFahrenheit() {
        setTestData();

        final double celsiusResult = celsiusTemp.getAsFahrenheit();
        final double delisleResult = delisleTemp.getAsFahrenheit();
        final double fahrenheitResult = fahrenheitTemp.getAsFahrenheit();
        final double kelvinResult = kelvinTemp.getAsFahrenheit();
        final double newtonResult = newtonTemp.getAsFahrenheit();
        final double rankineResult = rankineTemp.getAsFahrenheit();
        final double reaumurResult = reaumurTemp.getAsFahrenheit();
        final double romerResult = romerTemp.getAsFahrenheit();

        // Allow for a 0.02 margin of error caused by rounded values being used as the test data:
        Assert.assertEquals(fahrenheitResult, celsiusResult, 0.02);
        Assert.assertEquals(fahrenheitResult, delisleResult, 0.02);
        Assert.assertEquals(fahrenheitResult, fahrenheitResult, 0.02);
        Assert.assertEquals(fahrenheitResult, kelvinResult, 0.02);
        Assert.assertEquals(fahrenheitResult, newtonResult, 0.02);
        Assert.assertEquals(fahrenheitResult, rankineResult, 0.02);
        Assert.assertEquals(fahrenheitResult, reaumurResult, 0.02);
        Assert.assertEquals(fahrenheitResult, romerResult, 0.02);
    }

    @Test
    public void getAsKelvin() {
        setTestData();

        final double celsiusResult = celsiusTemp.getAsKelvin();
        final double delisleResult = delisleTemp.getAsKelvin();
        final double fahrenheitResult = fahrenheitTemp.getAsKelvin();
        final double kelvinResult = kelvinTemp.getAsKelvin();
        final double newtonResult = newtonTemp.getAsKelvin();
        final double rankineResult = rankineTemp.getAsKelvin();
        final double reaumurResult = reaumurTemp.getAsKelvin();
        final double romerResult = romerTemp.getAsKelvin();

        // Allow for a 0.02 margin of error caused by rounded values being used as the test data:
        Assert.assertEquals(kelvinResult, celsiusResult, 0.02);
        Assert.assertEquals(kelvinResult, delisleResult, 0.02);
        Assert.assertEquals(kelvinResult, fahrenheitResult, 0.02);
        Assert.assertEquals(kelvinResult, kelvinResult, 0.02);
        Assert.assertEquals(kelvinResult, newtonResult, 0.02);
        Assert.assertEquals(kelvinResult, rankineResult, 0.02);
        Assert.assertEquals(kelvinResult, reaumurResult, 0.02);
        Assert.assertEquals(kelvinResult, romerResult, 0.02);
    }

    @Test
    public void getAsNewton() {
        setTestData();

        final double celsiusResult = celsiusTemp.getAsNewton();
        final double delisleResult = delisleTemp.getAsNewton();
        final double fahrenheitResult = fahrenheitTemp.getAsNewton();
        final double kelvinResult = kelvinTemp.getAsNewton();
        final double newtonResult = newtonTemp.getAsNewton();
        final double rankineResult = rankineTemp.getAsNewton();
        final double reaumurResult = reaumurTemp.getAsNewton();
        final double romerResult = romerTemp.getAsNewton();

        // Allow for a 0.02 margin of error caused by rounded values being used as the test data:
        Assert.assertEquals(newtonResult, celsiusResult, 0.02);
        Assert.assertEquals(newtonResult, delisleResult, 0.02);
        Assert.assertEquals(newtonResult, fahrenheitResult, 0.02);
        Assert.assertEquals(newtonResult, kelvinResult, 0.02);
        Assert.assertEquals(newtonResult, newtonResult, 0.02);
        Assert.assertEquals(newtonResult, rankineResult, 0.02);
        Assert.assertEquals(newtonResult, reaumurResult, 0.02);
        Assert.assertEquals(newtonResult, romerResult, 0.02);
    }

    @Test
    public void getAsRankine() {
        setTestData();

        final double celsiusResult = celsiusTemp.getAsRankine();
        final double delisleResult = delisleTemp.getAsRankine();
        final double fahrenheitResult = fahrenheitTemp.getAsRankine();
        final double kelvinResult = kelvinTemp.getAsRankine();
        final double newtonResult = newtonTemp.getAsRankine();
        final double rankineResult = rankineTemp.getAsRankine();
        final double reaumurResult = reaumurTemp.getAsRankine();
        final double romerResult = romerTemp.getAsRankine();

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
        setTestData();

        final double celsiusResult = celsiusTemp.getAsReaumur();
        final double delisleResult = delisleTemp.getAsReaumur();
        final double fahrenheitResult = fahrenheitTemp.getAsReaumur();
        final double kelvinResult = kelvinTemp.getAsReaumur();
        final double newtonResult = newtonTemp.getAsReaumur();
        final double rankineResult = rankineTemp.getAsReaumur();
        final double reaumurResult = reaumurTemp.getAsReaumur();
        final double romerResult = romerTemp.getAsReaumur();

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
        setTestData();

        final double celsiusResult = celsiusTemp.getAsRomer();
        final double delisleResult = delisleTemp.getAsRomer();
        final double fahrenheitResult = fahrenheitTemp.getAsRomer();
        final double kelvinResult = kelvinTemp.getAsRomer();
        final double newtonResult = newtonTemp.getAsRomer();
        final double rankineResult = rankineTemp.getAsRomer();
        final double reaumurResult = reaumurTemp.getAsRomer();
        final double romerResult = romerTemp.getAsRomer();

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
        setTestData();

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
        setTestData();

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
        setTestData();

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
        setTestData();

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
        setTestData();

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
        setTestData();

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
        setTestData();

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
        setTestData();

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
