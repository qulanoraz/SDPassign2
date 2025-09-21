package Products;

import Interfaces.Mouse;

public class OfficeMouse implements Mouse {
    private final int dpi;
    private final String color;
    private final boolean wireless;
    private final boolean backlight;

    public OfficeMouse() {
        this.dpi = 1200;
        this.color = "Black";
        this.wireless = false;
        this.backlight = false;
    }

    @Override
    public String getDescription() {return "Office Mouse: " + color + " color, " + dpi + " DPI, " +
            (wireless ? "wireless, " : "non-wireless, ") +
            (backlight ? "has backlight." : "no backlight.");}

    @Override
    public int getDpi() {return dpi;}
    @Override
    public String getColor() {return color;}
    @Override
    public boolean isWireless() {return wireless;}
    @Override
    public boolean hasBacklight() {return backlight;}
}
