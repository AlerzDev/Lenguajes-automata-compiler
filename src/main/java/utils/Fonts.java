package utils;

import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by alejandrolemusrodriguez on 29/06/17.
 */
public class Fonts {
    //Instance
    private static Fonts instance;

    public static Fonts getInstance(){
        if (instance == null){
            instance = new Fonts();
        }
        return instance;
    }

    public Font getRobotoFont(){
        Font font = null;
        try {
            return font = Font.createFont(Font.TRUETYPE_FONT, new File("fonts/Roboto-Regular.ttf"));
        } catch (FontFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return font;
    }
}
