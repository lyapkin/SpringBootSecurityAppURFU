package ru.liapkin.springbootsecurityappurfu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.liapkin.springbootsecurityappurfu.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
