package com.java.mail;

import javax.mail.Address;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws Exception{
        Properties properties = new Properties();
        properties.setProperty("mail.transport.protocol","smtp");//使用的协议
        properties.setProperty("mail.smtp.host","smtp.qq.com");//协议地址
        properties.setProperty("mai.smtp.port","465");//端口
        properties.setProperty("mail.smtp.auth","true");//授权
        //QQ:SSL安全认证
        properties.setProperty("mail.smtp.socketfactory.class","javax.net.ssl.SSLSocketFactory");
        properties.setProperty("mail.smtp.socketfactory.fallback","false");
        properties.setProperty("mail.smtp.socketfactory.port","465");

        Session session =  Session.getInstance(properties);
       // 2595789272@qq.com
        MimeMessage message = createMimeMessage(session,"1135015668@qq.com","2595789272@qq.com","haojiawei3302@163.com","2298471769@qq.com");
        Transport transport = session.getTransport();  //建立连接对象
       // transport.connect("1135015668@qq.com","fmyedcnvsyzaidfe");
        transport.connect("1135015668@qq.com","rmlprwgbaralbadg");
        for (int i = 1; i<2;i++){
            transport.sendMessage(message,message.getAllRecipients());
        }

        session.setDebug(true);
    }
    public static MimeMessage createMimeMessage(Session session,String send,String recetve,String trecetve,String btrecetve) throws Exception {
        MimeMessage message = new MimeMessage(session);
        Address address= new InternetAddress(send,"中科软科技股份有限公司","UTF-8");
        message.setFrom(address);
        //设置标题
        message.setSubject("邮箱轰炸田长生呦呦呦","UTF-8");
        message.setContent("测试请点击<a href='https://www.baidu.com'>https://www.baidu.com</a>","text/html;charset=UTF-8");
        message.setSentDate(new Date());
        message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(recetve,"张浩洋","UTF-8"));
        //message.setRecipient(MimeMessage.RecipientType.CC, new InternetAddress(trecetve,"抄送人","UTF-8"));
       // message.setRecipient(MimeMessage.RecipientType.BCC, new InternetAddress(btrecetve,"密送人","UTF-8"));
        message.saveChanges();
        return message;
    }
}
