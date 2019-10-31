package br.com.orange.resources.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer status;
	private String msg;
	private Long timeStamps;
	
	//CONSTRUTOR
	public StandardError(Integer status, String msg, Long timeStamps) {
		super();
		this.status = status;
		this.msg = msg;
		this.timeStamps = timeStamps;
	}

	// GETTER'S AND SETTER'S
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Long getTimeStamps() {
		return timeStamps;
	}

	public void setTimeStamps(Long timeStamps) {
		this.timeStamps = timeStamps;
	}
	
	
}
