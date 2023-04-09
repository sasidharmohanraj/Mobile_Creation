package com.jsp.Project;

import java.util.Scanner;

class Mobile
{
	private String name;
	private double price;
	private int ram;
	private int rom;
	private String color;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getRom() {
		return rom; 
	}
	public void setRom(int rom) {
		this.rom = rom;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Mobile(String name, double price, int ram, int rom, String color) {
		this.name = name;
		this.price = price;
		this.ram = ram;
		this.rom = rom;
		this.color = color;
	}
	public void display()
	{
		System.out.println("Mobile name: "+name);
		System.out.println("Mobile price: "+price);
		System.out.println("Mobile ram: "+ram);
		System.out.println("Mobile rom: "+rom);	
		System.out.println("Mobile color: "+color);
	}
}
public class MobileTest {
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		boolean r = true;
		Mobile m=null;
		do
		{
			System.out.println("Select any one");
			System.out.println("1.add\n2.fetch\n3.price\n4.change color\n5.Exit");
			int n=scn.nextInt();
			switch (n) {
			case 1: {
				System.out.println("Enter Mobile Name");
				String name=scn.next();
				System.out.println("Enter Mobile price");
				double price=scn.nextDouble();
				System.out.println("Enter Mobile ram");
				int ram=scn.nextInt();
				System.out.println("Enter Moile rom");
				int rom=scn.nextInt();
				System.out.println("Enter Mobile Color");
				String color=scn.next();
				m = new Mobile(name, price, ram, rom, color);
				break;
			}
			case 2:{
				if(m==null) System.out.println("No mobiles");
				else m.display();
				break;
			}
			case 3:
			{
				if(m==null) System.out.println("No price found");
				else System.out.println( m.getPrice());
				break;
			}
			case 4:
			{
				if(m==null) System.out.println("no mobiles");
				else {
					System.out.println("Old color "+m.getColor());
					System.out.println("Enter new  color: ");
					String color=scn.next();
					m.setColor(color);
					System.out.println("New color "+m.getColor());
				}
				break;
			}
			case 5:
			{
				r=false;
				System.out.println("Thanks for visiting......");
					} break;
			default:
			{
					System.out.println("please enter valid");
			}
			}
		}while(r);
		}
}
