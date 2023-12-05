package fr.imt.coffee_machine.exception;

public class LackOfWaterInTankException extends Exception{
    public LackOfWaterInTankException(String message) {
        super(message);
    }
}
