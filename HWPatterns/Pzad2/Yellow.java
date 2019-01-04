package Pzad2;

public class Yellow implements Alarm {
    private boolean Temp;
    @Override
    public void tempChanged(int temp) {
        if(temp < 300){
            Temp = true;
        }
        else if(temp >= 300 && Temp){
            System.out.println("Yellow");
            Temp = false;
        }
    }
}
