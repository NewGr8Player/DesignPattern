package com.xavier.pattern.behavioral.b5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 用户
 *
 * @author NewGr8Player
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private String name;

	public void sendMessage(String message) {
		ChatRoom.showMessage(this, message);
	}
}
