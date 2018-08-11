package com.xavier.principle.p3.impl;

import com.xavier.principle.p3.abs.Driver;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 人
 * <br />
 * 实现了
 * <ul>
 * <li>驾驶员接口 {@link com.xavier.principle.p3.abs.Driver}</li>
 * </ul>
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Human implements Driver {

	private String name;
}
