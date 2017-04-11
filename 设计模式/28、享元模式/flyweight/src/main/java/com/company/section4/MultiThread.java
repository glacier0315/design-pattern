package com.company.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class MultiThread extends Thread {
	private SignInfo signInfo;
	public MultiThread(SignInfo _signInfo){
			this.signInfo = _signInfo;

	}
	
	public void run(){
		if(!signInfo.getId().equals(signInfo.getLocation())){
			System.out.println("晤瘍ㄩ"+signInfo.getId());
			System.out.println("蕉彸華硊ㄩ"+signInfo.getLocation());
			System.out.println("盄最祥假�姦芄�");
		}
		
	}
}
