package com.xavier.pattern.creational.c5.w2;

import lombok.*;

/**
 * 小汽车类
 * 使用静态内部类实现
 *
 * @author NewGr8Player
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CarWithInnerBuilder {
    private int wheels;
    private String color;

    /**
     * 以下为内部类Builder实现
     */
    private CarWithInnerBuilder(Builder builder) {
        setWheels(builder.wheels);
        setColor(builder.color);
    }

    public static Builder newBuilder() {
        return new Builder();
    }


    /**
     * {@code CarWithInnerBuilder} builder static inner class.
     */
    public static final class Builder {
        private int wheels;
        private String color;

        private Builder() {
        }

        /**
         * Sets the {@code wheels} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param val the {@code wheels} to set
         * @return a reference to this Builder
         */
        public Builder wheels(int val) {
            wheels = val;
            return this;
        }

        /**
         * Sets the {@code color} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param val the {@code color} to set
         * @return a reference to this Builder
         */
        public Builder color(String val) {
            color = val;
            return this;
        }

        /**
         * Returns a {@code CarWithInnerBuilder} built from the parameters previously set.
         *
         * @return a {@code CarWithInnerBuilder} built with parameters of this {@code CarWithInnerBuilder.Builder}
         */
        public CarWithInnerBuilder build() {
            return new CarWithInnerBuilder(this);
        }
    }
}