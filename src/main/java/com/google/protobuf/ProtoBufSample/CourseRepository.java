package com.google.protobuf.ProtoBufSample;

import java.util.Map;

import com.google.protobuf.ProtoBufSample.BaeldungTraining.Course;
public class CourseRepository {

    private final Map<Integer, Course> courses;

    public CourseRepository(Map<Integer, Course> courses) {
        this.courses = courses;
    }

    public Course getCourse(int id) {
        return courses.get(id);
    }
}
