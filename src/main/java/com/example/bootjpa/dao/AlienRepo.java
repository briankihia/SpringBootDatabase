package com.example.bootjpa.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bootjpa.model.Alien;

import java.util.List;
import java.util.Optional;

public interface AlienRepo extends JpaRepository<Alien, Integer>
{

}
