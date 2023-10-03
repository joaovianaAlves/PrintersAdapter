public class DriverHP_Linux implements LinuxDriver
{
public void write(String text) {
 System.out.println(text);
}
public int status() {
 return 123;
}
}