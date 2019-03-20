package waa.green.service;

import waa.green.model.Student;

public interface StudentService {
    Student getStudentByCode(String code);
    Student getStudentByFirstNameAndLastName(String firstName, String lastName);
}