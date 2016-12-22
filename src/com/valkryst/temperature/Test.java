package com.valkryst.temperature;

public class Test {
    public static void main(final String[] args) {
        final Temperature celsiusTmp = new Temperature(TemperatureUnit.CELSIUS, 30);

        System.out.println("The initial temperature is " + celsiusTmp + ".");

        // Print without symbols:
        System.out.println("As Celsius:\t\t" + celsiusTmp.getAsCelsius());
        System.out.println("As Delisle:\t\t" + celsiusTmp.getAsDelisle());
        System.out.println("As Fahrenheit:\t" + celsiusTmp.getAsFahrenheit());
        System.out.println("As Kelvin:\t\t" + celsiusTmp.getAsKelvin());
        System.out.println("As Newton:\t\t" + celsiusTmp.getAsNewton());
        System.out.println("As Rankine:\t\t" + celsiusTmp.getAsRankine());
        System.out.println("As Reaumur:\t\t" + celsiusTmp.getAsReaumur());
        System.out.println("As Romer:\t\t" + celsiusTmp.getAsRomer());

        System.out.print("\n\n\n");

        // Print with symbols:
        System.out.println("As Celsius:\t\t" + celsiusTmp.getAsCelsius() + TemperatureUnit.getSymbol(TemperatureUnit.CELSIUS));
        System.out.println("As Delisle:\t\t" + celsiusTmp.getAsDelisle() + TemperatureUnit.getSymbol(TemperatureUnit.DELISLE));
        System.out.println("As Fahrenheit:\t" + celsiusTmp.getAsFahrenheit() + TemperatureUnit.getSymbol(TemperatureUnit.FAHRENHEIT));
        System.out.println("As Kelvin:\t\t" + celsiusTmp.getAsKelvin() + TemperatureUnit.getSymbol(TemperatureUnit.KELVIN));
        System.out.println("As Newton:\t\t" + celsiusTmp.getAsNewton() + TemperatureUnit.getSymbol(TemperatureUnit.NEWTON));
        System.out.println("As Rankine:\t\t" + celsiusTmp.getAsRankine() + TemperatureUnit.getSymbol(TemperatureUnit.RANKINE));
        System.out.println("As Reaumur:\t\t" + celsiusTmp.getAsReaumur() + TemperatureUnit.getSymbol(TemperatureUnit.REAUMUR));
        System.out.println("As Romer:\t\t" + celsiusTmp.getAsRomer() + TemperatureUnit.getSymbol(TemperatureUnit.ROMER));
    }
}
