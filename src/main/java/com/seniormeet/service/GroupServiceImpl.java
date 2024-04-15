package com.seniormeet.service;

import com.seniormeet.model.Group;
import com.seniormeet.model.User;
import com.seniormeet.repository.GroupRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class GroupServiceImpl implements GroupService {


    private GroupRepository groupRepository;

    public GroupServiceImpl(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public Set<Group> findGroup() {
        return new HashSet<>(groupRepository.findAll());
    }

    @Override
    public Group findById(Long id) {
        return groupRepository.findById(id).orElse(null);
    }

    @Override
    public Group createGroup(Group group) {
        return groupRepository.save(group);
    }

    @Override
    public Group updateGroup(Long id, Group group) {
        Optional<Group> groupOptional = groupRepository.findById(id);
        if (groupOptional.isPresent()) {
            Group existingGroup = groupOptional.get();
            existingGroup.setTitle(group.getTitle());
            existingGroup.setDescription(group.getDescription());
            existingGroup.setRules(group.getRules());
            existingGroup.setPhotoUrl(group.getPhotoUrl());
            // Actualizar otras propiedades según sea necesario
            return groupRepository.save(existingGroup);
        }
        return null;


    }


    @Override
    public boolean deleteGroup(Long id) {
        Optional<Group> userOptional = groupRepository.findById(id);
        if (userOptional.isPresent()) {
            groupRepository.deleteById(id);
            return true;
        }
        return false;


    }
}