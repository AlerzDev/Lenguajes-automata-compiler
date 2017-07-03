package utils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by alejandrolemusrodriguez on 30/06/17.
 */
public class Images {
    //Instance
    private static Images instance;

    public static Images getInstance(){
        if (instance == null){
            instance = new Images();
        }
        return instance;
    }

    public BufferedImage getImage(String path){
        BufferedImage picture = null;
        try {
            picture = ImageIO.read(ClassLoader.getSystemClassLoader().getResourceAsStream(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return picture;
    }

}
