package com.tyss.talenthunt.dto;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
@Table
public class AddRequirment {
	
	@Id
	@GenericGenerator(name = "string_based_custom_sequence", strategy = "com.tyss.talenthunt.dto.CustomIdGenerator")
	@GeneratedValue(generator = "string_based_custom_sequence")
	@Column
	private String requirmentId;
	
	@Column
	private String client;
	@Column
	private String technology;
	@Column
	private double yoe;
	@Column
	private String location;
	@Column
	private int nop;
	@Column
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date odate;
	@Column
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date cdate;
	@Column
	private String role;
	@Column
	private double rate; // salary
	@Column
	private String contact;
	@Column
	private String jd; // job description
}
