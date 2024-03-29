package sec01.exam04;

import sec01.exam03.RemoteControl;
import sec01.exam05.Searchable;

public class Television implements RemoteControl {
	
	private int volume;
	
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOOLUME) {
			this.volume=RemoteControl.MAX_VOOLUME;
		} else if(volume<RemoteControl.MIN_VOOLUME) {
			this.volume=RemoteControl.MIN_VOOLUME;
		} else {
			this.volume=volume;
		}
		
		System.out.println("현재 TV 볼륨: "+this.volume);
	}

}
