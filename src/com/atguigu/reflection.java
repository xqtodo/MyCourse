package com.atguigu;

public class reflection {

	public static void main(String[] args) throws Exception{
		reflection reflect = new reflection();
		//虚拟机为每个类型管理一个唯一的对象
		System.out.println(reflect.getClass()==reflection.class); // true
		
		Class cl = Class.forName("com.atguigu.reflection"); //让虚拟机加载该类
		reflection obj = (reflection)cl.newInstance();//利用该类的无参构造器创建对象
		obj.setAge(10);
		obj.setName("大雄");
		System.out.println(obj);
		System.out.println(obj==reflect);//不是同一个对象
		System.out.println(reflect);
	}
	
	private int age;
	private String name;
	
	public void setAge(int age){
		this.age=age;
	}
	public void setName(String name){
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "reflection [age=" + age + ", name=" + name + "]";
	}

}
