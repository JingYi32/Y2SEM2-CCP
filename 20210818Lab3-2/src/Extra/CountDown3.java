package Extra;



public class CountDown3 extends Thread {
  int i =10;

  public void run() {
    while(true) {
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


