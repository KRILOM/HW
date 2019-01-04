package Pzad2;

public class Green implements Alarm{
    private boolean Temp;
    @Override
    public void tempChanged(int temp) {
        if(temp < 100){
            Temp = true;
        }
        else if(temp >= 100 && Temp){
            System.out.println("Green");
            Temp = false;
        }
    }
}
