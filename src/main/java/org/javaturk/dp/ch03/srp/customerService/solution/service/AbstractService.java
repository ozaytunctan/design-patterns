package org.javaturk.dp.ch03.srp.customerService.solution.service;

import org.javaturk.dp.ch03.srp.customerService.solution.util.ATMLogger;

import java.util.logging.Logger;

/**
 * Base class for all service classes. It provides common objects and functionality.
 * @author akin
 *
 * @version $Revision: 1.0 $
 */
public abstract class AbstractService {
	protected Logger logger;
	
	/**
	 * Constructor for AbstractService.
	 */
	public AbstractService(){
		logger = ATMLogger.getLogger();
	}
}