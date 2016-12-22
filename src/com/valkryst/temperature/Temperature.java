package com.valkryst.temperature;

import lombok.Getter;

public class Temperature {
    /** The unit of temperature. (Ex: Celsius, Kelvin) */
    @Getter private TemperatureUnit unit;
    /** The temperature. */
    @Getter private double temperature;

    /**
     * Constructs a new Temperature.
     *
     * @param unit
     *         The unit of temperature. (Ex: Celsius, Kelvin)
     *
     * @param temperature
     *         The temperature.
     */
    public Temperature(final TemperatureUnit unit, final double temperature) {
        this.unit = unit;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return temperature + TemperatureUnit.getSymbol(unit);
    }

    /** @return The temperature converted to the Celsius scale. */
    public double getAsCelsius() {
        switch (unit) {
            case CELSIUS: {
                return temperature;
            }
            case DELISLE: {
                return 100 - (temperature * (2.0/3.0));
            }
            case FAHRENHEIT: {
                return (temperature - 32) * (5.0/9.0);
            }
            case KELVIN: {
                return temperature - 273.15;
            }
            case NEWTON: {
                return temperature * (100.0/33.0);
            }
            case RANKINE: {
                return (temperature - 491.67) * (5.0/9.0);
            }
            case REAUMUR: {
                return temperature * (5.0/4.0);
            }
            case ROMER: {
                return (temperature - 7.5) * (40.0/21.0);
            }
            default: {
                throw new IllegalArgumentException("The unit " + unit.name() + " is not supported by the getAsCelsius method.");
            }
        }
    }

    /** @return The temperature converted to the Delisle scale. */
    public double getAsDelisle() {
        switch (unit) {
            case CELSIUS: {
                return (100 - temperature) * (3.0/2.0);
            }
            case DELISLE: {
                return temperature;
            }
            case FAHRENHEIT: {
                return (212 - temperature) * (5.0/6.0);
            }
            case KELVIN: {
                return (373.15 - temperature) * (3.0/2.0);
            }
            case NEWTON: {
                return (33 - temperature) * (50.0/11.0);
            }
            case RANKINE: {
                return (671.67 - temperature) * (5.0/9.0);
            }
            case REAUMUR: {
                return (80 - temperature) * (15.0/8.0);
            }
            case ROMER: {
                return (60 - temperature) * (20.0/7.0);
            }
            default: {
                throw new IllegalArgumentException("The unit " + unit.name() + " is not supported by the getAsDelisle method.");
            }
        }
    }

    /** @return The temperature converted to the Fahrenheit scale. */
    public double getAsFahrenheit() {
        switch (unit) {
            case CELSIUS: {
                return (temperature * (9.0/5.0)) + 32;
            }
            case DELISLE: {
                return 212 - (temperature * (6.0/5.0));
            }
            case FAHRENHEIT: {
                return temperature;
            }
            case KELVIN: {
                return (temperature - (9.0/5.0)) - 459.67;
            }
            case NEWTON: {
                return (temperature * (60.0/11.0)) + 32;
            }
            case RANKINE: {
                return temperature - 459.67;
            }
            case REAUMUR: {
                return (temperature * (9.0/4.0)) + 32;
            }
            case ROMER: {
                return ((temperature - 7.5) * (24.0/7.0)) + 32;
            }
            default: {
                throw new IllegalArgumentException("The unit " + unit.name() + " is not supported by the getAsFahrenheit method.");
            }
        }
    }

    /** @return The temperature converted to the Kelvin scale. */
    public double getAsKelvin() {
        switch (unit) {
            case CELSIUS: {
                return temperature + 273.15;
            }
            case DELISLE: {
                return 373.15 - (temperature * (2.0/3.0));
            }
            case FAHRENHEIT: {
                return (temperature + 459.67) * (5.0/9.0);
            }
            case KELVIN: {
                return temperature;
            }
            case NEWTON: {
                return (temperature * (100.0/33.0)) + 273.15;
            }
            case RANKINE: {
                return temperature * (5.0/9.0);
            }
            case REAUMUR: {
                return (temperature * (5.0/4.0)) + 273.15;
            }
            case ROMER: {
                return ((temperature - 7.5) * (40.0/21.0)) + 273.15;
            }
            default: {
                throw new IllegalArgumentException("The unit " + unit.name() + " is not supported by the getAsKelvin method.");
            }
        }
    }

