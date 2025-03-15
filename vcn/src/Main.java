import java.util.Scanner;
import java.io.File;
import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;

public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static void main(String[] args)  throws Exception{
        String version = "1.1";
        if (args.length > 0 && (args[0].equals("version") || args[0].equals("v"))) {
            System.out.println("VCN Calculator v" + version);
            return;
        }

        System.out.println("starting VCN Calculator...");
        String anim= "|/-\\";
        for (int x =0 ; x < 101 ; x++) {
            String data = "\r" + anim.charAt(x % anim.length()) + " " + x;
            System.out.write(data.getBytes());
            Thread.sleep(8);
        }
        System.out.println(" ");
        Scanner scan = new Scanner(System.in);
        System.out.println("autor - windybindy in github");
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
        System.out.println("-Vcmdnord");
        System.out.println("-help for see commands");

        for(int i = 1; i == i; i++){

            System.out.print(ANSI_GREEN + "write command" + ANSI_RESET + ANSI_BLUE +">"+ ANSI_RESET);
            String command = scan.nextLine();

            switch (command) {
                //help command
                case "-help", "h":
                    System.out.println("-help       see all commands\n" +
                            "-v      know version of -Vc\n" +
                            "-calc     make a calculation\n" +
                            "-con       [beta]calculator of power from number\n" +
                            "-webs      url of website of -Vc\n" +
                            "-q    to quit application\n" +
                            "neofetch\n" +
                            "-msp       music player on deafalt in standart -vcn music(if you know java lng you can edit all scripts)\n" +
                            "-fc,f,fc       fastcalculator\n" +
                            "-tutf      tutorial for fastcalculator");
                    break;
                //version command
                case "-v", "version", "v", "vcn", "-vcn":
                    System.out.println("-Vcmdcalculator version is:"+version);
                    break;
                    //fc
                case "-fc", "f", "fc", "cf", "fastcalc","fastcalculator":
                    System.out.println("------fast as light!------");
                    System.out.print( "1num" + ANSI_BLUE + ">" + ANSI_RESET);
                    float numf1 = scan.nextFloat();

                    System.out.print("2num" + ANSI_BLUE + ">" + ANSI_RESET);
                    float numf2 = scan.nextFloat();

                    System.out.print("+,-,*,/?" + ANSI_BLUE + ">" + ANSI_RESET);
                    String atrebut = scan.nextLine();
                    atrebut = scan.nextLine();


                    switch (atrebut){
                        case "1", "+","p":
                            System.out.println(numf1 + numf2);
                            break;
                        case "2", "-","mm":
                            System.out.println(numf1 - numf2);
                            break;
                        case "3", "*","m":
                            System.out.println(numf1 * numf2);
                            break;
                        case "4", "/","d":
                            System.out.println(numf1 / numf2);
                            break;
                        default:
                            System.out.println("error of calc");
                    }
                    break;

                //calculator
                case "-calc", "calc", "calculator", "c":
                    System.out.println("------vcncarculator------");
                    System.out.print( "white first number?" + ANSI_BLUE + ">" + ANSI_RESET);
                    float num1 = scan.nextFloat();

                    System.out.print("white second number?" + ANSI_BLUE + ">" + ANSI_RESET);
                    float num2 = scan.nextFloat();

                    System.out.print("+,-,/,*?" + ANSI_BLUE + ">" + ANSI_RESET);
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
                case "-con", "con", "power-counter", "p", "-p", "power":
                    System.out.println("------vcncarculator------");
                    System.out.print("downnumber(number)>");
                    double base = scan.nextDouble();

                    System.out.print("upnumber(power)>");
                    int exponent = scan.nextInt();

                    double result = 1;
                    for (int b = 0; b < Math.abs(exponent); b++) {
                        result *= base;
                    }


                    if (exponent < 0) {
                        result = 1 / result;
                    }

                    System.out.println(result);
                    break;
                //website
                case "-webs", "website", "w", "docs", "doc":
                    System.out.println("https://github.com/WindyBindy/-VcN-cmd-calculator");
                    break;
                case "neofetch", "nordfetch", "vcnfetch":
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
                case "-q", "quit", "q":
                    System.exit(123);
                    break;

            }
        }
    }
}
