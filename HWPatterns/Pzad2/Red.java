package Pzad2;

public class Red implements Alarm{
    private boolean Temp;
    @Override
    public void tempChanged(int temp) {
if(temp < 600){
    Temp = true;
}
else if(temp >= 600 && Temp){
    System.out.println("Red");
        Temp = false;
}
    }
}
