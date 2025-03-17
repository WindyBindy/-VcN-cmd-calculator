import java.util.Scanner;



public class Main {
//------------
//colors
//------------
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
//--------------
//start of programm
//--------------

System.out.println("starting VCN Calculator...");
        //progress bar
        progerssbar vbar = new progerssbar();
        vbar.vbar();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("autor - windybindy in github");
        System.out.println(ANSI_CYAN+"        v                   vv     ccccccccccccc  n         nn\n" +
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
        System.out.println("-Vcmdnord"+ANSI_RESET);
        System.out.println("-help for see commands");
                //--------------
                //command loop
                //--------------
        try {
            for (; true;) {
                System.out.print(ANSI_GREEN + "write command" + ANSI_RESET + ANSI_BLUE + ">" + ANSI_RESET);
                String command = scan.nextLine();
                //--------------
                //help command
                //--------------
                switch (command) {
                    case "-help", "h":
                        help vhelp = new help();
                        vhelp.vhelp();
                        break;
                    //--------------
                    //version command
                    //--------------
                    case "-v", "version", "v", "vcn", "-vcn":
                        System.out.println("-Vcmdcalculator version is:" + version);
                        break;
                    //--------------
                    //progressbaranimation
                    //--------------
                    case "progressbaranimation", "animation","bar":
                    vbar.vbar();
                    break;
                    //--------------
                    //fc tutorial
                    //--------------
                    case "-tutf":
                        System.out.println("1 is for +, 2 is fo -, 3 is for *, 4 is for /");
                        break;
                    //--------------
                    //music player
                    //--------------
                    case "-msp":
                        System.out.println("null(i haven't maked this function yet :( ");
                        break;
                    //--------------
                    //fast clalculator
                    //--------------
                    case "-fc", "f", "fc", "cf", "fastcalc", "fastcalculator", "1", "2", "3", "4", "5", "6", "7", "8",
                            "9", "10":
                        System.out.println("------fast as light!------");
                        System.out.print("1num" + ANSI_BLUE + ">" + ANSI_RESET);
                        float numf1 = scan.nextFloat();

                        System.out.print("2num" + ANSI_BLUE + ">" + ANSI_RESET);
                        float numf2 = scan.nextFloat();

                        System.out.print("+,-,*,/?" + ANSI_BLUE + ">" + ANSI_RESET);
                        String atrebutf = scan.nextLine();
                        atrebutf = scan.nextLine();

                        switch (atrebutf) {
                            case "1", "+", "p":
                                System.out.println(numf1 + numf2);
                                break;
                            case "2", "-", "mm":
                                System.out.println(numf1 - numf2);
                                break;
                            case "3", "*", "m":
                                System.out.println(numf1 * numf2);
                                break;
                            case "4", "/", "d":
                                System.out.println(numf1 / numf2);
                                break;
                            default:
                                System.out.println("error of calc");
                        }
                        break;
                    //--------------
                    //calculator
                    //--------------
                    case "-calc", "calc", "calculator", "c":
                        System.out.println("------vcncarculator------");
                        System.out.print("white first number?" + ANSI_BLUE + ">" + ANSI_RESET);
                        float num1 = scan.nextFloat();

                        System.out.print("white second number?" + ANSI_BLUE + ">" + ANSI_RESET);
                        float num2 = scan.nextFloat();

                        System.out.print("+,-,/,*?" + ANSI_BLUE + ">" + ANSI_RESET);
                        String atrebut = scan.nextLine();
                        atrebut = scan.nextLine();

                        switch (atrebut) {
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

                        break;
                    //--------------
                    //power calc
                    //--------------
                    case "-con", "con", "power-counter", "p", "-p", "power":
                        System.out.println("------vcncarculator------");
                        System.out.print("downnumber(number)" + ANSI_BLUE + ">" + ANSI_RESET);
                        double base = scan.nextDouble();

                        System.out.print("upnumber(power)" + ANSI_BLUE + ">" + ANSI_RESET);
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
                    //--------------
                    //website
                    //--------------
                    case "-webs", "website", "w", "docs", "doc":
                        System.out.println("https://github.com/WindyBindy/-VcN-cmd-calculator");
                        break;
                    //--------------
                    //neofetch
                    //--------------
                    case "neofetch", "nordfetch", "vcnfetch":
                        neofetch vneofetch = new neofetch();
                        vneofetch.vneofetch();
                        break;
                    //--------------
                    //quit
                    //--------------
                    case "-q", "quit", "q":
                        quit vquit = new quit();
                        vquit.vquit();
                        scan.close();
                        break;

                }
            }
            
            //errors
        } catch (NumberFormatException e) {
            System.out.println("⚠error of type!");
        } catch (NullPointerException e) {
            System.out.println("⚠error of type!");
        } catch (Exception e) {
            System.out.println("⚠error of type!");
        }
    }
}
