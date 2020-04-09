package com.example.notekept

class CourseInfo (val courseId:String, val title:String)

class NoteInfo (var courseInfo: CourseInfo, var title: String, var text:String)