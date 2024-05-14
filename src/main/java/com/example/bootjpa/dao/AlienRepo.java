package com.example.bootjpa.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.example.bootjpa.model.Alien;

import java.util.List;

public interface AlienRepo extends CrudRepository<Alien, Integer>
{
//    we want to describe a method that does not exist in the crudRepository, we wanna make ours
//    list below is just what will be given by findByTech operation
//    below is just a declaration
    List<Alien> findByTech(String tech);
    List<Alien> findByAidGreaterThan(int aid);
//    what are the protocols for this
//    1.Method name should start by findBy
//    2. method name should end with the name of the property ie tech is a property in our class
//    3. After name of property you can also follow up with what you want to do to it e.g., GreaterThan

//     we use jpql
//    to define you own queries, you need to start with the annotation @Query
//    in jpql we don't start with select only from
//    the value is coming from the user so we use ? but in jpql we also use question mark numbers eg ?1 because in a query you might have multiple question marks
//    we add order by aname because we want to sort the data by the name
    @Query("from Alien where tech=?1 order by aname")
    List<Alien> findByTechSorted(String tech);

}
