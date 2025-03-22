import java.util.Scanner;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.awt.Desktop;
public class search {
    public void vsearch() throws Exception{
      Scanner scan = new Scanner(System.in, StandardCharsets.UTF_8);
      System.out.println("search from google!");
      
      String searching = scan.nextLine();
      String plusearch = searching.replace(" ", "+");
      System.out.println("vcn opening search"+searching);
      java.awt.Desktop.getDesktop().browse(new java.net.URI("https://www.google.com/search?q=" + plusearch));
    }
}
