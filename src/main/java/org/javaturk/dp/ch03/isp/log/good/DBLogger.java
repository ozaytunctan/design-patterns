package org.javaturk.dp.ch03.isp.log.good;

public interface DBLogger extends Logger {

	void openConnection();

	void closeConnection();
}
