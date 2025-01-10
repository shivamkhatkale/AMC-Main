package com.app.raghu.service;

import org.springframework.stereotype.Service;

import com.app.raghu.dto.AmsUsersDto;
import com.app.raghu.entity.AmsUsers;

@Service
public interface IService {

	public Boolean saveUser(AmsUsersDto user);

	public Boolean validateUser(String username, String password);

}
