package lesson12;

public class Configuration {
    private final String serverAddress;
    private final int port;

    public Configuration(String serverAddress, int port) {
        this.serverAddress = serverAddress;
        this.port = port;
    }

    public String getServerAddress() {
        return serverAddress;
    }
    public int getPort() {
        return port;
    }
}