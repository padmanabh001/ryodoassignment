package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Classroom;
@Repository
public interface Classroomrepo extends JpaRepository<Classroom, Integer> {
    
	
	@Query(value="select * from mappingpractice.classroom  where classroomid= ?1" , nativeQuery=true)
	List<Classroom> findByClassroomId(int classRoomId);

}
