package org.beh.gamedev;

public class Employee {
	public static final int JOBTITLE_PROGRAMER = 0;
	public static final int JOBTITLE_WRITER = 1;
	public static final int JOBTITLE_DESIGNER = 2;
	public static final int JOBTITLE_SOUND_ENG = 3;
	public static final int JOBTITLE_DIRECT = 4;
	public static final int JOBTITLE_PRODUCE = 5;
	public static final int JOBTITLE_HARD_ENG = 6;
	public static final int JOBTITLE_HACK = 7;
	
	public static final int PROPERTY_PROGRAM = 0;
	public static final int PROPERTY_CREATION = 1;
	public static final int PROPERTY_DESIGN = 2;
	public static final int PROPERTY_SOUND = 3;
	
	String name;
	int job; //当前职称
	int[] propertys; //4项基本属性
	int[] skillLevels; //职业技能级别
	int health;
	int healthMax; 
	
	@Deprecated
	public Employee(){
		int[] skillLevels = {1, 0, 0, 0, 0, 0, 0, 0};
		int[] propertys = {4, 3, 2, 1};
		init("Arathi", JOBTITLE_PROGRAMER, propertys, skillLevels, 64);
	}
	
	public void init(String name, int job, int[] propertys, int[] skillLevels, int health){
		this.name = name;
		this.job = job;
		this.propertys = propertys;
		this.skillLevels = skillLevels;
		this.health = this.healthMax = health;
	}
}
