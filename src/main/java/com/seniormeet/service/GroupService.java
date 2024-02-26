package com.seniormeet.service;

import com.seniormeet.model.Group;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GroupService {

    //Interface
    List<Group> findGroup();

    Group findById(Long id);

    Group save(Group group);

    Group updateGroup(Long id, Group group);

    boolean deleteGroup(Long id);

}
