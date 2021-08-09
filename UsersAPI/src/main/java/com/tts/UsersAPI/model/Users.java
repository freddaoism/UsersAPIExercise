package com.tts.UsersAPI.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Repository


public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public int Id;
    public String firstName;
    public String lastName;
    public String state;
}


