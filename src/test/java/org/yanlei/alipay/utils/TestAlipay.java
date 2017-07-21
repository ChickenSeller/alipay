package org.yanlei.alipay.utils;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * The type Test alipay.
 */
public class TestAlipay {
    /**
     * Sets up.
     *
     * @throws Exception the exception
     */
    @Before
    public void setUp() throws Exception{}

    /**
     * Test is valid cookie.
     *
     * @throws IllegalArgumentException  the illegal argument exception
     * @throws IllegalAccessException    the illegal access exception
     * @throws InvocationTargetException the invocation target exception
     */
    @Test
    public void testIsValidCookie() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException{
        String[] testedString = {
                "zone=RZ12A; ALIPAYJSESSIONID=RZ25hyXBU30sEgF3ThzilAuFSHPbniauthRZ12; ctoken=g_w-5TODITjHWNi9; rtk=9hyBinMBAgPqm75NNhb921S4MWfeN8vogwRWXLYFQBgJGzc4Nbg; mobileSendTime=-1; credibleMobileSendTime=-1; ctuMobileSendTime=-1; riskMobileBankSendTime=-1; riskMobileAccoutSendTime=-1; riskMobileCreditSendTime=-1; riskCredibleMobileSendTime=-1; riskOriginalAccountMobileSendTime=-1; spanner=+1J9AjQL//qbcK3AHowgXKbpW53OMLwvXt2T4qEYgj0=; cna=7Av5EZADFFYCAaMspFweHXC7; session.cookieNameId=ALIPAYJSESSIONID; _hvn_login=1",
                "_umdata=6AF5B463492A874DB7AF6805A33278748EFB1460E4160FEC32519351263BB82AABAB4E3970CEDDE1CD43AD3E795C914C723CF59CD8503F587CD52467521710E4; zone=RZ25A; ALIPAYJSESSIONID=RZ252FLj534NucYpMGU1YMTHJOzC4EauthRZ25; ctoken=EAukdpRSMh_aDcEN; spanner=0wfa1vxvds9R5j+CBqOVMZqZxN3oVGbP/lZUeqUSaVE=; rtk=RU5/uKXQ1Bn56KIwOUHQiWrdelg+sCna+z91M3lfCaGK8JxAOp+; mobileSendTime=-1; credibleMobileSendTime=-1; ctuMobileSendTime=-1; riskMobileBankSendTime=-1; riskMobileAccoutSendTime=-1; riskMobileCreditSendTime=-1; riskCredibleMobileSendTime=-1; riskOriginalAccountMobileSendTime=-1; cna=t8f3EY8xsGMCAaMspFyP5Pon",
                ""
        };
        Boolean[] testResult = {true,false,false};
        Method[] ma = Alipay.class.getDeclaredMethods();
        for(Method m :ma)
        {
            if(m.getName().equals("isValidCookie"))
            {
                m.setAccessible(true);
                Object [] prams  = {};
                for (int i = 0; i <testedString.length ; i++) {
                    Alipay alipay = new Alipay(testedString[i]);
                    Assert.assertEquals(testResult[i],(boolean)m.invoke(alipay,prams));
                }
            }
        }

    }
}
