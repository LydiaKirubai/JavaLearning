package learningday5;

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
