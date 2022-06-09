/**
 * Connector.java
 * jCOLIBRI2 framework. 
 * @author Juan A. Recio-Garc�a.
 * GAIA - Group for Artificial Intelligence Applications
 * http://gaia.fdi.ucm.es
 * 05/01/2007
 */
package jcolibri.cbrcore;


import jcolibri.exception.InitializingException;

import java.util.Collection;


public interface Connector {

	
	/**
	 * Initialices the connector with the given XML file
	 * 
	 * @param file XMl file with the settings
	 * @throws InitializingException
	 *             Raised if the connector can not be initialezed.
	 */
	public void initFromXMLfile(java.net.URL file) throws InitializingException;

	/**
	 * Cleanup any resource that the connector might be using, and suspends the
	 * service
	 * 
	 */
	public void close();

	/**
	 * Stores given classes on the storage media
	 * 
	 * @param cases
	 *            List of cases
	 */
	public void storeCases(Collection<CBRCase> cases);

	/**
	 * Deletes given cases for the storage media
	 * 
	 * @param cases
	 *            List of cases
	 */
	public void deleteCases(Collection<CBRCase> cases);

	/**
	 * Returns max cases without any special consideration
	 * 
	 * @return The list of retrieved cases
	 */
	public Collection<CBRCase> retrieveAllCases();

	/**
	 * Retrieves some cases depending on the filter. TODO.
	 */
	public Collection<CBRCase> retrieveSomeCases(CaseBaseFilter filter);

}
