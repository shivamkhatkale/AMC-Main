package com.app.raghu.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AmsAmc {

	@Id
	private Integer amcId;

	private String amcRegId;
	private String amcName;
	private String amcRemarks;
	private String Website;
	private String addLine1;
	private String addLine2;
	private String State;
	private String City;
	private String zipCode;
	private LocalDate createdOn;

	private String createdBy;
	
	private LocalDate updatedOn;
	
	private String updateBy;
	
	transient private Boolean active;

	@OneToMany(mappedBy = "amcId", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<AmsAmcProject> createByRelation;

	@OneToMany(mappedBy = "amcId", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<AmsAmcAppraisalLoc> updateByRelation;

}
