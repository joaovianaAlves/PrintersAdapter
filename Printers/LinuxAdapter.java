public class LinuxAdapter implements WindowsDriver{
    LinuxDriver Linux;
    
    public LinuxAdapter(LinuxDriver Linux){
        this.Linux = Linux;
    }

    
    public void print(String text){
        Linux.write(text);
    }

    public String getStatus(){
        return Integer.toString(Linux.status());
    }  
}
