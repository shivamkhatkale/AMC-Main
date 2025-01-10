package com.app.raghu.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AmsAmcProject {

	@Id
	private Integer projId;
	
	@ManyToOne
	@JoinColumn(name = "amcId")
	private AmsAmc amcId;
	
	@ManyToOne
	@JoinColumn(name = "typeId")
	private AmsPropertyType propTypeId;
	
	private String projClient;
	private String projRemarks;
	private String clientRemarks;
	private Date projStartDate;
	private Date projEndDate;
	private Double estimateValue;
	
	@ManyToOne
	@JoinColumn(name = "locId")
	private AmsAppraisalLoc locId;

}
