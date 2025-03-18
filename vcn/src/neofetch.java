import java.io.File;

public class neofetch {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public void vneofetch() {
                        
                        
        System.out.println(ANSI_RED +"        v                   vv     ccccccccccccc  n         nn\n" +
                                "        v                 vv     cc              n        n n\n" +
                                "        v               vv     cc               n       n  n\n" +
                                "        v             vv      cc               n      n   n\n" +
                                "        v           vv       cc               n     n    n\n" +
                                "        v         vv        cc               n    n     n\n" +
                                "        v       vv         cc               n   n      n\n" +
                                "        v     vv          cc               n  n       n\n" +
                                "        v   vv           cc               n n        n\n" +
                                "        v vv             cc              nn         n\n" +
                                "        vv                cccccccccccc  n          n" + ANSI_RESET);
                        System.out.println(ANSI_YELLOW +  "Operating System: " + ANSI_RESET+ System.getProperty("os.name"));

                        System.out.println(ANSI_YELLOW +   "Java Version: " + ANSI_RESET + System.getProperty("java.version"));
                        System.out.println(ANSI_YELLOW +   "User Name: " + ANSI_RESET + System.getProperty("user.name"));
                        File disk = new File("C:");
                        System.out.println(ANSI_YELLOW +   "Total Disk Space (GB): " + ANSI_RESET + disk.getTotalSpace() / (1024 * 1024 * 1024));
                        System.out.println(ANSI_YELLOW +   "Free Disk Space (GB): " + ANSI_RESET + disk.getFreeSpace() / (1024 * 1024 * 1024));
    }
}
