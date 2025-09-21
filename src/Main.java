import Factories.GamingDeviceFactory;
import Factories.OfficeDeviceFactory;
import Interfaces.DeviceFactory;
import Interfaces.Headphones;
import Interfaces.Keyboard;
import Interfaces.Mouse;

public class Main {
    public static void main(String[] args) {
        DeviceFactory factory = new GamingDeviceFactory();
        DeviceFactory factory1 = new OfficeDeviceFactory();

        Keyboard gKeyboard = factory.createKeyboard();
        Mouse gMouse = factory.createMouse();
        Headphones gHeadphones = factory.createHeadphones();

        Keyboard oKeyboard = factory1.createKeyboard();
        Mouse oMouse = factory1.createMouse();
        Headphones oHeadphones = factory1.createHeadphones();


        System.out.println(gKeyboard.getDescription());
        System.out.println(gMouse.getDescription());
        System.out.println(gHeadphones.getDescription());

        System.out.println();

        System.out.println(oKeyboard.getDescription());
        System.out.println(oMouse.getDescription());
        System.out.println(oHeadphones.getDescription());
    }
}
