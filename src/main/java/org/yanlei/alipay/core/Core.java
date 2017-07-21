package org.yanlei.alipay.core;

import org.yanlei.alipay.utils.Alipay;

/**
 * The type Core.
 */
public class Core {
    /**
     * 最初に呼び出されるmainメッソド
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        try {
            Alipay alipay = new Alipay("xx");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
