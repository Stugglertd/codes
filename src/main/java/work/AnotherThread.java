package work;

public class AnotherThread extends Thread{

	@Override
	public void run() {
	 for(int i=1;i<=10;i++) {
	  System.out.println("Another Value of i is : " + i);
	  
	  try {
		Thread.sleep(2000);
	  }catch (Exception e) {
		
	  }
	 }
	}

}
