![](https://codebuild.us-east-1.amazonaws.com/badges?uuid=eyJlbmNyeXB0ZWREYXRhIjoiS296RlpmNWZRMHNBdksrSzNHYWRzNTY4QUxsQStlYktHSkZYbW1Pc1RtV0ZpZVZORGRzUm9wV1JjVFZXR1EveVB3elFvYjRTR1haNlExelNROCszbFN3PSIsIml2UGFyYW1ldGVyU3BlYyI6IlpkenNFamNScXpieE1iZE8iLCJtYXRlcmlhbFNldFNlcmlhbCI6MX0%3D&branch=master) [![Release](https://jitpack.io/v/Valkryst/VTemperature.svg)](https://jitpack.io/#Valkryst/VTemperature)

## Links

* [JavaDoc Documentation](https://valkryst.github.io/VTemperature/)

## Jar Files & Maven

The Maven dependency is hosted off of JitPack, so you will need to add JitPack as a repository before you add VTerminal as a dependency.

### Maven

JitPack ([Example](https://github.com/Valkryst/VTerminal/blob/master/pom.xml)):

    <repositories>
        <repository>
            <id>jitpack.io</id>
            <url>https://jitpack.io</url>
        </repository>
    </repositories>

Dependency:

    <dependency>
        <groupId>com.github.Valkryst</groupId>
        <artifactId>VTemperature</artifactId>
        <version>1.0.1</version>
    </dependency>

### Jar

Jar files can be found on the [releases](https://github.com/Valkryst/VTemperature/releases) page.

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
    As Fahrenheit:      86.0
    As Kelvin:          303.15
    As Newton:	    9.9
    As Rankine:	    545.67
    As Reaumur:	    24.0
    As Romer:	    23.25
    
    
    
    As Celsius:	    30.0°C
    As Delisle:	    105.0°De
    As Fahrenheit:	    86.0°F
    As Kelvin:	    303.15K
    As Newton:	    9.9°N
    As Rankine:	    545.67°Ra
    As Reaumur:	    24.0°R
    As Romer:	    23.25°Rø
