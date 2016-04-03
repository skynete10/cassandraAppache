
package com.mycompany.mavenproject1;

import java.util.Map;

public class ColumnFamily {

    	private String name;
    	private Map<String, SuperColumn> value;
    	
    	public void setName(String bs) {
    		this.name = bs;
    	}
    	public void setValue(String name, SuperColumn value) {
    		this.value.put(name, value);
    	}
        public static void main(String[]args){
           ColumnFamily cf = new ColumnFamily();
    cf.setName("AddressBook");

    SuperColumn row= new SuperColumn();
   row.setName("person1");
    row.value=(Map<String, Column>) new Column("firstname", "mohamed");
    row.value=(Map<String, Column>) new Column("familyname", "dakdouki");
    cf.setValue("person1", row);
        }
    }