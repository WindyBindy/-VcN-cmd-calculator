import java.util.Scanner;

public class fastcalc {
  public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String PLEANSI_PUR = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public void vfc() throws Exception {
    Scanner scan = new Scanner(System.in);
        System.out.println("------fast as light!------");
                        System.out.print(PLEANSI_PUR + "1num" + ANSI_BLUE + ">" + ANSI_RESET);
                        float numf1 = scan.nextFloat();

                        System.out.print(PLEANSI_PUR +  "2num" + ANSI_BLUE + ">" + ANSI_RESET);
                        float numf2 = scan.nextFloat();

                        System.out.print(PLEANSI_PUR + "+,-,*,/?" + ANSI_BLUE + ">" + ANSI_RESET);
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
    }
}
