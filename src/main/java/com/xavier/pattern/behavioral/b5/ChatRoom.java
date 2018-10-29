package com.xavier.pattern.behavioral.b5;

import org.apache.tools.ant.util.DateUtils;

import java.util.Date;

/**
 * 聊天室
 *
 * @author NewGr8Player
 */
public class ChatRoom {

	/**
	 * 显示消息
	 *
	 * @param user
	 * @param message
	 */
	public static void showMessage(User user, String message) {
		System.out.println(
				user.getName() + " " + DateUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss") + " " + ":\n\t" + message);
	}
}
