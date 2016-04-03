
package com.mycompany.mavenproject1;

import java.util.Map;

public class SuperColumn {

    	private String name;
    	Map<String, Column> value;

    	public void setName(String bs) {
    		this.name = bs;
    	}
    	public void setValue(String name, Column value) {
    		this.value.put(name, value);
    	}
 public static void main(String[]args){
     SuperColumn sc = new SuperColumn();
    sc.setName("person1");
    sc.value=(Map<String, Column>) new Column("firstname", "mohamed");
    sc.value=(Map<String, Column>) new Column("familyname", "dakdouki");
 }
    }
    