package Factories;

import Interfaces.DeviceFactory;
import Interfaces.Headphones;
import Interfaces.Keyboard;
import Interfaces.Mouse;
import Products.OfficeHeadphones;
import Products.OfficeKeyboard;
import Products.OfficeMouse;

public class OfficeDeviceFactory implements DeviceFactory {
    @Override
    public Keyboard createKeyboard() {
        return createOfficeKeyboard();
    }
    @Override
    public Mouse createMouse() {
        return createOfficeMouse();
    }
    @Override
    public Headphones createHeadphones() {
        return createOfficeHeadphones();
    }

    protected Keyboard createOfficeKeyboard() {
        return new OfficeKeyboard();
    }
    protected Mouse createOfficeMouse() {
        return new OfficeMouse();
    }
    protected Headphones createOfficeHeadphones() {
        return new OfficeHeadphones();
    }
}
