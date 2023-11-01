package ru.liapkin.springbootsecurityappurfu.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.liapkin.springbootsecurityappurfu.entity.Student;
import ru.liapkin.springbootsecurityappurfu.repository.StudentRepository;

import java.util.Optional;

@Slf4j
@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/list")
    public ModelAndView getAllStudents() {
        log.info("/students/list -> connection");
        ModelAndView mav = new ModelAndView("list-students");
        mav.addObject("students", studentRepository.findAll());
        return mav;
    }

    @GetMapping("/addForm")
    public ModelAndView addStudentForm() {
        ModelAndView mav = new ModelAndView("add-student-form");
        Student student = new Student();
        mav.addObject("student", student);
        return mav;
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student student) {
        studentRepository.save(student);
        return "redirect:/students/list";
    }

    @GetMapping("/showUpdateForm")
    public ModelAndView showUpdateForm(@RequestParam Long studentId) {
        ModelAndView mav = new ModelAndView("add-student-form");
        Optional<Student> optionalStudent = studentRepository.findById(studentId);
        Student student = new Student();
        if (optionalStudent.isPresent()) {
            student = optionalStudent.get();
        }
        mav.addObject("student", student);
        return mav;
    }

    @GetMapping("/delete")
    public String deleteStudent(@RequestParam Long studentId) {
        studentRepository.deleteById(studentId);
        return "redirect:/students/list";
    }
}
