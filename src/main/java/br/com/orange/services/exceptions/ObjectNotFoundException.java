/** 
 * Author: Antonny
 * Project: Orange
 * Date: 29/10
 */

package br.com.orange.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException (String msg) {
		super (msg);
	}
	
	public ObjectNotFoundException (String msg, Throwable cause) {
		super (msg, cause);
	}
}
