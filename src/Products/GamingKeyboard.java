package Products;

import Interfaces.Keyboard;

public class GamingKeyboard implements Keyboard {
    private final String color;
    private final byte formfactor;
    private final boolean mechanical;
    private final boolean wireless;
    private final boolean backlight;

    public GamingKeyboard() {
        this.color = "White";
        this.formfactor = 75;
        this.mechanical = true;
        this.wireless = true;
        this.backlight = true;
    }

    @Override
    public String getDescription() {return "Gaming Keyboard: " + color + " color, " +
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
