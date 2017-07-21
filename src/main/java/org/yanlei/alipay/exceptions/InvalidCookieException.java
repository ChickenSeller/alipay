package org.yanlei.alipay.exceptions;

/**
 * The type Invalid cookie exception.
 */
public class InvalidCookieException extends AlipayException {
    /**
     * Instantiates a new Invalid cookie exception.
     */
    public InvalidCookieException(){}

    /**
     * Instantiates a new Invalid cookie exception.
     *
     * @param message the message
     */
    public InvalidCookieException(String message){
        super(message);
    }
}
