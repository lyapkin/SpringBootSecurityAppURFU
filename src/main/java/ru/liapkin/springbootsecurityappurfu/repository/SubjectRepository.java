package ru.liapkin.springbootsecurityappurfu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.liapkin.springbootsecurityappurfu.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
