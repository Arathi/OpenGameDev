package org.beh.gamedev;

import java.util.ArrayList;
import java.util.List;

public class Game {
	public static final int METHOD_NONE = 0; //非续作
	public static final int METHOD_EXTENSION = 1; //资料片
	public static final int METHOD_SEQUEL = 2; //续集
	public static final int METHOD_PREQUEL = 3; //前传
	public static final int METHOD_REBUILD = 4; //复刻
	public static final int METHOD_RUMOR = 5; //外传
	
	List<String> reference; //前作、原作、参考
	String name; //名称
	int type; //类型
	int content; //内容
	int platform; //平台
	
	int method; //续作性质
	
	// 分数
	int fun; //趣味性
	int creativity; //独创性
	int graphics; //图像
	int sound; //音乐
	int bugs; //Bug数量
	
	// 评分
	int[] score; //杂志评分
	int expect; //期待度
	int famous; //知名度
	
	int salesVolume; //销量
	int price; //销售单价
	int cost; //成本
	
	protected Game(){
		
	}
	
	protected void init(){
		reference = new ArrayList<>();
		score = new int[Constant.MAGAZINE_AMOUNT];
		for (int i=0; i<Constant.MAGAZINE_AMOUNT; i++){
			score[i] = 0;
		}
	}
	
	/**
	 * 创建新作
	 */
	public static Game CreateNewGame(){
		Game game = new Game();
		
		return null;
	}
	
	/**
	 * 创建续作
	 */
	public static Game CreateSequel(List<Game> ref, int method){
		Game game = new Game();
		
		return null;
	}
	
}
