package com.xavier.pattern.creational.c3;

import com.xavier.pattern.creational.c3.abs.AbstractBody;
import com.xavier.pattern.creational.c3.abs.AbstractWheel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.StringJoiner;

/**
 * 交通工具类
 *
 * @author NewGr8Player
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {
    /**
     * 车身
     */
    private AbstractBody body;

    /**
     * 车轮
     */
    private AbstractWheel wheel;

    @Override
    public String toString() {
        return new StringJoiner(", ", Vehicle.class.getSimpleName() + "[", "]")
                .add("body=" + body)
                .add("wheel=" + wheel)
                .toString();
    }
}
