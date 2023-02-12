package learning.core.java8.methodrefference;

interface Messageable {
	Message getMessage(String msg);
}

class Message {
	Message(String msg) {
		System.out.print(msg);
	}
}

public class ConstructorRefference {
	public static void main(String[] args) {
		Messageable messageable = Message::new;
		messageable.getMessage("ok");
	}
}
