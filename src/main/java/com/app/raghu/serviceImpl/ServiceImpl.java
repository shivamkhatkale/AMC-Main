package com.app.raghu.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.raghu.entity.AmsUsers;
import com.app.raghu.repository.AmcUsersRepository;
import com.app.raghu.service.IService;

@Service
public class ServiceImpl implements IService {

	@Autowired
	private AmcUsersRepository repo;

	public void saveUser(AmsUsers user) {
		 repo.save(user);
	}

}
