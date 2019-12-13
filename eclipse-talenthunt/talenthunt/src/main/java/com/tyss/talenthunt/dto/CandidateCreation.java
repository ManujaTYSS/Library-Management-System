package com.tyss.talenthunt.dto;

import java.io.File;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
@Data
@Entity
@Table(name="Candidate_creation")
public class CandidateCreation {
	@Id
	@GeneratedValue
	@Column
	private  int candidateId;
	@Column
	private String candidateName;
	@Column
	private String email;
	@Column
	private long phoneNumber;
	@Column
	private String govtId;
//	@Column
//	private File uploadResume;
	@Column
	private String relocate;
	@Column
	private String candidateType;
	@Column
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date yop;
	@Column
	private double percentage;
	@Column
	private String currentDesignation;
	@Column
	private double yoe;
	@Column
	private double noticePeriod;
	@Column
	private double currentCTC;
	@Column
	private double expectedCTC;
//	@Column
//	private String status;
}
