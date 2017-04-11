package com.company.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ConcreteDecorator2 extends Decorator {
	
	//隅砱掩党庉氪
	public ConcreteDecorator2(Component _component){
		super(_component);
	}
	
	//隅砱赻撩腔党庉源楊
	private void method2(){
		System.out.println("method2党庉");
	}
	
	//笭迡虜濬腔Operation源楊
	public void operate(){
		super.operate();
		this.method2();
	}
}
