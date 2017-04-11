package com.company.builder;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class CarBuilder {
	//待建造的汽车
	private ICar car;
	//设计蓝图
	private Blueprint bp;
	
	public Car buildCar(){
		//按照顺序生产一辆车
		return new Car(buildEngine(),buildWheel());
	}
	
	//接收一份设计蓝图
	public void receiveBlueprint(Blueprint _bp){
		this.bp = _bp;
	}
	
	//查看蓝图，只有真正的建造者才可以查看蓝图
	protected Blueprint getBlueprint(){
		return bp;
	}
	
	//建造轮子
	protected abstract String buildWheel();
	//建造引擎
	protected abstract String buildEngine();
	
}
