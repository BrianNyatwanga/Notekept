package com.example.notekept

class DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
    }

    private fun initializeCourses() {
        var course = CourseInfo ("Android_Intents", "Android Programming with intent")
        courses.set(course.courseId, course)

        course = CourseInfo(courseId = "android_async", title = "Android Assync Programming and Services")
        courses.set(course.courseId, course)

        course = CourseInfo( title = "Java Fundamentals: Java Language",courseId = "java_lang")
        courses.set(course.courseId, course)

        course = CourseInfo(courseId = "java_core", title = "Java Fundamentals: The Core Platform")
        courses.set(course.courseId, course)
    }
}