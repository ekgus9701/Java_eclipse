
public interface PhoneInterface {
	final int TIMEOUT = 10000; //����ʵ弱��
	void sendCall(); //�߻�޼ҵ�
	void receiveCall(); //�߻�޼ҵ�
	default void printLogo() { //default �޼ҵ�
		System.out.println("** Phone! **");
	}

}