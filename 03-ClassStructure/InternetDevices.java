import java.net.Socket;

public class InternetDevices {
    String name;
    boolean connected;
    static int connectedDevices;
    
    public InternetDevices(String name) {
        this.name = name;
    }

    void connect() {
        if (connected == false) {
            connected = true;
            connectedDevices ++;
        }
    }

    void disconnect() {
        if (connected == true) {
            connected = false;
            connectedDevices --;
        }
    }

    boolean isConnected() {
        if (connected == true) {
            return true;
        } else {
            return false;
        }
    }

    String dispalyStatus() {
        return "Name: " + name + ",Connected: " + isConnected();
    }

    static String displayConnections() {
        return "Number of connected devices: " + connectedDevices;
    }

    public static void main(String[] args) {
        InternetDevices PC = new InternetDevices("Komputer");
        InternetDevices laptop = new InternetDevices("Laptop");
        InternetDevices tablet = new InternetDevices("Tablet");
        InternetDevices radio = new InternetDevices("Radio internetowe");
        InternetDevices TV = new InternetDevices("TV");

        PC.connect();
        laptop.connect();
        TV.connect();

        System.out.println((PC.dispalyStatus()));
        System.out.println(laptop.dispalyStatus());
        System.out.println(tablet.dispalyStatus());
        System.out.println(radio.dispalyStatus());
        System.out.println(TV.dispalyStatus());

        System.out.println(displayConnections());
        

    }

    
}
