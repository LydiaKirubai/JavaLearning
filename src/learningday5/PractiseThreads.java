package learningday5;

//A thread represents a single, independent path of execution within a program.
//It is the smallest unit of execution that can be managed by the operating system
//or the Java Virtual Machine (JVM).

class goodMorning extends Thread{
	public void run() {
		System.out.println("Good Morning");
		
	}
}

class goodNight extends Thread{
	public void run() {
		System.out.println("Good Night");
	}
}

public class PractiseThreads {
	
	public static void main(String[] args) {
		goodMorning e = new goodMorning();
		goodNight o = new goodNight();
		
		e.start();
		o.start();
		
	}

}
