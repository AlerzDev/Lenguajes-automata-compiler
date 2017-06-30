package bases;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.Color;

/**
 * Created by alejandrolemusrodriguez on 29/06/17.
 */

public abstract class BaseJFrame extends JFrame {

    public BaseJFrame() {

        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(resizable());
        setUndecorated(removeBorderJFrame());
        setSize(width(), height());
        setTitle(title());
        setLocationRelativeTo(null);
        createUI();
        getContentPane().setBackground(background());
        setVisible(visible());

    }

    protected abstract void createUI();

    protected abstract Color background();

    protected abstract String title();

    protected abstract boolean removeBorderJFrame();

    protected abstract int width();

    protected abstract int height();

    protected abstract boolean visible();

    protected abstract boolean resizable();

}
