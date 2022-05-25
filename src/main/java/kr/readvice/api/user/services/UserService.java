package kr.readvice.api.user.services;

import  kr.readvice.api.user.domains.User;
import kr.readvice.api.user.domains.UserDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;


import java.util.List;
import java.util.Optional;


public interface UserService {

    UserDTO login(User user);

    List<User> findAll();
    List<User> findAll(Sort sort);
    Page<User> findAll(Pageable pageable);

    long count();

    String put(User user);

    String delete(User user);

    String save(User user);

    Optional<User> findById(String userid);

    boolean existsById(String userid);

    //custom

    List<User> findByName(String name);
}