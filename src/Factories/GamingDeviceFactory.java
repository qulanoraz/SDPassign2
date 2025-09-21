package Factories;

import Interfaces.*;
import Products.*;

public class GamingDeviceFactory implements DeviceFactory {
    @Override
    public Keyboard createKeyboard() {
        return createGamingKeyboard();
    }
    @Override
    public Mouse createMouse() {
        return createGamingMouse();
    }
    @Override
    public Headphones createHeadphones() {
        return createGamingHeadphones();
    }

    protected Keyboard createGamingKeyboard() {
        return new GamingKeyboard();
    }
    protected Mouse createGamingMouse() {
        return new GamingMouse();
    }
    protected Headphones createGamingHeadphones() {
        return new GamingHeadphones();
    }
}
