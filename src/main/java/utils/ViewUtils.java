package utils;

import javax.swing.*;
import java.awt.image.ImageObserver;

/**
 * Created by alejandrolemusrodriguez on 03/07/17.
 */
public class ViewUtils {
        //Instance
        private static ViewUtils instance;

        public static ViewUtils getInstance(){
            if (instance == null){
                instance = new ViewUtils();
            }
            return instance;
        }

        public void messageError(final String msg, final String token){
            JOptionPane.showMessageDialog(null,msg,"Error", ImageObserver.ERROR);
        }

        public void messageSuccess(final String msg){
            JOptionPane.showMessageDialog(null,msg,"Exito", ImageObserver.SOMEBITS);
        }

}
