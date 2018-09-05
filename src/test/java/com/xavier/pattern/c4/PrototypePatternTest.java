package com.xavier.pattern.c4;

import com.xavier.MainTestCase;
import com.xavier.pattern.creational.c4.MailTemplate;
import com.xavier.pattern.creational.c4.abs.AbstractMailTemplate;
import org.junit.Test;

/**
 * 原型模式测试
 *
 * @author NewGr8Player
 */
public class PrototypePatternTest extends MainTestCase {

	/**
	 * 发送数量
	 */
	private static final Integer cnt = 5;

	private static final String[] reciver = {
			"001",
			"002",
			"003",
			"004",
			"005"
	};

	@Test
	public void test() {
		AbstractMailTemplate mail = new MailTemplate(
				"NewGr8Player",
				"群发邮件请勿回复",
				"尊敬的用户你好",
				"垃圾邮件，广告广告广告广告广告广告",
				"垃圾广告发送商品");

		for (int i = 0; i < cnt; i++) {
			MailTemplate mailTemplate = (MailTemplate) mail.clone();

			mailTemplate.setReceiver(reciver[i]);/* 更改收件人姓名 */

			System.out.println(mailTemplate); /* 假定输出就是发送邮件 */

		}
	}
}
