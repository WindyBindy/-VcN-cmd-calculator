
public class progerssbar{
  
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
