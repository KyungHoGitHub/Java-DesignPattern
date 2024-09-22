package com.study;

import facade.CoffeeMaker;
import facade.Lights;
import facade.SmartHomeFacade;
import facade.Thermostat;

public class Main {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();
        Lights lights = new Lights();
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        SmartHomeFacade smartHome
                = new SmartHomeFacade(thermostat, lights,coffeeMaker);

        smartHome.wakeUp();
        smartHome.leaveHome();
    }
}