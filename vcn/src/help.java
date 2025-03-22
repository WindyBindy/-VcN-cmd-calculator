

public class help {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public void vhelp() {
        System.out.println( ANSI_CYAN +"-help   " +ANSI_RESET  +    "see all commands\n" +
                            ANSI_CYAN+"-v   "+ ANSI_RESET   +  "know version of -Vc\n" +
                            ANSI_CYAN+"-calc    "+ ANSI_RESET  +   "make a calcue of -Vc\n" +
                            ANSI_CYAN+ "-q  "+ ANSI_RESET  +  "to quit application\n" +
                            ANSI_CYAN +ANSI_RESET +"neofetch\n" +
                            ANSI_CYAN+"-fc,f,fc     "+ANSI_RESET   +    "fastcalcullation\n" +
                            ANSI_CYAN+"-con     "+ANSI_RESET   +    "calculator of power from number\n" +
                            ANSI_CYAN+"-webs    "+ANSI_RESET   +   "url of websitator\n" +
                ANSI_CYAN + "-tutf    " + ANSI_RESET + "tutorial for fastcalculator\n" +
                ANSI_CYAN + "search     "+ANSI_RESET+"google search\n"+
                ANSI_CYAN + "search url     "+ANSI_RESET+"url search like https://www."+ANSI_BLUE+"WEBSITE"+ANSI_RESET+".com");
    }
}
