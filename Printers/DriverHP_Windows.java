public class DriverHP_Windows implements WindowsDriver
{
 public void print(String text){
 System.out.println(text);
 }
 public String getStatus(){
 return "no paper";
 }
}
