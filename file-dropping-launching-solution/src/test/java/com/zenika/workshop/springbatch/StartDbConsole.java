/**
 * 
 */
package com.zenika.workshop.springbatch;

import java.sql.SQLException;

import org.h2.tools.Console;


public class StartDbConsole {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		Console.main("-web","-browser");
	}

}
