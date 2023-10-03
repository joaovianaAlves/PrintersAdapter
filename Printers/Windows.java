public class Windows
{
 WindowsDriver printerDriver;

 public Windows(WindowsDriver printerDriver) {
 this.printerDriver=printerDriver;
 }

 public String usaImpressora(String texto){
 printerDriver.print(texto);
 return printerDriver.getStatus();
 }
}

