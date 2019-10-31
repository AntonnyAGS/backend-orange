/** 
 * Author: Antonny
 * Project: Orange
 * Date: 29/10
 */

package br.com.orange.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {
	private static final long serialVersionUID = 1L;
	
	List <FieldMessage> errors = new ArrayList<>();
	
	public ValidationError(Integer status, String msg, Long timeStamps) {
		super(status, msg, timeStamps);
	}
	
	public List<FieldMessage> getErrors(){
		return this.errors;
	}
	
	public void addError(String message, String fieldname) {
		errors.add(new FieldMessage(fieldname, message));
	}
}
