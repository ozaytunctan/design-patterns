package org.javaturk.dp.ch03.isp.log.bad;

import org.javaturk.dp.ch03.isp.log.Log;

import java.io.File;

public interface Logger {

	void log(Log log);

	void openConnection();

	void closeConnection();

	void openFile(File file, boolean create);

	void closeFile();

}
