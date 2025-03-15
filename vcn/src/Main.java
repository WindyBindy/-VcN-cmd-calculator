import java.util.Scanner;
import java.io.File;
import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("        v                   vv     ccccccccccccc  n         nn\n" +
                "        v                 vv     cc              n        n n\n" +
                "        v               vv     cc               n       n  n\n" +
                "        v             vv      cc               n      n   n\n" +
                "        v           vv       cc               n     n    n\n" +
                "        v         vv        cc               n    n     n\n" +
                "        v       vv         cc               n   n      n\n" +
                "        v     vv          cc               n  n       n\n" +
                "        v   vv           cc               n n        n\n" +
                "        v vv             cc              nn         n\n" +
                "        vv                cccccccccccc  n          n");
        System.out.println("-Vnordcmdcalculator");
        System.out.println("-help for see commands");

        for(int i = 1; i == i; i++){
            System.out.print("write command>");
            String command = scan.nextLine();
            String version = "1.0";
            switch (command) {
                //help command
                case "-help":
                    System.out.println("-help       see all commands\n" +
                            "-v      know version of -Vc\n" +
                            "-calc     make a calculation\n" +
                            "-poc       [beta]colculatorr of power from number\n" +
                            "-webs      url of website of -Vc\n" +
                            "-q      to quit application\n" +
                            "neofetch");
                    break;
                //version command
                case "-v":
                    System.out.println("-Vcmdcalculator version is:"+version);
                    break;
                //calculator
                case "-calc":
                    System.out.println("------vcncarculator------");
                    System.out.print("white first number?>");
                    float num1 = scan.nextFloat();

                    System.out.print("white second number?>");
                    float num2 = scan.nextFloat();

                    System.out.print("+,-,/,*?>");
                    String atrebut = scan.nextLine();
                    atrebut = scan.nextLine();


                    switch (atrebut){
                        case "+":
                            System.out.println(num1 + num2);
                            break;
                        case "-":
                            System.out.println(num1 - num2);
                            break;
                        case "*":
                            System.out.println(num1 * num2);
                            break;
                        case "/":
                            System.out.println(num1 / num2);
                            break;
                        default:
                            System.out.println("error of calc");
                    }
                    //end of calculator
                    break;
                //colculatorr of power from number
                case "-poc":
                    System.out.println("------vcncarculator------");
                    System.out.print("downnumber(number)>");
                    double base = scan.nextDouble();

                    System.out.print("upnumber(power)>");
                    int exponent = scan.nextInt();

                    double result = 1;
                    for (int b = 0; b < Math.abs(exponent); b++) {
                        result *= base;
                    }

                    // Обработка отрицательных степеней
                    if (exponent < 0) {
                        result = 1 / result;
                    }

                    System.out.println(result);
                    break;
                //website
                case "-webs":
                    System.out.println("w");
                    break;
                case "neofetch":
                    System.out.println("        v                   vv     ccccccccccccc  n         nn\n" +
                            "        v                 vv     cc              n        n n\n" +
                            "        v               vv     cc               n       n  n\n" +
                            "        v             vv      cc               n      n   n\n" +
                            "        v           vv       cc               n     n    n\n" +
                            "        v         vv        cc               n    n     n\n" +
                            "        v       vv         cc               n   n      n\n" +
                            "        v     vv          cc               n  n       n\n" +
                            "        v   vv           cc               n n        n\n" +
                            "        v vv             cc              nn         n\n" +
                            "        vv                cccccccccccc  n          n");
                    System.out.println("Operating System: " + System.getProperty("os.name"));

                    System.out.println("Java Version: " + System.getProperty("java.version"));
                    System.out.println("User Name: " + System.getProperty("user.name"));
                    File disk = new File("C:");
                    System.out.println("Total Disk Space (GB): " + disk.getTotalSpace() / (1024 * 1024 * 1024));
                    System.out.println("Free Disk Space (GB): " + disk.getFreeSpace() / (1024 * 1024 * 1024));

                    break;
                //quit
                case "-q":
                    System.exit(123);
                    break;
            }
        }
    }
}
