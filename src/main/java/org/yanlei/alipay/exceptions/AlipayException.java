package org.yanlei.alipay.exceptions;


/**
 * 例外クラスAlipay.
 */
public class AlipayException extends Exception {
    /**
     * クラスAlipayExceptionからオブジェクトを作る.
     */
    public AlipayException(){super();}

    /**
     * クラスAlipayExceptionからオブジェクトを作る
     *
     * @param message メッセージ
     */
    public AlipayException(String message){
        super(message);
    }
}
