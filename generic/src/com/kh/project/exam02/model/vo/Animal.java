package com.kh.project.exam02.model.vo;

public class Animal <T>{
	private T hp;
	public Animal() {}
	public Animal(T hp) {
		this.hp = hp;
	}
	public void move() {
		System.out.println("¿Ãµø«‘");
	}
}
