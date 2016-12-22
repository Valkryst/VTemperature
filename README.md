#### License: 

Use this code however you wish. Modifications and improvements are welcome.

Please refer to the LICENSE file for additional information.

---

## How to Setup:

1. Clone the project from GitHub.
2. Open your project in IntelliJ.
3. Open the *Project Structure* menu. (S + ALT + CTRL + SHIFT)
4. Enter the *Modules* subsection.
5. Click the green "+" at the top of the window.
6. Select *Import Module*.
7. Navigate to the cloned project and double-click on *pom.xml*.
8. Click on the name of your project in the *Modules* subsection.
9. Enter the *Dependencies* tab of your project.
10. Click on the green "+" at the right-edge of the window.
11. Click *Module Dependency...*.
12. Select *VTemperature*.

You can now use the VTemperature in your project.

---

### How to Use:

Construct a new Temperature object specifying both the unit type and temperature value, various conversion
methods can then be called on the object to get the temperature value in a different unit type (scale).

Example - Code:

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
    
Example - Output:

    The initial temperature is 30.0°C.
    As Celsius:	30.0
    As Delisle:	105.0
    As Fahrenheit:  86.0
    As Kelvin:      303.15
    As Newton:	9.9
    As Rankine:	545.67
    As Reaumur:	24.0
    As Romer:	23.25
    
    
    
    As Celsius:	30.0°C
    As Delisle:	105.0°De
    As Fahrenheit:	86.0°F
    As Kelvin:	303.15K
    As Newton:	9.9°N
    As Rankine:	545.67°Ra
    As Reaumur:	24.0°R
    As Romer:	23.25°Rø