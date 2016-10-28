package com.atguigu.mybatis;

public class Student {
	
	private int id;
	private String lastName;
	private int age;
	private String job;

	public Student() {
	}

	public Student(int id, String lastName, int age,String job) {
		super();
		this.id = id;
		this.lastName = lastName;
                this.job=job;
		this.age = age;


	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

        public String getJob(){
                return job;
        }
         
        public void SetJob(String job){
                this.job=job;
        }
       
	@Override
	public String toString() {
		return "Student [id=" + id + ", lastName=" + lastName + ", age=" + age
				+ "]";
	}
	
	
	
}
