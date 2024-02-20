package com.seniormeet.service;

import com.seniormeet.model.Group;
import com.seniormeet.repository.GroupRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {

    private GroupRepository groupRepository;

    public GroupServiceImpl(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public List<Group> findGroup() {
        return groupRepository.findAll();
    }

    @Override
    public Group findById(Long id) {
        return groupRepository.findById(id).orElse(null);
    }
}