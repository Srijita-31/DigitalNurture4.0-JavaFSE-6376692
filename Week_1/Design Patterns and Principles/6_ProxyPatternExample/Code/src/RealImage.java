public class RealImage implements Image{
    private final String fileName;

    public RealImage(String filename) {
        this.fileName = filename;
        loadFromRemoteServer();
    }

    private void loadFromRemoteServer() {
        System.out.println("Loading image from remote server: " + fileName);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }

    @Override
    public void display() {
        System.out.println("Displaying: " + fileName);
    }
}