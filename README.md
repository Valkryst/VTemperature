#### License: 

Use this code however you wish. Modifications and improvements are welcome.

Please refer to the LICENSE file for additional information.

---

[![MIT License](https://img.shields.io/badge/license-MIT_License-green.svg)](https://github.com/Valkryst/VTemperature/blob/master/LICENSE) ![](https://travis-ci.org/Valkryst/VTemperature.svg?branch=master) [![codecov](https://codecov.io/gh/Valkryst/VTemperature/branch/master/graph/badge.svg)](https://codecov.io/gh/Valkryst/VTemperature) [![Release](https://jitpack.io/v/Valkryst/VTemperature.svg)](https://jitpack.io/#Valkryst/VTemperature)

## Jar Files & Maven

To use this project as a Maven dependency, click on the JitPack badge [![Release](https://jitpack.io/v/Valkryst/VTemperature.svg)](https://jitpack.io/#Valkryst/VTemperature), select a version, click the "Get it!" button, and then follow the instructions.

If you would rather use a Jar file, then you can find the Jars on the [releases](https://github.com/Valkryst/VTemperature/releases) page.

## JavaDoc Documentation:

Whenever a Travis CI build passes, the JavaDocs are auto-generated and made available at the following link.

https://valkryst.github.io/VTemperature/

### How to Use:

Construct a new Temperature object specifying both the unit type and temperature value, various conversion
methods can then be called on the object to get the temperature value in a different unit type (scale).

### Example - Code:

```Java
public class Test {
    public static void main(final String[] args) {
        final Temperature celsiusTmp = new Temperature(TemperatureUnit.CELSIUS, 30);

        System.out.println("The initial temperature is " + celsiusTmp + ".");

        // Print without symbols:
        System.out.println("As Celsius:\t" + celsiusTmp.getAsCelsius());
        System.out.println("As Delisle:\t" + celsiusTmp.getAsDelisle());
        System.out.println("As Fahrenheit:\t" + celsiusTmp.getAsFahrenheit());
        System.out.println("As Kelvin:\t" + celsiusTmp.getAsKelvin());
        System.out.println("As Newton:\t" + celsiusTmp.getAsNewton());
        System.out.println("As Rankine:\t" + celsiusTmp.getAsRankine());
        System.out.println("As Reaumur:\t" + celsiusTmp.getAsReaumur());
        System.out.println("As Romer:\t" + celsiusTmp.getAsRomer());

        System.out.print("\n\n\n");

        // Print with symbols:
        System.out.println("As Celsius:\t" + celsiusTmp.getAsCelsius() + TemperatureUnit.getSymbol(TemperatureUnit.CELSIUS));
        System.out.println("As Delisle:\t" + celsiusTmp.getAsDelisle() + TemperatureUnit.getSymbol(TemperatureUnit.DELISLE));
        System.out.println("As Fahrenheit:\t" + celsiusTmp.getAsFahrenheit() + TemperatureUnit.getSymbol(TemperatureUnit.FAHRENHEIT));
        System.out.println("As Kelvin:\t" + celsiusTmp.getAsKelvin() + TemperatureUnit.getSymbol(TemperatureUnit.KELVIN));
        System.out.println("As Newton:\t" + celsiusTmp.getAsNewton() + TemperatureUnit.getSymbol(TemperatureUnit.NEWTON));
        System.out.println("As Rankine:\t" + celsiusTmp.getAsRankine() + TemperatureUnit.getSymbol(TemperatureUnit.RANKINE));
        System.out.println("As Reaumur:\t" + celsiusTmp.getAsReaumur() + TemperatureUnit.getSymbol(TemperatureUnit.REAUMUR));
        System.out.println("As Romer:\t" + celsiusTmp.getAsRomer() + TemperatureUnit.getSymbol(TemperatureUnit.ROMER));
    }
}
```

### Example - Output:

    The initial temperature is 30.0°C.
    As Celsius:	    30.0
    As Delisle:	    105.0
    As Fahrenheit:  86.0
    As Kelvin:      303.15
    As Newton:	    9.9
    As Rankine:	    545.67
    As Reaumur:	    24.0
    As Romer:	    23.25
    
    
    
    As Celsius:	    30.0°C
    As Delisle:	    105.0°De
    As Fahrenheit:	86.0°F
    As Kelvin:	    303.15K
    As Newton:	    9.9°N
    As Rankine:	    545.67°Ra
    As Reaumur:	    24.0°R
    As Romer:	    23.25°Rø
