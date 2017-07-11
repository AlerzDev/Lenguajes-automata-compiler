package ui;

import bases.BaseJFrame;

import java.awt.*;

public class JFrameCup extends BaseJFrame {
    protected void createUI() {

    }

    protected Color background() {
        return Color.white;
    }

    protected String title() {
        return "DrawCode||Canvas";
    }

    protected boolean removeBorderJFrame() {
        return false;
    }

    protected int width() {
        return 500;
    }

    protected int height() {
        return 500;
    }

    protected boolean visible() {
        return true;
    }

    protected boolean resizable() {
        return false;
    }
}
