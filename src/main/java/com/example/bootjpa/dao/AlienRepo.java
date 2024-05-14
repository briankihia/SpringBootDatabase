package com.example.bootjpa.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.example.bootjpa.model.Alien;

import java.util.List;

public interface AlienRepo extends CrudRepository<Alien, Integer>
{

}
