package com.example.restservice;

public class PatientInfo {
	
	
	public String PatientId;
	public int Age;
	public int Sex;
	public String getPatientId() {
		return PatientId;
	}
	public void setPatientId(String patientId) {
		PatientId = patientId;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public int getSex() {
		return Sex;
	}
	public void setSex(int sex) {
		Sex = sex;
	}
	public String getSmoke() {
		return Smoke;
	}
	public void setSmoke(String smoke) {
		Smoke = smoke;
	}
	public String Smoke;

}
