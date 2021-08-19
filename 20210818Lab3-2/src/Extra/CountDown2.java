package Extra;



public class CountDown2 implements Runnable {
  Thread counter; int i;
  final static int N = 10;


  public void start() {
    counter = new Thread(this);
    i = N; counter.start();
  }

  public void stop() {
    counter = null;
  }

  public void run() {
    while(true) {
      if (counter == null) return;
      if (i>0)  { tick(); --i; }
      if (i==0) { return;}
    }
  }

  private void tick(){
    System.out.println(i);
    try{ Thread.sleep(1000);}
    catch (InterruptedException e){}
  }

}


