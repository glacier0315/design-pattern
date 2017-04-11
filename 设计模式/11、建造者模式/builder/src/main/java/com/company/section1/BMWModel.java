package com.company.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 宝马车模型
 */
public class BMWModel extends CarModel {


	@Override
	protected void alarm() {
		System.out.println("宝马车的喇叭声音是这个样子的...");
	}


	@Override
	protected void engineBoom() {
		System.out.println("宝马车的引擎室这个声音的...");
	}


	@Override
	protected void start() {
		System.out.println("宝马车跑起来是这个样子的...");
	}


	@Override
	protected void stop() {
		System.out.println("宝马车应该这样停车...");
	}

}
