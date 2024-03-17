package Engine;

import GUI.InterfaceGUI;
import Utilities.CsvDownloader;
import Utilities.StatsFrom3Days;
import Utilities.CsvReader;

import java.io.IOException;
import java.util.List;

public class WikiEngine {
    String url = "https://raw.githubusercontent.com/ControlNet/wt-data-project.data/master/rb_ranks_all.csv";
    String fileName = "rb_ranks_all.csv";
    private InterfaceGUI interfaceGUI;
    private List<StatsFrom3Days> statList;

    public WikiEngine(InterfaceGUI interfaceGUI) {

        this.interfaceGUI = interfaceGUI;
        CsvReader reader = new CsvReader();
        CsvDownloader downloader = new CsvDownloader();

        try {
            downloader.downloadCsv(url, fileName);
            this.statList = reader.readAllStats(fileName);
        } catch (IOException e) {
            System.out.println(e);
        }

        writeTest();
    }

    public void writeTest() {
        for(StatsFrom3Days s : statList){
            if(s.getDate().toString().split(" ")[5].equals("2024"))
            System.out.println(s.getDate() + " " + s.getNation() + " BR: " + s.getRb_lower_br() + " " + s.getRb_ground_frags_per_death());
        }
    }

}
