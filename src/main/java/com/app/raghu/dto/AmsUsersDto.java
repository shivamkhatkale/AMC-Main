package com.app.raghu.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AmsUsersDto {

	private Integer userId;
	private String username;
	private String pwd;
	private Boolean enabled;
	private String firstName;
	private String lastName;
	private String createdBy;
	private String updatedBy;
	private Boolean pwdReset;
}
