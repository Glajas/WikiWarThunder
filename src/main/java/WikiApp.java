import Utilities.CsvDownloader;
import Utilities.CsvReader;
import Engine.WikiEngine;
import GUI.WikiFrame;

// W p. 4 użyć klasy WebEngine z JavaFX dla wbudowania przeglądarki w aplikację Swingową.

public class WikiApp {
    public static void main(String[] args) {
        CsvDownloader downloader = new CsvDownloader();
        CsvReader reader = new CsvReader();
        String url = "https://raw.githubusercontent.com/ControlNet/wt-data-project.data/master/rb_ranks_all.csv";
        String fileName = "rb_ranks_all.csv";

    }
}
