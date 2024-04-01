package com.spring.javabasesd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Waiter {
	@Autowired
	@Qualifier("getIndian")
	IFoodMenu ifoodMenu;
	@Autowired
	IFoodMenu menus;
	IFood menuItems;
	public Object setMenu;
	public IFoodMenu getMenuItems(IFoodMenu menuItems) {
		return menuItems= menuItems;
	}
public List<String> viewMenu(String choice) {
	List<String> menuList = new ArrayList<>
	}

	}
	
