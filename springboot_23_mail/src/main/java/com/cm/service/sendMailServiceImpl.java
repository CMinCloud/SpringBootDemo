package com.cm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class sendMailServiceImpl implements SendMailService {


    @Resource
    private JavaMailSender javaMailSender;

    //发送人
    private String from = "cm_403630@163.com";
//    接收人   可以自己发送给自己
    private String to = "1255696617@qq.com";

//    标题
    private String subject = "测试邮件";

//    正文

    private String context = "测试邮件正文内容";

//    正文部分
    private String text = "<a href='https://www.itcast.cn/'>传智教育</a>";

    @Override
    public void sendMail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from+"(cm)");   //替代发送人信息
        message.setTo(to);
        message.setSubject(subject);
        message.setText(context);
        javaMailSender.send(message);
    }

//    多部件消息
    public void sendMulticomponentMail(){
        try {
            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper messageHelper = new MimeMessageHelper(message,true);
            messageHelper.setFrom(from);
            messageHelper.setTo(to);
            messageHelper.setSubject(subject);
            messageHelper.setText(text,true);     // true开启html解析

//            注意还是发送MimeMessage对象
            javaMailSender.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }
}
