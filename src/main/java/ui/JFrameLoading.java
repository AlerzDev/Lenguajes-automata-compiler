package ui;

import bases.BaseJFrame;
import utils.Fonts;

import javax.swing.*;
import java.awt.*;

/**
 * Created by alejandrolemusrodriguez on 29/06/17.
 */
public class JFrameLoading extends BaseJFrame {

    private ImageIcon mLogo;
    private JLabel mNameLogo;
    private JLabel mNameStatus;
    private ProgressMonitor mProgressMonitor;
    private Color color;

    protected void createUI() {

        color = new Color(0x7B1FA2);
        add(panelRight());
        add(panelLeft());

    }


    private JPanel panelLeft(){


        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setSize(180,180);
        panel.setLocation(10,10);
        panel.setOpaque(false);
        mNameLogo = new JLabel("CodeDraw");
        mNameLogo.setForeground(Color.white);
        mNameLogo.setFont(Fonts.getInstance().getRobotoFont());
        panel.add(mNameLogo);
        return panel;

    }

    private JPanel panelRight(){

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setSize(295,180);
        panel.setLocation(195,10);
        panel.setOpaque(false);
        return panel;

    }

    protected String title() {
        return null;
    }

    protected boolean removeBorderJFrame() {
        return true;
    }

    protected int width() {
        return 500;
    }

    protected int height() {
        return 200;
    }

    protected Color background() {
        return color;
    }

    protected boolean visible() {
        return true;
    }

    protected boolean resizable() {
        return false;
    }
}
