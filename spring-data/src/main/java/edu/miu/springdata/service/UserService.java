package edu.miu.springdata.service;

import edu.miu.springdata.DTO.UserDto;
import edu.miu.springdata.entity.unidirectional.User;

import java.util.List;

public interface UserService {
    void save(UserDto p);
    void deleteById(int id);
    UserDto getById(int id);
    List<UserDto> getAll();
}
