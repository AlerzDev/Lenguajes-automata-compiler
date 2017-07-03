package ui;

import bases.BaseJFrame;

import java.awt.*;

/**
 * Created by alejandrolemusrodriguez on 30/06/17.
 */
public class JFrameHome extends BaseJFrame{
    protected void createUI() {

    }

    protected Color background() {
        return Color.white;
    }

    protected String title() {
        return "Home";
    }

    protected boolean removeBorderJFrame() {
        return false;
    }

    protected int width() {
        return 800;
    }

    protected int height() {
        return 800;
    }

    protected boolean visible() {
        return true;
    }

    protected boolean resizable() {
        return false;
    }
}
