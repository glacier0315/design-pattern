package com.company.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ConcreteDecorator1 extends Decorator {
	
	//隅砱掩党庉氪
	public ConcreteDecorator1(Component _component){
		super(_component);
	}
	
	//隅砱赻撩腔党庉源楊
	private void method1(){
		System.out.println("method1 党庉");
	}
	
	//笭迡虜濬腔Operation源楊
	public void operate(){
		this.method1();
		super.operate();
	}
}
