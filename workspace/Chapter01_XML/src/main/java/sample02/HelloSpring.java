package sample02;

public class HelloSpring {

	public static void main(String[] args) {
		MessageBean messageBean;
		messageBean = new MessageBeanKo();
		messageBean.sayHello("스프링");
		messageBean = new MessageBeanEn();
		messageBean.sayHello("Spring");
	}

}