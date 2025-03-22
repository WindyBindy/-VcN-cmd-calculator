import java.util.Scanner;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.awt.Desktop;
public class searchurl {
    public void vsearchurl() throws Exception{
      Scanner scan = new Scanner(System.in, StandardCharsets.UTF_8);
      System.out.println("search https://");
      
      String searchi = scan.nextLine();
      String url = "https://www." + searchi + ".com/";
      java.awt.Desktop.getDesktop().browse(new java.net.URI(url));
      
      
      
    }
}
