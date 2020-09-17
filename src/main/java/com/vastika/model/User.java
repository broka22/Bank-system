package com.vastika.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Table(name = "tbl_user")
@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String user_name;
	private String password;
	private String email;
	private long mobile_no;
	private long ssn;
	
	@OneToOne(cascade = CascadeType.ALL)
	private AccountInfo accountInfo;
	
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	@Temporal(TemporalType.DATE)
	private Date dob;

}
