package sec01.exam02;

import java.awt.Toolkit;

public class BeepTask implements Runnable{

	@Override
	public void run() {
		Toolkit toolKit=Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolKit.beep();
			try {Thread.sleep(500);}catch(Exception e) {}
		}
		
	}

}
