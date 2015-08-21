package com.prp;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.SqlRow;
import com.prp.models.Role;

public class TestConnection {
	public void testConnection(){
		/*String sql = "select count(*) as count from dual";
		SqlRow sqlRow = Ebean.createSqlQuery(sql).findUnique();
		Integer i = sqlRow.getInteger("count");
		System.out.println("Got "+i+" - Good Data Source");*/
		
		Role role = new Role();
		role.setName("test");
		role.setDescription("test desc");
		
		Ebean.save(role);
	}
}
