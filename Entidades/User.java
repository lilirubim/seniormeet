package com.seniormeet.Entidades;

import java.util.ArrayList;
import java.util.List;

public class User {

    private Long id;

    private String firstName;
    private String lastName;

    private String email;
    private String password;
    private String phone;

    private UserRole role;

    //Many to Many
    //Alternativa: crear una entidad intermedia
    private List<Group> groups = new ArrayList<>();
}
