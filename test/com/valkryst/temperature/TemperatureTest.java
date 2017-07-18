package com.valkryst.temperature;

import org.junit.Assert;
import org.junit.Before;
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


    private double celsiusResult;
    private double delisleResult;
    private double fahrenheitResult;
    private double kelvinResult;
    private double newtonResult;
    private double rankineResult;
    private double reaumurResult;
    private double romerResult;

    @Before
    public void initializeTestData() {
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
    public void testConstructor_withValidInput() {
        final Temperature temperature = new Temperature(TemperatureUnit.CELSIUS, 1.0);
        Assert.assertEquals(TemperatureUnit.CELSIUS, temperature.getUnit());
        Assert.assertEquals(1.0, temperature.getTemperature(), 0.0);
    }

    @Test(expected=NullPointerException.class)
    public void testConstructor_withNullTemperatureUnit() {
        new Temperature(null, 1.0);
    }

    @Test
    public void testGetAsCelsius() {
        celsiusResult = celsiusTemp.getAsCelsius();
        delisleResult = delisleTemp.getAsCelsius();
        fahrenheitResult = fahrenheitTemp.getAsCelsius();
        kelvinResult = kelvinTemp.getAsCelsius();
        newtonResult = newtonTemp.getAsCelsius();
        rankineResult = rankineTemp.getAsCelsius();
        reaumurResult = reaumurTemp.getAsCelsius();
        romerResult = romerTemp.getAsCelsius();

        testGetAs(celsiusResult);
    }

    @Test
    public void testGetAsDelisle() {
        celsiusResult = celsiusTemp.getAsDelisle();
        delisleResult = delisleTemp.getAsDelisle();
        fahrenheitResult = fahrenheitTemp.getAsDelisle();
        kelvinResult = kelvinTemp.getAsDelisle();
        newtonResult = newtonTemp.getAsDelisle();
        rankineResult = rankineTemp.getAsDelisle();
        reaumurResult = reaumurTemp.getAsDelisle();
        romerResult = romerTemp.getAsDelisle();

        testGetAs(delisleResult);
    }

    @Test
    public void testGetAsFahrenheit() {
        celsiusResult = celsiusTemp.getAsFahrenheit();
        delisleResult = delisleTemp.getAsFahrenheit();
        fahrenheitResult = fahrenheitTemp.getAsFahrenheit();
        kelvinResult = kelvinTemp.getAsFahrenheit();
        newtonResult = newtonTemp.getAsFahrenheit();
        rankineResult = rankineTemp.getAsFahrenheit();
        reaumurResult = reaumurTemp.getAsFahrenheit();
        romerResult = romerTemp.getAsFahrenheit();

        testGetAs(fahrenheitResult);
    }

    @Test
    public void testGetAsKelvin() {
        celsiusResult = celsiusTemp.getAsKelvin();
        delisleResult = delisleTemp.getAsKelvin();
        fahrenheitResult = fahrenheitTemp.getAsKelvin();
        kelvinResult = kelvinTemp.getAsKelvin();
        newtonResult = newtonTemp.getAsKelvin();
        rankineResult = rankineTemp.getAsKelvin();
        reaumurResult = reaumurTemp.getAsKelvin();
        romerResult = romerTemp.getAsKelvin();

        testGetAs(kelvinResult);
    }

    @Test
    public void testGetAsNewton() {
        celsiusResult = celsiusTemp.getAsNewton();
        delisleResult = delisleTemp.getAsNewton();
        fahrenheitResult = fahrenheitTemp.getAsNewton();
        kelvinResult = kelvinTemp.getAsNewton();
        newtonResult = newtonTemp.getAsNewton();
        rankineResult = rankineTemp.getAsNewton();
        reaumurResult = reaumurTemp.getAsNewton();
        romerResult = romerTemp.getAsNewton();

        testGetAs(newtonResult);
    }

    @Test
    public void testGetAsRankine() {
        celsiusResult = celsiusTemp.getAsRankine();
        delisleResult = delisleTemp.getAsRankine();
        fahrenheitResult = fahrenheitTemp.getAsRankine();
        kelvinResult = kelvinTemp.getAsRankine();
        newtonResult = newtonTemp.getAsRankine();
        rankineResult = rankineTemp.getAsRankine();
        reaumurResult = reaumurTemp.getAsRankine();
        romerResult = romerTemp.getAsRankine();

        testGetAs(rankineResult);
    }

    @Test
    public void testGetAsReaumur() {
        celsiusResult = celsiusTemp.getAsReaumur();
        delisleResult = delisleTemp.getAsReaumur();
        fahrenheitResult = fahrenheitTemp.getAsReaumur();
        kelvinResult = kelvinTemp.getAsReaumur();
        newtonResult = newtonTemp.getAsReaumur();
        rankineResult = rankineTemp.getAsReaumur();
        reaumurResult = reaumurTemp.getAsReaumur();
        romerResult = romerTemp.getAsReaumur();

        testGetAs(reaumurResult);
    }

    @Test
    public void testGetAsRomer() {
        celsiusResult = celsiusTemp.getAsRomer();
        delisleResult = delisleTemp.getAsRomer();
        fahrenheitResult = fahrenheitTemp.getAsRomer();
        kelvinResult = kelvinTemp.getAsRomer();
        newtonResult = newtonTemp.getAsRomer();
        rankineResult = rankineTemp.getAsRomer();
        reaumurResult = reaumurTemp.getAsRomer();
        romerResult = romerTemp.getAsRomer();

        testGetAs(romerResult);
    }

    private void testGetAs(final double expectedResult) {
        // Allow for a 0.02 margin of error caused by rounded values being used as the test data:
        Assert.assertEquals(expectedResult, celsiusResult, 0.02);
        Assert.assertEquals(expectedResult, delisleResult, 0.02);
        Assert.assertEquals(expectedResult, fahrenheitResult, 0.02);
        Assert.assertEquals(expectedResult, kelvinResult, 0.02);
        Assert.assertEquals(expectedResult, newtonResult, 0.02);
        Assert.assertEquals(expectedResult, rankineResult, 0.02);
        Assert.assertEquals(expectedResult, reaumurResult, 0.02);
        Assert.assertEquals(expectedResult, romerResult, 0.02);
    }

    @Test(expected=NullPointerException.class)
    public void testConvertToUnit_withNullTemperatureUnit() {
        celsiusTemp.convertToUnit(null);
    }

    @Test
    public void testConvertToUnit_celsius() {
        Assert.assertEquals(celsiusTemp.getTemperature(), celsiusTemp.convertToUnit(TemperatureUnit.CELSIUS).getTemperature(), 0.2);
        Assert.assertEquals(celsiusTemp.getTemperature(), delisleTemp.convertToUnit(TemperatureUnit.CELSIUS).getTemperature(), 0.2);
        Assert.assertEquals(celsiusTemp.getTemperature(), fahrenheitTemp.convertToUnit(TemperatureUnit.CELSIUS).getTemperature(), 0.2);
        Assert.assertEquals(celsiusTemp.getTemperature(), kelvinTemp.convertToUnit(TemperatureUnit.CELSIUS).getTemperature(), 0.2);
        Assert.assertEquals(celsiusTemp.getTemperature(), newtonTemp.convertToUnit(TemperatureUnit.CELSIUS).getTemperature(), 0.2);
        Assert.assertEquals(celsiusTemp.getTemperature(), rankineTemp.convertToUnit(TemperatureUnit.CELSIUS).getTemperature(), 0.2);
        Assert.assertEquals(celsiusTemp.getTemperature(), reaumurTemp.convertToUnit(TemperatureUnit.CELSIUS).getTemperature(), 0.2);
        Assert.assertEquals(celsiusTemp.getTemperature(), romerTemp.convertToUnit(TemperatureUnit.CELSIUS).getTemperature(), 0.2);
    }

    @Test
    public void testConvertToUnit_delisle() {
        Assert.assertEquals(delisleTemp.getTemperature(), celsiusTemp.convertToUnit(TemperatureUnit.DELISLE).getTemperature(), 0.2);
        Assert.assertEquals(delisleTemp.getTemperature(), delisleTemp.convertToUnit(TemperatureUnit.DELISLE).getTemperature(), 0.2);
        Assert.assertEquals(delisleTemp.getTemperature(), fahrenheitTemp.convertToUnit(TemperatureUnit.DELISLE).getTemperature(), 0.2);
        Assert.assertEquals(delisleTemp.getTemperature(), kelvinTemp.convertToUnit(TemperatureUnit.DELISLE).getTemperature(), 0.2);
        Assert.assertEquals(delisleTemp.getTemperature(), newtonTemp.convertToUnit(TemperatureUnit.DELISLE).getTemperature(), 0.2);
        Assert.assertEquals(delisleTemp.getTemperature(), rankineTemp.convertToUnit(TemperatureUnit.DELISLE).getTemperature(), 0.2);
        Assert.assertEquals(delisleTemp.getTemperature(), reaumurTemp.convertToUnit(TemperatureUnit.DELISLE).getTemperature(), 0.2);
        Assert.assertEquals(delisleTemp.getTemperature(), romerTemp.convertToUnit(TemperatureUnit.DELISLE).getTemperature(), 0.2);
    }

    @Test
    public void testConvertToUnit_fahrenheit() {
        Assert.assertEquals(fahrenheitTemp.getTemperature(), celsiusTemp.convertToUnit(TemperatureUnit.FAHRENHEIT).getTemperature(), 0.2);
        Assert.assertEquals(fahrenheitTemp.getTemperature(), delisleTemp.convertToUnit(TemperatureUnit.FAHRENHEIT).getTemperature(), 0.2);
        Assert.assertEquals(fahrenheitTemp.getTemperature(), fahrenheitTemp.convertToUnit(TemperatureUnit.FAHRENHEIT).getTemperature(), 0.2);
        Assert.assertEquals(fahrenheitTemp.getTemperature(), kelvinTemp.convertToUnit(TemperatureUnit.FAHRENHEIT).getTemperature(), 0.2);
        Assert.assertEquals(fahrenheitTemp.getTemperature(), newtonTemp.convertToUnit(TemperatureUnit.FAHRENHEIT).getTemperature(), 0.2);
        Assert.assertEquals(fahrenheitTemp.getTemperature(), rankineTemp.convertToUnit(TemperatureUnit.FAHRENHEIT).getTemperature(), 0.2);
        Assert.assertEquals(fahrenheitTemp.getTemperature(), reaumurTemp.convertToUnit(TemperatureUnit.FAHRENHEIT).getTemperature(), 0.2);
        Assert.assertEquals(fahrenheitTemp.getTemperature(), romerTemp.convertToUnit(TemperatureUnit.FAHRENHEIT).getTemperature(), 0.2);
    }

    @Test
    public void testConvertToUnit_kelvin() {
        Assert.assertEquals(kelvinTemp.getTemperature(), celsiusTemp.convertToUnit(TemperatureUnit.KELVIN).getTemperature(), 0.2);
        Assert.assertEquals(kelvinTemp.getTemperature(), delisleTemp.convertToUnit(TemperatureUnit.KELVIN).getTemperature(), 0.2);
        Assert.assertEquals(kelvinTemp.getTemperature(), fahrenheitTemp.convertToUnit(TemperatureUnit.KELVIN).getTemperature(), 0.2);
        Assert.assertEquals(kelvinTemp.getTemperature(), kelvinTemp.convertToUnit(TemperatureUnit.KELVIN).getTemperature(), 0.2);
        Assert.assertEquals(kelvinTemp.getTemperature(), newtonTemp.convertToUnit(TemperatureUnit.KELVIN).getTemperature(), 0.2);
        Assert.assertEquals(kelvinTemp.getTemperature(), rankineTemp.convertToUnit(TemperatureUnit.KELVIN).getTemperature(), 0.2);
        Assert.assertEquals(kelvinTemp.getTemperature(), reaumurTemp.convertToUnit(TemperatureUnit.KELVIN).getTemperature(), 0.2);
        Assert.assertEquals(kelvinTemp.getTemperature(), romerTemp.convertToUnit(TemperatureUnit.KELVIN).getTemperature(), 0.2);
    }

    @Test
    public void testConvertToUnit_newton() {
        Assert.assertEquals(newtonTemp.getTemperature(), celsiusTemp.convertToUnit(TemperatureUnit.NEWTON).getTemperature(), 0.2);
        Assert.assertEquals(newtonTemp.getTemperature(), delisleTemp.convertToUnit(TemperatureUnit.NEWTON).getTemperature(), 0.2);
        Assert.assertEquals(newtonTemp.getTemperature(), fahrenheitTemp.convertToUnit(TemperatureUnit.NEWTON).getTemperature(), 0.2);
        Assert.assertEquals(newtonTemp.getTemperature(), kelvinTemp.convertToUnit(TemperatureUnit.NEWTON).getTemperature(), 0.2);
        Assert.assertEquals(newtonTemp.getTemperature(), newtonTemp.convertToUnit(TemperatureUnit.NEWTON).getTemperature(), 0.2);
        Assert.assertEquals(newtonTemp.getTemperature(), rankineTemp.convertToUnit(TemperatureUnit.NEWTON).getTemperature(), 0.2);
        Assert.assertEquals(newtonTemp.getTemperature(), reaumurTemp.convertToUnit(TemperatureUnit.NEWTON).getTemperature(), 0.2);
        Assert.assertEquals(newtonTemp.getTemperature(), romerTemp.convertToUnit(TemperatureUnit.NEWTON).getTemperature(), 0.2);
    }

    @Test
    public void testConvertToUnit_rankine() {
        Assert.assertEquals(rankineTemp.getTemperature(), celsiusTemp.convertToUnit(TemperatureUnit.RANKINE).getTemperature(), 0.2);
        Assert.assertEquals(rankineTemp.getTemperature(), delisleTemp.convertToUnit(TemperatureUnit.RANKINE).getTemperature(), 0.2);
        Assert.assertEquals(rankineTemp.getTemperature(), fahrenheitTemp.convertToUnit(TemperatureUnit.RANKINE).getTemperature(), 0.2);
        Assert.assertEquals(rankineTemp.getTemperature(), kelvinTemp.convertToUnit(TemperatureUnit.RANKINE).getTemperature(), 0.2);
        Assert.assertEquals(rankineTemp.getTemperature(), newtonTemp.convertToUnit(TemperatureUnit.RANKINE).getTemperature(), 0.2);
        Assert.assertEquals(rankineTemp.getTemperature(), rankineTemp.convertToUnit(TemperatureUnit.RANKINE).getTemperature(), 0.2);
        Assert.assertEquals(rankineTemp.getTemperature(), reaumurTemp.convertToUnit(TemperatureUnit.RANKINE).getTemperature(), 0.2);
        Assert.assertEquals(rankineTemp.getTemperature(), romerTemp.convertToUnit(TemperatureUnit.RANKINE).getTemperature(), 0.2);
    }

    @Test
    public void testConvertToUnit_reaumur() {
        Assert.assertEquals(reaumurTemp.getTemperature(), celsiusTemp.convertToUnit(TemperatureUnit.REAUMUR).getTemperature(), 0.2);
        Assert.assertEquals(reaumurTemp.getTemperature(), delisleTemp.convertToUnit(TemperatureUnit.REAUMUR).getTemperature(), 0.2);
        Assert.assertEquals(reaumurTemp.getTemperature(), fahrenheitTemp.convertToUnit(TemperatureUnit.REAUMUR).getTemperature(), 0.2);
        Assert.assertEquals(reaumurTemp.getTemperature(), kelvinTemp.convertToUnit(TemperatureUnit.REAUMUR).getTemperature(), 0.2);
        Assert.assertEquals(reaumurTemp.getTemperature(), newtonTemp.convertToUnit(TemperatureUnit.REAUMUR).getTemperature(), 0.2);
        Assert.assertEquals(reaumurTemp.getTemperature(), rankineTemp.convertToUnit(TemperatureUnit.REAUMUR).getTemperature(), 0.2);
        Assert.assertEquals(reaumurTemp.getTemperature(), reaumurTemp.convertToUnit(TemperatureUnit.REAUMUR).getTemperature(), 0.2);
        Assert.assertEquals(reaumurTemp.getTemperature(), romerTemp.convertToUnit(TemperatureUnit.REAUMUR).getTemperature(), 0.2);
    }

    @Test
    public void testConvertToUnit_romer() {
        Assert.assertEquals(romerTemp.getTemperature(), celsiusTemp.convertToUnit(TemperatureUnit.ROMER).getTemperature(), 0.2);
        Assert.assertEquals(romerTemp.getTemperature(), delisleTemp.convertToUnit(TemperatureUnit.ROMER).getTemperature(), 0.2);
        Assert.assertEquals(romerTemp.getTemperature(), fahrenheitTemp.convertToUnit(TemperatureUnit.ROMER).getTemperature(), 0.2);
        Assert.assertEquals(romerTemp.getTemperature(), kelvinTemp.convertToUnit(TemperatureUnit.ROMER).getTemperature(), 0.2);
        Assert.assertEquals(romerTemp.getTemperature(), newtonTemp.convertToUnit(TemperatureUnit.ROMER).getTemperature(), 0.2);
        Assert.assertEquals(romerTemp.getTemperature(), rankineTemp.convertToUnit(TemperatureUnit.ROMER).getTemperature(), 0.2);
        Assert.assertEquals(romerTemp.getTemperature(), reaumurTemp.convertToUnit(TemperatureUnit.ROMER).getTemperature(), 0.2);
        Assert.assertEquals(romerTemp.getTemperature(), romerTemp.convertToUnit(TemperatureUnit.ROMER).getTemperature(), 0.2);
    }
}
