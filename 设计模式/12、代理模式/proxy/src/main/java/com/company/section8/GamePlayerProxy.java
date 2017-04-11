package com.company.section8;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 代练者
 */
public class GamePlayerProxy implements IGamePlayer,IProxy {
	private IGamePlayer gamePlayer = null;
	
	//通过构造函数传递要对谁进行代练
	public GamePlayerProxy(IGamePlayer _gamePlayer){
		this.gamePlayer = _gamePlayer;
	}
	
	//代练杀怪
	public void killBoss() {
		this.gamePlayer.killBoss();
	}

	//代练登录
	public void login(String user, String password) {
		this.gamePlayer.login(user, password);

	}

	//代练升级
	public void upgrade() {
		this.gamePlayer.upgrade();
		this.count();
	}
	
	//计算费用
	public void count(){
		System.out.println("升级总费用是：150元");
	}
}
