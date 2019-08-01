package com.neu.entity;

public class Profile {
	private Integer profileSeq;
	private Integer id;
	private String name;
	private String birthday;
	private String gender;
	private String career;
	private String address;
	private Long mobile;
	@Override
	public String toString() {
		return "Profile [profileSeq=" + profileSeq + ", id=" + id + ", name=" + name + ", birthday=" + birthday
				+ ", gender=" + gender + ", career=" + career + ", address=" + address + ", mobile=" + mobile + "]";
	}
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Profile(Integer id, String name, String birthday, String gender, String career,
			String address, Long mobile) {
		super();
	
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.career = career;
		this.address = address;
		this.mobile = mobile;
	}
	public Integer getProfileSeq() {
		return profileSeq;
	}
	public void setProfileSeq(Integer profileSeq) {
		this.profileSeq = profileSeq;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCareer() {
		return career;
	}
	public void setCareer(String career) {
		this.career = career;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
}
