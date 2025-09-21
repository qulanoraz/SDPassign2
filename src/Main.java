import Factories.GamingDeviceFactory;
import Factories.OfficeDeviceFactory;
import Interfaces.DeviceFactory;
import Interfaces.Headphones;
import Interfaces.Keyboard;
import Interfaces.Mouse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DeviceFactory gFactory = new GamingDeviceFactory();
        DeviceFactory oFactory = new OfficeDeviceFactory();
        Keyboard gKeyboard = gFactory.createKeyboard();
        Mouse gMouse = gFactory.createMouse();
        Headphones gHeadphones = gFactory.createHeadphones();
        Keyboard oKeyboard = oFactory.createKeyboard();
        Mouse oMouse = oFactory.createMouse();
        Headphones oHeadphones = oFactory.createHeadphones();

        System.out.println("What kind of devices do you want?: (Gaming/Office)");
        String devicePurposeChoice = scanner.nextLine().toLowerCase();

        switch (devicePurposeChoice) {
            case "gaming", "office":
                break;
            default:
                throw new IllegalStateException("Try to type 'gaming' or 'office'.");
        }

        System.out.println();

        System.out.println("Choose your device: (Keyboard, Mouse, Headphones)");
        String deviceTypeChoice = scanner.nextLine().toLowerCase();
        System.out.println();

        switch (deviceTypeChoice) {
            case "keyboard":
                if (devicePurposeChoice.equals("gaming")) {
                    System.out.println("Your device -");
                    System.out.println(gKeyboard.getDescription());
                } else {
                    System.out.println("Your device -");
                    System.out.println(oKeyboard.getDescription());
                }
                break;

            case "mouse":
                if (devicePurposeChoice.equals("gaming")) {
                    System.out.println("Your device -");
                    System.out.println(gMouse.getDescription());
                } else {
                    System.out.println("Your device -");
                    System.out.println(oMouse.getDescription());
                }
                break;

            case "headphones":
                if (devicePurposeChoice.equals("gaming")) {
                    System.out.println("Your device -");
                    System.out.println(gHeadphones.getDescription());
                } else {
                    System.out.println("Your device -");
                    System.out.println(oHeadphones.getDescription());
                }
                break;
        }
    }
}
