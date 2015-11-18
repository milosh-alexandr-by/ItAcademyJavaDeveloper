import java.util.concurrent.Semaphore;


class Main {
	public synchronized void print10(int plus, String name) {
		System.out.print(name + ": " + plus + " ");
		for (int i=1; i<=10; i++) {
			System.out.print(plus+i + " ");
		}
	}
}

class MyThread extends Thread {
	String name;
	Main MN;
	Semaphore sem;
	
	public MyThread(String name, Main mn){
		this.name = name;
		MN = mn;
		start();
	}
	
	public void run(){
		for (int i=0; i<=90; i=i+10){
			MN.print10(i, name);
			System.out.println();
		}
	}
	
} 
public class TT {

	public static void main(String[] args) {
		
       

		Main MN = new Main();
		new MyThread("One", MN);
		new MyThread("Two", MN);
		


	}

}
