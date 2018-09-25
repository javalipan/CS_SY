package com.manage.util;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/** 
* @ClassName: SendEmail 
* @Description: 发送邮件工具类
* @author lipan@cqrainbowsoft.com
* @date 2015-1-27 下午09:17:46 
*  
*/
public class SendEmail {

	//邮件服务器host地址
	private static final String MAIL_HOST = "smtp.163.com";
	//邮件服务器端口
	private static final int MAIL_PORT = 25;
	//发件人
	private static final String MAIL_FROM = "bassoonzuo@163.com";
	//发件人密码
	private static final String MAIL_PASS = "zuoye0130";


	/** 
	*  发送邮件
	* @param toaddress :收件人
	* @param subject :主题
	* @param content :内容	 
	*/
	public static void sendMail(String toaddress,String subject,String content) {
		try{
			Properties props = new Properties();
			props.put("mail.transport.protocol", "smtp");
			props.put("mail.smtp.auth", "true");
			Session session=Session.getDefaultInstance(props);
			session.setDebug(true);
			Transport transport = session.getTransport();
			Message msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(MAIL_FROM));
			msg.setSubject(subject);
			msg.setText(content); 
			transport.connect(MAIL_HOST, MAIL_PORT, MAIL_FROM, MAIL_PASS);
			transport.sendMessage(msg, new Address[]{new InternetAddress(toaddress)});
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/** 
	*  发送Html邮件
	* @param toaddress :收件人
	* @param subject :主题
	* @param content :内容	 
	* @return void     
	*/
	public static void sendHtmlMail(String toaddress,String subject,String content){
		try{
			System.out.println("Configuring mail session for: " + MAIL_HOST);
	        java.util.Properties props = new java.util.Properties();
	        props.setProperty("mail.smtp.auth", "true");//指定是否需要SMTP验证
	        props.setProperty("mail.smtp.host", MAIL_HOST);//指定SMTP服务器
	        props.put("mail.transport.protocol", "smtp");
	        Session mailSession = Session.getDefaultInstance(props);
	        mailSession.setDebug(true);//是否在控制台显示debug信息
	        System.out.println("Constructing message -  from=" + MAIL_FROM + "  to=" + toaddress);
	        InternetAddress fromAddress = new InternetAddress(MAIL_FROM);
	        InternetAddress toAddress = new InternetAddress(toaddress);
	        MimeMessage message = new MimeMessage(mailSession);
	        message.setFrom(fromAddress);
	        message.addRecipient(javax.mail.Message.RecipientType.TO, toAddress);
	        message.setSentDate(new java.util.Date());
	        message.setSubject(subject);
	        message.setContent(content, "text/html;charset=utf-8");
	        System.out.println("Message constructed");
	        Transport transport = mailSession.getTransport("smtp");
	        transport.connect(MAIL_HOST, MAIL_FROM, MAIL_PASS);
	        transport.sendMessage(message, message.getAllRecipients());
	        transport.close();
	        System.out.println("Message sent!");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}