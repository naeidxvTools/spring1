package net.imwork.zhanlong.javaMail1;


import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

public class MailTest
{
    private String to;
    private String from;
    private String smtpServer; //smtp邮件服务器的地址
    private String username;
    private String password;
    private String subject;
    private String content;

    private List<String> list = new ArrayList<>();

    public void sendMail()
    {
        Properties props = System.getProperties();

        props.put("mail.smtp.host", smtpServer);
        props.put("mail.smtp.auth", true);

        Session session = Session.getDefaultInstance(props, new Authenticator()
        {
            @Override
            protected PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication(username, password);
            }
        });

        try
        {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            InternetAddress[] addresses = {new InternetAddress(to)};
            message.setRecipients(Message.RecipientType.CC, addresses);
            message.setSubject(subject);
            message.setText(content);

            Multipart mp = new MimeMultipart();
            MimeBodyPart mbp = new MimeBodyPart();
            mbp.setText(content);
            mp.addBodyPart(mbp);

            //处理附件
            for (String fileName : list)
            {
                MimeBodyPart mbpFile = new MimeBodyPart();
                FileDataSource fds = new FileDataSource(fileName);
                mbpFile.setDataHandler(new DataHandler(fds));

                mbpFile.setFileName(new File(fileName).getName());
                mp.addBodyPart(mbpFile);
            }
            message.setContent(mp);
            message.setSentDate(new Date());

            Transport.send(message);

        } catch (Exception e){e.printStackTrace();}

    }

    public static void main(String[] args)
    {
        MailTest mail = new MailTest();

        mail.setSmtpServer("smtp.163.com");
        mail.setUsername("zl20050302");
        mail.setPassword("nd20181212@1219");
        mail.setTo("120769563@qq.com");
        mail.setFrom("zl20050302@163.com");
        mail.setSubject("hello java email");
        mail.setContent("This is a test mail from zhanlong");

        mail.getList().add("C:/Users/Administrator/Desktop/船舶院教学科研会议纪要（0414）.doc");
        mail.getList().add("C:/Users/Administrator/Desktop/关于启动2020届毕业生顶岗实习工作的通知.docx");

        mail.sendMail();

    }

    public String getTo()
    {
        return to;
    }

    public void setTo(String to)
    {
        this.to = to;
    }

    public String getFrom()
    {
        return from;
    }

    public void setFrom(String from)
    {
        this.from = from;
    }

    public String getSmtpServer()
    {
        return smtpServer;
    }

    public void setSmtpServer(String smtpServer)
    {
        this.smtpServer = smtpServer;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getSubject()
    {
        return subject;
    }

    public void setSubject(String subject)
    {
        this.subject = subject;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public List<String> getList()
    {
        return list;
    }

    public void setList(List<String> list)
    {
        this.list = list;
    }




}
