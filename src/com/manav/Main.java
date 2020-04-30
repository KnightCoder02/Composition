package com.manav;
//What is the role of import?
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions (20, 20, 5);
        Case theCase = new Case ("220B", "Dell", "240", dimensions);
        //Monitor theMonitor = new Monitor ("27 inch Beast", "Acer",27, nativeResolution);
        Monitor theMonitor = new Monitor ("27 inch Beast", "Acer", 27, new Resolution (2540, 1440));
        MotherBoard theMotherBoard = new MotherBoard ("BJ-200", "Asus", 4, 6, "v2.44");
        PC thePC = new PC (theCase, theMonitor, theMotherBoard);
        //Then also deletes these statements
        //thePC.getMonitor ().drawPixelAt (1500, 1200, "red");
//        thePC.getMotherBoard ().loadProgram ("windows 1.0");
//        thePC.getTheCase ().pressPowerButton ();
        thePC.powerUp ();
    }
}