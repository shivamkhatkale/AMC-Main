package com.app.raghu.entity;

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
public class AmsAppraisalLoc {

	@Id
	private Integer locId;
	private String state;
	private String city;

	@OneToMany(mappedBy = "locId", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	List<AmsAmcProject> AAP;

	@OneToMany(mappedBy = "locId", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	List<AmsAmcAppraisalLoc> AAL;

}
