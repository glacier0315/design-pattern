package com.company.section7;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Facade {
	//被委托的对象
	private ClassA a = new ClassA();
	private ClassB b = new ClassB();
	private Context context = new Context();
	
	//提供给外部访问的方法
	public void methodA(){
		this.a.doSomethingA();
	}
	
	public void methodB(){
		this.b.doSomethingB();
	}
	
	public void methodC(){
		this.context.complexMethod();
	}
}
