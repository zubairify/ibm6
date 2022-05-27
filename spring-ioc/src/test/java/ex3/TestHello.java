package ex3;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {

	@Test
	public void testGreeting() {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("appctx.xml");
		Hello h = (Hello) appCtx.getBean("hi");
		System.out.println("Greeting: " + h.getGreeting());
	}
}
