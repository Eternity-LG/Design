package cn.com.agree.abs.ldap;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.ldap.Control;
import javax.naming.ldap.InitialLdapContext;
import java.security.Security;
import java.util.HashSet;
import java.util.Hashtable;

/**
 * @author liugeng
 * @description TODO
 * @date 2022-06-17 14:27
 */
public class LdapTest {
    public static void main(String[] args) throws NamingException {
        HashSet<String> objects = new HashSet<>();
        objects.add("1231");
        objects.add("2244");
        DirContext dir = null;
        Security.setProperty("jdk.tls.disabledAlgorithms", "");
        System.setProperty("com.sun.jndi.ldap.object.disableEndpointIdentification","true");
        String url = "ldaps://test.metapace.top:636";
        Control[] connCtrl = null;
        Hashtable<String,String> HashEnv = new Hashtable<String,String>();

        HashEnv.put(Context.SECURITY_AUTHENTICATION, "simple"); // LDAP访问安全级别(none,simple,strong)
        HashEnv.put(Context.SECURITY_PRINCIPAL, "cn=admin,dc=code,dc=com"); //AD的用户名
        HashEnv.put(Context.SECURITY_CREDENTIALS, "123123"); //AD的密码
        HashEnv.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.ldap.LdapCtxFactory"); // LDAP工厂类
//

        HashEnv.put(Context.PROVIDER_URL, url);
        HashEnv.put(Context.SECURITY_PROTOCOL,"ssl");
//        HashEnv.put("java.naming.ldap.factory.socket", "cn.com.agree.abs.ldap.DummySSLSocketFactory");

        try {
            dir =  new InitialLdapContext(HashEnv, null);//new InitialDirContext(HashEnv);// 初始化上下文
        } catch (NamingException e) {
            e.printStackTrace();
            System.out.println(e.getMessage()+e);
            return;
        }
        assert dir != null;
        Attributes attributes = dir.getAttributes("dc=code,dc=com");
        NamingEnumeration<String> iDs = attributes.getIDs();
        for (;iDs.hasMore();){
            System.out.println(attributes.get(iDs.next()).toString());
        }
        System.out.println("结果");
    }
}
