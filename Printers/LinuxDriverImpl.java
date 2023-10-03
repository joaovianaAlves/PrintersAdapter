public class LinuxDriverImpl implements LinuxDriver {
    @Override
    public void write(String text) {
        System.out.println("imprimindo: " + text);
    }

    @Override
    public int status() {
        return 200; 
    }
}
