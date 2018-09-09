package com.xavier.pattern.creational.c5.w3;

import lombok.*;

/**
 * 使用Lombok注解实现
 * (当使用Builder注解时候类中必须包含有全参构造器)
 *
 * @author NewGr8Player
 */
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CarWithAnnotationBuilder {
    private int wheels;
    private String color;
}
