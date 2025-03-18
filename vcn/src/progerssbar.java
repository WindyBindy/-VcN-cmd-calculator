
public class progerssbar{
  public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String PLEANSI_PUR = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
        public void vbar()  throws Exception{
        String anim= "|/-\\";
        for (int x = 0; x < 101; x++) {
          String data = "\r" + anim.charAt(x % anim.length()) + " " + x;
          System.out.write(data.getBytes());
          Thread.sleep(8);
        }
        System.out.println(" ");
        
    }
}
