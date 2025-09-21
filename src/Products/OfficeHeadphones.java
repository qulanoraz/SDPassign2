package Products;

import Interfaces.Headphones;

public class OfficeHeadphones implements Headphones {
    private final String color;
    private final boolean wireless;
    private final boolean backlight;
    private final boolean microphone;

    public OfficeHeadphones() {
        this.color = "White";
        this.wireless = true;
        this.backlight = true;
        this.microphone = true;
    }

    @Override
    public String getDescription() {return "Office Headphones: " + color + " color, " +
            (wireless ? "wireless, " : "non-wireless, ") +
            (backlight ? "has backlight, " : "no backlight, ") +
            (microphone ? "has microphone." : "no microphone.");}

    @Override
    public String getColor() {return color;}
    @Override
    public boolean isWireless() {return wireless;}
    @Override
    public boolean hasBacklight() {return backlight;}
    @Override
    public boolean hasMicrophone() {return microphone;}
}