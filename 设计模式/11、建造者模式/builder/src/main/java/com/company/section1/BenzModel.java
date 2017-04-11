package com.company.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 奔驰车模型
 */
public class BenzModel extends CarModel {


	@Override
	protected void alarm() {
		System.out.println("奔驰车的喇叭声音是这个样子的...");
	}


	@Override
	protected void engineBoom() {
		System.out.println("奔驰车的引擎室这个声音的...");
	}


	@Override
	protected void start() {
		System.out.println("奔驰车跑起来是这个样子的...");
	}


	@Override
	protected void stop() {
		System.out.println("奔驰车应该这样停车...");
	}

}
