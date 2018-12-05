package com.example.demo.login.domain.model;

import java.util.Date;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class SignupForm {

	@NotBlank(message="{require_check}", groups =ValidGroup1.class)
	@Email(message="{email_check}", groups =ValidGroup2.class)
	private String userId; //ユーザーID
	
	@NotBlank(message="{require_check}", groups =ValidGroup1.class)
	@Length(min=4,max=100,message="{length_check}", groups =ValidGroup2.class)
	@Pattern(regexp="^[a-zA-Z0-9]+$", message="{pattern_check}", groups =ValidGroup3.class)
	private String password; //パスワード
	
	@NotBlank(message="{require_check}", groups =ValidGroup1.class)
	private String userName; //ユーザー名
	
	//ポイント：@DataTimeFormat
	@NotNull(message="{require_check}", groups =ValidGroup1.class)
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date birthday; //誕生日
	
	@Min(value=20, message="{min_check}", groups =ValidGroup2.class)
	@Max(value=100, message="{max_check}", groups =ValidGroup2.class)
	private int age;
	
	@AssertFalse(message="{false_check}", groups =ValidGroup2.class)
	private boolean marriage;
	
	//、ユーザIDgetter,setter
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId() {
		return userId;
	}
	//、パスワード　getter,setter
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	//、ユーザ名　getter,setter
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName() {
		return userName;
	}
	//、あ年齢　getter,setter
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Date getBirthday() {
		return birthday;
	}
	// 、結婚
	public boolean getMarriage() {
		return marriage;
	}
	public void setMarriage(boolean marriage) {
		this.marriage = marriage;
	}
}
