package GUI;

import Engine.WikiEngine;

import javax.swing.*;

public class WikiFrame extends JFrame {
    private WikiEngine wikiEngine;

    public WikiFrame() {

    }

    public void setWikiEngine(WikiEngine wikiEngine) {
        this.wikiEngine = wikiEngine;
    }
}
