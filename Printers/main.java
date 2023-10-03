public class main {
    public static void main(String[] args) {

        LinuxDriver linuxDriver = new LinuxDriverImpl();

        WindowsDriver linuxAdapter = new LinuxAdapter(linuxDriver);

        Windows windows = new Windows(linuxAdapter);

        String status = windows.usaImpressora("Hello, World!");
        System.out.println("Status: " + status);
    }
}