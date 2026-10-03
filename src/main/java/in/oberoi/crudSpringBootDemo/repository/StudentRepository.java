package in.oberoi.crudSpringBootDemo.repository;

import in.oberoi.crudSpringBootDemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Scanner;

//@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
