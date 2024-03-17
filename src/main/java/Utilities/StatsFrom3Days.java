package Utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//nation,cls,date,rb_br,rb_lower_br,rb_battles_sum,rb_battles_mean,rb_win_rate,rb_air_frags_per_battle,rb_air_frags_per_death,rb_ground_frags_per_battle,rb_ground_frags_per_death
//France,Aviation,2020-05-17,1.0 ~ 12.7,1.0,30287.0,1242.9435467362234,58.25137748869152,0.9602585267606564,1.1172493148875757,1.330629973255852,1.2590527288935847

public class StatsFrom3Days {

    private String nation;
    private String cls;
    private Date date;
    private double rb_lower_br;
    private double rb_uptier_br;
    private double rb_battles_sum;
    private double rb_battles_mean;
    private double rb_win_rate;
    private double rb_air_frags_per_battle;
    private double rb_air_frags_per_death;
    private double rb_ground_frags_per_battle;
    private double rb_ground_frags_per_death;

    public StatsFrom3Days(String row) {
        String[] values = row.split(",");
        this.nation = values[0];
        this.cls = values[1];
        try {
            this.date = new SimpleDateFormat("yyyy-MM-dd").parse(values[2]);
        } catch (ParseException e) {
            e.printStackTrace();
            this.date = null;
        }

        String[] brRange = values[3].split(" ~ ");
        this.rb_lower_br = Double.parseDouble(brRange[0]);
        this.rb_uptier_br = Double.parseDouble(brRange[1]);
        this.rb_battles_sum = Double.parseDouble(values[4]);
        this.rb_battles_mean = Double.parseDouble(values[5]);
        this.rb_win_rate = Double.parseDouble(values[6]);
        this.rb_air_frags_per_battle = Double.parseDouble(values[7]);
        this.rb_air_frags_per_death = Double.parseDouble(values[8]);
        this.rb_ground_frags_per_battle = Double.parseDouble(values[9]);
        this.rb_ground_frags_per_death = Double.parseDouble(values[10]);
    }

    public double getRb_ground_frags_per_death() {
        return rb_ground_frags_per_death;
    }


    public double getRb_ground_frags_per_battle() {
        return rb_ground_frags_per_battle;
    }

    public double getRb_air_frags_per_death() {
        return rb_air_frags_per_death;
    }

    public double getRb_air_frags_per_battle() {
        return rb_air_frags_per_battle;
    }

    public double getRb_win_rate() {
        return rb_win_rate;
    }

    public double getRb_battles_mean() {
        return rb_battles_mean;
    }

    public double getRb_battles_sum() {
        return rb_battles_sum;
    }

    public double getRb_uptier_br() {
        return rb_uptier_br;
    }

    public double getRb_lower_br() {
        return rb_lower_br;
    }

    public Date getDate() {
        return date;
    }

    public String getCls() {
        return cls;
    }

    public String getNation() {
        return nation;
    }
}
