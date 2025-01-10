package com.app.raghu.mapper;

import com.app.raghu.dto.AmsUsersDto;
import com.app.raghu.entity.AmsUsers;

public class AmsUserMapper {
	
	public static AmsUsers amsUsersDtoToEntity(  AmsUsersDto dto,AmsUsers entity) {
		
		entity.setFirstName(dto.getFirstName());
		entity.setLastName(dto.getLastName());
		entity.setUsername(dto.getUsername());
		entity.setPwd(dto.getPwd());
		entity.setPwdReset(dto.getPwdReset());
		entity.setUserId(dto.getUserId());
		
		return entity;
	}
	
	public static AmsUsersDto amsUsersEntityToDto( AmsUsers entity, AmsUsersDto dto ) {
		
		dto.setFirstName(entity.getFirstName());
		dto.setLastName(entity.getLastName());
		dto.setUsername(entity.getUsername());
		dto.setPwd(entity.getPwd());
		dto.setPwdReset(entity.getPwdReset());
		dto.setUserId(entity.getUserId());
		
		return dto;
	}

}
