package com.app.raghu.serviceImpl;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.app.raghu.dto.AmsUsersDto;
import com.app.raghu.entity.AmsUsers;
import com.app.raghu.mapper.AmsUserMapper;
import com.app.raghu.repository.AmcUsersRepository;
import com.app.raghu.service.IService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ServiceImpl implements IService {

	private AmcUsersRepository repo;

    public Boolean saveUser(AmsUsersDto userDto) {
    	
    	System.out.println("----------------------- "+userDto);
    	
    	AmsUsers user = AmsUserMapper.amsUsersDtoToEntity(userDto, new AmsUsers());
    	
    	
    	user.setCreatedOn(LocalDate.now());
    	user.setCreatedBy(user.getFirstName());
    	
        AmsUsers save = repo.save(user);
        System.out.println("Heare i am saving "+save);
        if (save!=null) {
			return true;
		}
        return false;
    }


    public Boolean validateUser(String username, String password) {

        // Query the database to find the user by username
        AmsUsers user = repo.GetValidation(username);
        if (user != null && user.getUsername().equals(username) && user.getPwd().equals(password)) {
            return true;
        } else {
            return false;
        }

    }

}
