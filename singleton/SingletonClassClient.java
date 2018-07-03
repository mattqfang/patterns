package com.optum.cs.training.patterns.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class SingletonClassClient {

	public static void main(String[] args) {
		compareTwoInstances();
		System.out.println("------------------------------------");
		reflection();
		System.out.println("------------------------------------");
		serialization();
	}
	
	private static void compareTwoInstances() {
		SingletonClass object1 = SingletonClass.getInstance();
		SingletonClass object2 = SingletonClass.getInstance();
		
		System.out.println(object1);
		System.out.println(object2);
		System.out.println(object1==object2);
	}
	
	private static void reflection() {
		SingletonClass object1 = SingletonClass.getInstance();
		SingletonClass object2 = null;
		
		try {
			Constructor[] constructors = SingletonClass.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				constructor.setAccessible(true);
				object2 = (SingletonClass) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(object1);
		System.out.println(object2);
		System.out.println(object1==object2);
	}
	
	private static void serialization() {
		SingletonClass object1 = SingletonClass.getInstance();
		SingletonClass object2 = null;
		
		try {
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("dummy.ser"));
			out.writeObject(object1);
			out.close();
			
			ObjectInput in = new ObjectInputStream(new FileInputStream("dummy.ser"));
			object2 = (SingletonClass) in.readObject();
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(object1);
		System.out.println(object2);
		System.out.println(object1==object2);
	}
}
