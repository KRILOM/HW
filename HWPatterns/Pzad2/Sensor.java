package Pzad2;

import java.util.ArrayList;
import java.util.List;

public class Sensor {
    private List<Alarm> alarmList = new ArrayList<>();

    public void add(Alarm alarm){
        alarmList.add(alarm);
    }
    public void notify(int temp){

        for(Alarm w : alarmList ){
            w.tempChanged(temp);
        }
    }
    public void changeTemerature(int temp){
        System.out.println("temperature: " + temp);
        notify(temp);
    }

}
