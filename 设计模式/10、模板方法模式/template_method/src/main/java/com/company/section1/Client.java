package com.company.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 客户开始使用这个模型
 */
public class Client {

	public static void main(String[] args) {
		//牛叉公司要H1型号的悍马
		HummerH1Model h1 = new HummerH1Model();
		
		//H1模型演示
		h1.start();
		h1.engineBoom();
		h1.run();
		h1.alarm();
		h1.run(); 
		h1.stop();

	}

}
