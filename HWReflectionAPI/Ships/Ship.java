package Ships;


public class Ship {

    boolean load = false;
    boolean unload = false;

    public Ship(boolean load, boolean unload) {
        this.load = load;
        this.unload = unload;
    }
    public boolean isLoad(){
        return load;
    }
    public boolean isUnload(){
        return unload;
    }
    public void setLoad(boolean load) {
        this.load = load;
    }

    public void setUnload(boolean unload) {
        this.unload = unload;
    }
}
