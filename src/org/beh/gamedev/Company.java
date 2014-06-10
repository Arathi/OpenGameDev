package org.beh.gamedev;

import java.util.List;
import java.util.Set;

public class Company {
	String name;
	List<Employee> employees;
	List<Game> games;
	Set<Platform> platforms; //支持的平台
	int capital; //资本
	int level; //规模 4/6/8 -> 4/6/8/12/16
	int knowledge; //累计知识
	int settleMethod; //结算方式(月付/年付)
}
