package ui;

import bases.BaseJFrame;
import utils.Fonts;
import utils.Images;
import utils.ViewUtils;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by alejandrolemusrodriguez on 29/06/17.
 */
public class JFrameLoading extends BaseJFrame{

    private JLabel mLogo;
    private JLabel mNameLogo;
    private JLabel mTitle;
    private JLabel mNameStatus;
    private JLabel mLoader;
    private ProgressMonitor mProgressMonitor;
    private Color color;

    protected void createUI() {

        color = new Color(0x7B1FA2);
        add(panelRight());
        add(panelLeft());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    private JPanel panelLeft(){

        JPanel panel = new JPanel(new FlowLayout());
        panel.setSize(180,180);
        panel.setLocation(10,10);
        panel.setOpaque(false);
        mLogo = new JLabel(new ImageIcon(Images.getInstance().getImage("images/image.jpg")));
        mNameLogo = new JLabel("CodeDraw");
        mNameLogo.setForeground(color);
        mNameLogo.setFont(Fonts.getInstance().getRobotoLightFont(28f));
        panel.add(mLogo);
        panel.add(mNameLogo);
        return panel;

    }

    private JPanel panelRight(){

        JPanel panel = new JPanel(new FlowLayout());
        panel.setSize(295,180);
        panel.setLocation(195,10);
        panel.setOpaque(false);
        mTitle = new JLabel("Languages automaton compiler");
        mTitle.setForeground(color);
        mTitle.setFont(Fonts.getInstance().getRobotoLightFont(20f));
        mNameStatus = new JLabel("By Alejandro Lemus and Miguel Pérez");
        mNameStatus.setForeground(color);
        mNameStatus.setFont(Fonts.getInstance().getRobotoLightFont(15f));
        URL url = null;
        try {
            url = new URL("http://ecu.statistics.eu.eculine.net/ECU.TNT/Frontend/images/ajax-loader.gif");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        ImageIcon icon = new ImageIcon(url);
        mLoader = new JLabel(icon);
        panel.add(mTitle);
        panel.add(mNameStatus);
        panel.add(mLoader);
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
        return Color.white;
    }

    protected boolean visible() {
        return true;
    }

    protected boolean resizable() {
        return false;
    }
}
