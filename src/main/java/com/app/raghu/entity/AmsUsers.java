package com.app.raghu.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AmsUsers {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	private String username;
	private String password;
	private Boolean enabled;
	private String firstName;
	private String lastName;

	private LocalDate createdOn;
	private String createdBy;
	private LocalDate updatedOn;
	private String updatedBy;
	private Boolean pwdReset;

	@OneToMany(mappedBy = "createdBy", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	List<AmsAmc> cb;

	@OneToMany(mappedBy = "updateBy", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	List<AmsAmc> ub;

}
