package com.cassandra.demo.Repository;

import java.util.List;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.cassandra.demo.Model.User;


@Repository
public interface UserRepository extends CassandraRepository<User, Integer> {

	/*@AllowFiltering
	List<User> findByage(int age);*/
	@AllowFiltering
	List<User> findByAgeGreaterThan(int age);




}
