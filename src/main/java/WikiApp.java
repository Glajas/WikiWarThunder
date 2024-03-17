import Engine.WikiEngine;
import GUI.WikiFrame;

// W p. 4 użyć klasy WebEngine z JavaFX dla wbudowania przeglądarki w aplikację Swingową.

public class WikiApp {

    public String url = "https://raw.githubusercontent.com/ControlNet/wt-data-project.data/master/rb_ranks_all.csv";
    public String fileName = "rb_ranks_all.csv";

    public static void main(String[] args) {
        WikiFrame jFrame = new WikiFrame();
        WikiEngine engine = new WikiEngine(jFrame);
    }

}
