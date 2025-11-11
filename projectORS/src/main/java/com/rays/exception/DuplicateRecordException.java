package com.rays.exception;

/**
 * DuplicateRecordException thrown when a duplicate record occurred
 * @authorAvnish Upadhyay
 */
public class DuplicateRecordException extends RuntimeException {

	/**
	 * @param msg
	 *            error message
	 */
	public DuplicateRecordException(String msg) {
		super(msg);
	}

}