package org.yanlei.alipay.utils;

/**
 * クラスAlipay.
 */
public class Alipay {
    private String cookies;
    private String alipayPersonalPage = "https://my.alipay.com/portal/i.htm";
    private String alipayRecordPage = "https://consumeprod.alipay.com/record/advanced.htm?fundFlow=in&_input_charset=utf-8";

    /**
     * クラスAlipayからオブジェクトを作る.
     *
     * @param cookies the cookies
     */
    public Alipay(String cookies) {
        this.cookies = cookies;
    }

    /**
     * クッキーの有効性を検証する
     *
     * @return
     */

    private boolean isValidCookie(){
        if(this.cookies.contains("_hvn_login")){
            return true;
        }else {
            return false;
        }
    }
}
