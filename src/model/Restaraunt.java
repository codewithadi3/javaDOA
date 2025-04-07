package model;

public class Restaraunt {
private int restaraunt_id;
private String restaraunt_name;
private String restaraunt_address;
private boolean restaraunt_active;


public int getRestaraunt_id() {
    return restaraunt_id;
}


public void setRestaraunt_id(int restaraunt_id) {
    this.restaraunt_id = restaraunt_id;
}


public String getRestaraunt_name() {
    return restaraunt_name;
}


public void setRestaraunt_name(String restaraunt_name) {
    this.restaraunt_name = restaraunt_name;
}


public String getRestaraunt_address() {
    return restaraunt_address;
}


public void setRestaraunt_address(String restaraunt_address) {
    this.restaraunt_address = restaraunt_address;
}


public boolean isRestaraunt_active() {
    return restaraunt_active;
}


public void setRestaraunt_active(boolean restaraunt_active) {
    this.restaraunt_active = restaraunt_active;
}


public Restaraunt(int restaraunt_id, String restaraunt_name, String restaraunt_address, boolean restaraunt_active) {
    this.restaraunt_id = restaraunt_id;
    this.restaraunt_name = restaraunt_name;
    this.restaraunt_address = restaraunt_address;
    this.restaraunt_active = restaraunt_active;
}


public Restaraunt(String restaraunt_name, String restaraunt_address, boolean restaraunt_active) {
    this.restaraunt_name = restaraunt_name;
    this.restaraunt_address = restaraunt_address;
    this.restaraunt_active = restaraunt_active;
}


public Restaraunt() {
}


@Override
public String toString() {
    return  restaraunt_id + "    " + restaraunt_name
            + "     " + restaraunt_address + "         " + restaraunt_active;
}

}
