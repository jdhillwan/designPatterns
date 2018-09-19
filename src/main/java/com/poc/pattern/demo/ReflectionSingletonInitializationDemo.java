package com.poc.pattern.demo;

import java.io.Serializable;
import java.lang.reflect.Constructor;

import com.poc.pattern.creational.singleton.obj.EagerSingletonInitialization;

public class ReflectionSingletonInitializationDemo implements Serializable{

	public static void main(String[] args) {
		EagerSingletonInitialization instanceOne = EagerSingletonInitialization.getInstance();
		EagerSingletonInitialization instanceTwo = null;
		try {
			Constructor[] constructors = EagerSingletonInitialization.class.getDeclaredConstructors();
			for(Constructor obj : constructors) {
				obj.setAccessible(true);
				instanceTwo = (EagerSingletonInitialization)obj.newInstance();
				break;
			}
		}catch(Exception e) {
			
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(EagerSingletonInitialization.getInstance().hashCode());
		// Here Singleton Pattern breaks;
		System.out.println(instanceTwo.hashCode());
	}
	
	
	
}
