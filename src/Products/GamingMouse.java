package Products;

import Interfaces.Mouse;

public class GamingMouse implements Mouse {
    private final int dpi;
    private final String color;
    private final boolean wireless;
    private final boolean backlight;

    public GamingMouse() {
        this.dpi = 16000;
        this.color = "White";
        this.wireless = true;
        this.backlight = true;
    }

    @Override
    public String getDescription() {return "Gaming Mouse: " + color + " color, " + dpi + " DPI, " +
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
