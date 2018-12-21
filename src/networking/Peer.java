package networking;

public class Peer {

    private static int number = 0;

    private String hostname;
    private int port;

    private String serverName;
    private int serverPort;


    public Peer(){
        number++;
        System.out.println(number);
    }


    public void setPort(int port){
        this.port = port;
        System.out.println("Port set: " + port);
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
        System.out.println("Hostname set: " + hostname);
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public void setServerPort(int serverPort) {
        this.serverPort = serverPort;
    }

    public String getHostname() {
        return hostname;
    }

    public int getPort() {
        return port;
    }

    public String getServerName() {
        return serverName;
    }

    public int getServerPort() {
        return serverPort;
    }
}
