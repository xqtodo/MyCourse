package com.atguigu;

public class reflection {

	public static void main(String[] args) throws Exception{
		reflection reflect = new reflection();
		//�����Ϊÿ�����͹���һ��Ψһ�Ķ���
		System.out.println(reflect.getClass()==reflection.class); // true
		
		Class cl = Class.forName("com.atguigu.reflection"); //����������ظ���
		reflection obj = (reflection)cl.newInstance();//���ø�����޲ι�������������
		obj.setAge(10);
		obj.setName("����");
		System.out.println(obj);
		System.out.println(obj==reflect);//����ͬһ������
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
