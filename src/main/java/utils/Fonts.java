package utils;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

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

    public Font getRobotoLightFont(final float size){

        InputStream stream = ClassLoader.getSystemClassLoader().getResourceAsStream("fonts/Roboto-Light.ttf");
        Font font = null;
        try {
            font = Font.createFont(Font.TRUETYPE_FONT, stream).deriveFont(size);
        } catch (FontFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return font;
    }
}
