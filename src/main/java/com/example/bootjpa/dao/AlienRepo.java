package com.example.bootjpa.dao;

import org.springframework.data.repository.CrudRepository;
import com.example.bootjpa.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer>
{
//we create some methods in this repository
//    normally we use CRUD operations but because we are using jpa we just extend this interface to another interface called CrudRepository
//   we tell this repository it is responsible to work with Alien and primary key of type integer
//    we only need to mention class name and primary key
}
