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
	public static final int PROPERTY_SCENARIO = 1;
	public static final int PROPERTY_GRAPHICS = 2;
	public static final int PROPERTY_SOUND = 3;
	
	int id;
	String name;
	String nickname;
	int job; //当前职称
	int[] propertys; //4项基本属性
	int[] skillLevels; //8种职业技能级别
	int power;
	int powerMax; 
	int salary; //薪水
	int contract; //合约金
	String desc; //招聘简介
	int efficiency; //工作效率
	int rank; //招聘分类
	int talent; //天赋职业
	
	Company company; //所属公司
	
	@Deprecated
	public Employee(){
		int[] skillLevels = {1, 0, 0, 0, 0, 0, 0, 0};
		int[] propertys = {4, 3, 2, 1};
		init(0, "Arathi", "A酱", JOBTITLE_PROGRAMER, propertys, skillLevels, 64);
	}
	
	public Employee(String csv){
		String[] csvStr = Util.CsvSpliter(csv);
		int[] csvInt;
		int i;
		if (csvStr.length!=Constant.CSV_VALUE_AMOUNT){
			id = -1;
			return;
		}
		csvInt = new int[Constant.CSV_VALUE_AMOUNT];
		for (i=0; i<Constant.CSV_VALUE_AMOUNT; i++){
			if (csvStr[i].startsWith("\"") && csvStr[i].endsWith("\"")){
				csvInt[i] = 0;
				csvStr[i] = csvStr[i].substring(1, csvStr[i].length()-1);
			}
			else{
				csvInt[i] = Integer.parseInt(csvStr[i]);
			}
		}
		
		propertys = new int[4];
		skillLevels = new int[8];
		//================
		id = csvInt[0];
		//TODO csvInt[1] 均为0
		name = csvStr[2];
		nickname = csvStr[3];
		//TODO csvInt[4];
		//TODO csvInt[5];
		rank = csvInt[6];
		salary = csvInt[7];
		contract = csvInt[8];
		efficiency = csvInt[9];
		power = powerMax = csvInt[10];
		for (i=0; i<4; i++){
			propertys[i] = csvInt[11+i]; //11~14
		}
		//TODO csvInt[15];
		job = csvInt[16];
		talent = csvInt[17];
		for (i=0; i<8; i++){
			skillLevels[i] = csvInt[18+i]; //18~25
		}
		desc = csvStr[26];
	}
	
	@Deprecated
	public void init(int id, String name, String nick, int job, int[] propertys, int[] skillLevels, int health){
		this.name = name;
		this.nickname = nick;
		this.job = job;
		this.propertys = propertys;
		this.skillLevels = skillLevels;
		this.power = this.powerMax = health;
	}
	
	public void levelUp(){
		if (company==null) return;
		if (skillLevels[job]>=Constant.SKILL_MAX_LEVEL) return;
		//TODO 扣除研究点数
		//company.costTechPoint();
		//TODO 增加属性点
		//propertys[0]+=config.[][];
		//TODO 增加薪水
		//salary+=;
		//TODO 等级提升
		skillLevels[job]++;
	}
	
	public void checkIn(Company company){
		if (company==null) return;
		//TODO 扣除合约金
		//company.costMoney();
		this.company = company;
	}
	
	public void resign(){
		//TODO company相关的清理
		this.company = null;
	}
	
	@Override
	public String toString(){
		String info="No." + id + " " + name + "("+nickname+")\n";
		info += "体力：" + power + "/" + powerMax + "\n";
		int i;
		info += "职称：" + job;
		info += "属性：";
		for (i=0; i<4; i++){
			if (i!=0) info += ",";
			info += propertys[i];
		}
		info += "年薪：" + salary + "\n";
		return info;
	}
}
