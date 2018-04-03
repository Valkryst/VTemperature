package com.valkryst.temperature;

public enum TemperatureUnit {
    CELSIUS,
    DELISLE,
    FAHRENHEIT,
    KELVIN,
    NEWTON,
    RANKINE,
    REAUMUR,
    ROMER;

    /**
     * Returns the symbol associated with the specified unit.
     * (Ex: CELSIUS is °C, KELVIN is K)
     *
     * @param unit
     *          The unit.
     *
     * @return
     *          The symbol.
     *
     * @throws IllegalArgumentException
     *          If the specified unit is null or unsupported.
     */
    public static String getSymbol(final TemperatureUnit unit) {
        switch (unit) {
            case CELSIUS: {
                return "°C";
            }
            case DELISLE: {
                return "°De";
            }
            case FAHRENHEIT: {
                return "°F";
            }
            case KELVIN: {
                return "K";
            }
            case NEWTON: {
                return "°N";
            }
            case RANKINE: {
                return "°Ra";
            }
            case REAUMUR: {
                return "°R";
            }
            case ROMER: {
                return "°Rø";
            }
            default: {
                throw new IllegalArgumentException("The unit " + unit.name() + " is not supported by the getSymbol method.");
            }
        }
    }
}
