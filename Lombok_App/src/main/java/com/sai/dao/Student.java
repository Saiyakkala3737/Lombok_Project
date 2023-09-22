package com.sai.dao;

import lombok.Data;
import lombok.Setter;

@Data
public class Student {
	
	private Integer userId;
	private String uname;
	private String pwd;
	private String email;
	private Long phno;

}
