package jaeseon.spring.polymorphism;

public class SamsungTV implements TV {

	private Speaker speaker;
	private int price;

	public SamsungTV() {
		System.out.println("SamsungTV ��ü ����");
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("setPrice() �޼ҵ� ȣ��");
		this.price = price;
	}

	public Speaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speaker speaker) {
		System.out.println("setSpeaker() �޼��� ȣ��");
		this.speaker = speaker;
	}

	// powerOn(), powerOff() �޼��� ����
	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}

	public void powerOn() {
		System.out.println("SamsungTV ������ �Ҵ�. (���� : " + price + ")");
	}

	public void powerOff() {
		System.out.println("SamsungTV ������ ����.");

	}

}