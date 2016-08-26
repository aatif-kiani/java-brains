package org.confiz.javabrains;

import java.util.*;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context = null;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("Point : " + getPointA());
		System.out.println("Point : " + getPointB());
		System.out.println("Point : " + getPointC());
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		this.context = arg0;
	}

	@Override
	public void setBeanName(String arg0) {
		System.out.println("Bean Name : " + arg0);
	}
}
