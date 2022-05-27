package ex4;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("stk")
@Scope("singleton")
public class Stock {
	
	public Stock() {
		System.out.println("Stock constructor");
	}
	
	private static Stock stock;
	
	public static Stock get() {
		System.out.println("Stock singleton");
		if(stock == null)
			stock = new Stock();
		
		return stock;
	}
}
