package com.example.android.recyclertask;

import java.io.Serializable;

/**
 * Created by win8 on 7/15/2017.
 */

public class Movie implements Serializable {
    String Name,Rate,Desc;
    Movie (String Name , String Rate , String Desc){
        this.Name=Name;
        this.Rate=Rate;
        this.Desc=Desc;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRate() {
        return Rate;
    }

    public void setRate(String rate) {
        Rate = rate;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }
}
