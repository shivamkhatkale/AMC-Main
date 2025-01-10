package com.app.raghu.entity;

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
public class AmsAmcAppraisalLoc {

	@Id
	private Integer aId;
	
	@ManyToOne
	@JoinColumn(name = "amcId")
	private AmsAmc amcId;
	
	@ManyToOne
	@JoinColumn(name = "locId")
	private AmsAppraisalLoc locId;

}
