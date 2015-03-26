package pw.hwk.tutorial;

import java.util.HashMap;
import java.util.Map;

public class PlayerData {

    private Map<String, MapPlayerTutorial> tutorials;

    public PlayerData(HashMap<String, MapPlayerTutorial> tutorials) {
        this.tutorials = tutorials;
    }

    public Map<String, MapPlayerTutorial> getPlayerTutorialData() {
        return this.tutorials;
    }
}
