package com.tyss.testjdbc;

import java.sql.SQLException;

public interface Inteface {
	public void insert() throws SQLException, ClassNotFoundException;
	public void delete() throws ClassNotFoundException, SQLException;
	public void update() throws ClassNotFoundException, SQLException;
	

}
