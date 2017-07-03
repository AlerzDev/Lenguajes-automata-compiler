package managers;

import ui.JFrameHome;

/**
 * Created by alejandrolemusrodriguez on 30/06/17.
 */
public class NavigationManager {
    //Instance
    private static NavigationManager instance;

    public static NavigationManager getInstance(){
        if (instance == null){
            instance = new NavigationManager();
        }
        return instance;
    }
    public void loadJFrameHome(){
        JFrameHome jfh = new JFrameHome();
    }
}
