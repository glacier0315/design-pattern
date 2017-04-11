package com.company.chain;

import java.util.Random;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class DnsServer {
	//上级DNS是谁
	private DnsServer upperServer;
	//解析域名
	public final Recorder resolve(String domain){
		Recorder recorder=null;
		if(isLocal(domain)){//是本服能解析的域名
			recorder = echo(domain);
		}else{//本服不能解析
			//提交上级DNS进行解析
			recorder = upperServer.resolve(domain);
		}
		return recorder;
	}
	
	//指向上级DNS
	public void setUpperServer(DnsServer _upperServer){
		this.upperServer = _upperServer;
	}
	
	//每个DNS都有一个DNS的数据处理区（ZONE）,检查域名是否在本zone中
	protected abstract boolean isLocal(String domain);
	
	//每个DNS服务器都必须实现解析任务
	protected Recorder echo(String domain){
		Recorder recorder = new Recorder();
		//获得IP地址
		recorder.setIp(genIpAddress());
		recorder.setDomain(domain);
		
		return recorder;
	}
	
	//随机产生一个IP地址，工具类
	protected String genIpAddress(){
		Random rand = new Random();
		String address = rand.nextInt(255) + "." + rand.nextInt(255) + "."+ rand.nextInt(255) + "."+ rand.nextInt(255);
		
		return address;
	}
}
