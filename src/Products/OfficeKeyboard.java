package Products;

import Interfaces.Keyboard;

public class OfficeKeyboard implements Keyboard {
    private final String color;
    private final byte formfactor;
    private final boolean mechanical;
    private final boolean wireless;
    private final boolean backlight;

    public OfficeKeyboard() {
        this.color = "Black";
        this.formfactor = 100;
        this.mechanical = false;
        this.wireless = false;
        this.backlight = false;
    }

    @Override
    public String getDescription() {return "Office Keyboard: " + color + " color, " +
            formfactor + "% formfactor, " +
            (mechanical ? "mechanical switches, " : "membrane switches, ") +
            (wireless ? "wireless, " : "non-wireless, ") +
            (backlight ? "has backlight." : "no backlight.");}

    @Override
    public String getColor() {return color;}
    @Override
    public int getFormfactor() {return formfactor;}
    @Override
    public boolean isMechanical() {return mechanical;}
    @Override
    public boolean isWireless() {return wireless;}
    @Override
    public boolean hasBacklight() {return backlight;}
}