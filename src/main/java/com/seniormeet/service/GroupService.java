package com.seniormeet.service;

import com.seniormeet.model.Group;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public interface GroupService {

    //Interface
    Set<Group> findGroup();

    Group findById(Long id);

    Group createGroup(Group group);

    Group updateGroup(Long id, Group group);

    boolean deleteGroup(Long id);

}
