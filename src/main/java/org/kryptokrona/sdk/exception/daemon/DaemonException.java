package org.kryptokrona.sdk.exception.daemon;

/**
 * DaemonException.java
 * <p>
 * Abstract Daemon Exception.
 *
 * @author Marcus Cvjeticanin (@mjovanc)
 */
public abstract class DaemonException extends Exception {
	public DaemonException(String errorMessage) {
		super(errorMessage);
	}
}
