package com.timebox.new2017_practice;

/**
 * Created by shanshan on 2017/12/7.
 */

public class TemperatureConverter {

    public static float convertFahrenheitToCelsius(float fahrenheit) {
        return ((fahrenheit - 32) * 5 / 9);
    }

    // converts to fahrenheit
    public static float convertCelsiusToFahrenheit(float celsius) {
        return ((celsius * 9) / 5) + 32;
    }

    // commit test
    public void test() {
        return;
    }
}
