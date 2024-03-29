package sec01.exam03;
//인터페이스 = 상수 + 추상메서드

public interface RemoteControl {
	//상수
	public int MAX_VOOLUME=10;
	public int MIN_VOOLUME=0;
	
	//추상메서드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);

}