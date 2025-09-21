package Factories;

import Interfaces.DeviceFactory;
import Interfaces.Headphones;
import Interfaces.Keyboard;
import Interfaces.Mouse;
import Products.GamingHeadphones;
import Products.GamingKeyboard;
import Products.GamingMouse;

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
