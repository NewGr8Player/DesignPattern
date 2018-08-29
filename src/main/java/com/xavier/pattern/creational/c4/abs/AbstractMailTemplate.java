package com.xavier.pattern.creational.c4.abs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 邮件原型
 *
 * @author NewGr8Player
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractMailTemplate implements Cloneable {

    /**
     * 收件人
     */
    protected String receiver;

    /**
     * 邮件名称
     */
    protected String subject;

    /**
     * 称谓
     */
    protected String appellation;

    /**
     * 邮件内容
     */
    protected String content;

    /**
     * 邮件尾
     */
    protected String tail;

    /**
     * 模版复制方法
     *
     * @return
     */
    public abstract AbstractMailTemplate clone();
}