    /** @return The temperature converted to the Newton scale. */
    public double getAsNewton() {
        switch (unit) {
            case CELSIUS: {
                return temperature * (33.0/100.0);
            }
            case DELISLE: {
                return 33 - (temperature * (11.0/50.0));
            }
            case FAHRENHEIT: {
                return (temperature - 32) * (11.0/60.0);
            }
            case KELVIN: {
                return (temperature - 273.15) * (33.0/100.0);
            }
            case NEWTON: {
                return temperature;
            }
            case RANKINE: {
                return (temperature - 491.67) * (11.0/60.0);
            }
            case REAUMUR: {
                return temperature * (33.0/80.0);
            }
            case ROMER: {
                return (temperature - 7.5) * (22.0/35.0);
            }
            default: {
                throw new IllegalArgumentException("The unit " + unit.name() + " is not supported by the getAsNewton method.");
            }
        }
    }

    /** @return The temperature converted to the Rankine scale. */
    public double getAsRankine() {
        switch (unit) {
            case CELSIUS: {
                return (temperature + 273.15) * (9.0/5.0);
            }
            case DELISLE: {
                return 671.67 - (temperature * (6.0/5.0));
            }
            case FAHRENHEIT: {
                return temperature + 459.67;
            }
            case KELVIN: {
                return temperature * (9.0/5.0);
            }
            case NEWTON: {
                return (temperature * (60.0/11.0)) + 491.67;
            }
            case RANKINE: {
                return temperature;
            }
            case REAUMUR: {
                return (temperature * (9.0/4.0)) + 491.67;
            }
            case ROMER: {
                return ((temperature - 7.5) * (24.0/7.0)) + 491.67;
            }
            default: {
                throw new IllegalArgumentException("The unit " + unit.name() + " is not supported by the getAsRankine method.");
            }
        }
    }

    /** @return The temperature converted to the Reaumur scale. */
    public double getAsReaumur() {
        switch (unit) {
            case CELSIUS: {
                return temperature * (4.0/5.0);
            }
            case DELISLE: {
                return 80 - (temperature * (8.0/15.0));
            }
            case FAHRENHEIT: {
                return (temperature - 32) * (4.0/9.0);
            }
            case KELVIN: {
                return (temperature - 273.15) * (4.0/5.0);
            }
            case NEWTON: {
                return temperature * (80.0/33.0);
            }
            case RANKINE: {
                return (temperature - 491.67) * (4.0/9.0);
            }
            case REAUMUR: {
                return temperature;
            }
            case ROMER: {
                return (temperature - 7/5) * (32.0/21.0);
            }
            default: {
                throw new IllegalArgumentException("The unit " + unit.name() + " is not supported by the getAsReaumur method.");
            }
        }
    }

    /** @return The temperature converted to the Romer scale. */
    public double getAsRomer() {
        switch (unit) {
            case CELSIUS: {
                return (temperature * (21.0/40.0)) + 7.5;
            }
            case DELISLE: {
                return 60 - (temperature * (7.0/20.0));
            }
            case FAHRENHEIT: {
                return ((temperature - 32) * (7.0/24.0)) + 7.5;
            }
            case KELVIN: {
                return ((temperature - 273.15) * (21.0/40.0)) + 7.5;
            }
            case NEWTON: {
                return (temperature * (35.0/22.0)) + 7.5;
            }
            case RANKINE: {
                return ((temperature - 491.67) * (7.0/24.0)) + 7.5;
            }
            case REAUMUR: {
                return (temperature * (21.0/32.0)) + 7.5;
            }
            case ROMER: {
                return temperature;
            }
            default: {
                throw new IllegalArgumentException("The unit " + unit.name() + " is not supported by the getAsRomer method.");
            }
        }
    }
}