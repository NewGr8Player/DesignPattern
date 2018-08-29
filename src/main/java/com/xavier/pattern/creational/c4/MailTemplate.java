package com.xavier.pattern.creational.c4;

import com.xavier.pattern.creational.c4.abs.AbstractMailTemplate;
import lombok.NoArgsConstructor;

import java.util.StringJoiner;

/**
 * 邮件
 */
@NoArgsConstructor
public class MailTemplate extends AbstractMailTemplate {

    /**
     * 初始化模版内容
     *
     * @param receiver    接收人
     * @param subject     主题
     * @param appellation 称呼
     * @param content     内容
     * @param tail        署名
     */
    public MailTemplate(String receiver, String subject, String appellation, String content, String tail) {
        super(receiver, subject, appellation, content, tail);
    }

    @Override
    public MailTemplate clone() {
        return new MailTemplate(this.receiver, this.subject, this.appellation, this.content, this.tail);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", "邮件内容[", "]")
                .add("接收人(receiver):'" + receiver + "'")
                .add("主题(subject):'" + subject + "'")
                .add("称呼(appellation):'" + appellation + "'")
                .add("内容(content):'" + content + "'")
                .add("署名(tail):'" + tail + "'")
                .toString();
    }
}
