package Pzad4;

public class Visitors {

private ILogger iLogger;


    public void write(String message){
        iLogger.write(message);
    }

    public void setiLogger(ILogger iLogger) {
        this.iLogger = iLogger;
    }
}
