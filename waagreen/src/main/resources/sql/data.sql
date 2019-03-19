INSERT INTO role(role) VALUES('ADMIN');

INSERT INTO attendance_type(type) VALUES('Morning meditation');
INSERT INTO attendance_type(type) VALUES('TM Checking');
INSERT INTO attendance_type(type) VALUES('Retreat');
INSERT INTO attendance_type(type) VALUES('DC Lecture');

INSERT INTO location(location_name,short_name) VALUES('Golden dom',"GD");
INSERT INTO location(location_name,short_name) VALUES('Argiro Dalby Hall',"DB");

INSERT INTO WEEK_SESSION (session_type,days) VALUES('4 weeks', 22);
INSERT INTO WEEK_SESSION (session_type,days) VALUES('2 weeks', 10);

INSERT INTO FACULTY (NAME) VALUES('Tina');
INSERT INTO FACULTY (NAME) VALUES('Oscar');
INSERT INTO FACULTY (NAME) VALUES('Isabella');
INSERT INTO FACULTY (NAME) VALUES('Grace');
INSERT INTO FACULTY (NAME) VALUES('Lily');
INSERT INTO FACULTY (NAME) VALUES('George');
INSERT INTO FACULTY (NAME) VALUES('Science Faculty');
INSERT INTO FACULTY (NAME) VALUES('Mohanraj');
INSERT INTO FACULTY (NAME) VALUES('Guthrie');
INSERT INTO FACULTY (NAME) VALUES('Bagnola');
INSERT INTO FACULTY (NAME) VALUES('Lester');
INSERT INTO FACULTY (NAME) VALUES('Shulmier');
INSERT INTO FACULTY (NAME) VALUES('Xing');
INSERT INTO FACULTY (NAME) VALUES('Saad');
INSERT INTO FACULTY (NAME) VALUES('Hanhong Lu');

INSERT INTO COURSE (COURSE_ID, COURSE_NAME, COURSE_CREDIT, FACULTY_ID)VALUES('CS401','Modern Programming Practices',0,1);
INSERT INTO COURSE (COURSE_ID, COURSE_NAME, COURSE_CREDIT, FACULTY_ID)VALUES('CS525','Advanced Software Development',0,2);
INSERT INTO COURSE (COURSE_ID, COURSE_NAME, COURSE_CREDIT, FACULTY_ID)VALUES('CS435','Algorithms',0,3);
INSERT INTO COURSE (COURSE_ID, COURSE_NAME, COURSE_CREDIT, FACULTY_ID)VALUES('FOR506B','STC Pt2 Leadership for Tech Managers',0,4);
INSERT INTO COURSE (COURSE_ID, COURSE_NAME, COURSE_CREDIT, FACULTY_ID)VALUES('CS472','Web Programming',0,5);
INSERT INTO COURSE (COURSE_ID, COURSE_NAME, COURSE_CREDIT, FACULTY_ID)VALUES('MGT5341','Career Strategies for Information Technology',0,6);
INSERT INTO COURSE (COURSE_ID, COURSE_NAME, COURSE_CREDIT, FACULTY_ID)VALUES('CS545','Web Application Architecture',0,7);
INSERT INTO COURSE (COURSE_ID, COURSE_NAME, COURSE_CREDIT, FACULTY_ID)VALUES('CS572','Modern Web Applications',0,8);
INSERT INTO COURSE (COURSE_ID, COURSE_NAME, COURSE_CREDIT, FACULTY_ID)VALUES('CS390','Fundamental Programming Practices',0,9);
INSERT INTO COURSE (COURSE_ID, COURSE_NAME, COURSE_CREDIT, FACULTY_ID)VALUES('CS471','Parallel Programming',0,10);
INSERT INTO COURSE (COURSE_ID, COURSE_NAME, COURSE_CREDIT, FACULTY_ID)VALUES('CS488','Big Data Analytics',0,11);
INSERT INTO COURSE (COURSE_ID, COURSE_NAME, COURSE_CREDIT, FACULTY_ID)VALUES('CS544','Enterprise Architecture',0,12);
INSERT INTO COURSE (COURSE_ID, COURSE_NAME, COURSE_CREDIT, FACULTY_ID)VALUES('CS422','Database Management Systems',0,13);
INSERT INTO COURSE (COURSE_ID, COURSE_NAME, COURSE_CREDIT, FACULTY_ID)VALUES('CS582','Machine Learning',0,14);
INSERT INTO COURSE (COURSE_ID, COURSE_NAME, COURSE_CREDIT, FACULTY_ID)VALUES('FOR506A','STC Pt1',0,15);

INSERT INTO BLOCK (YEAR_OF_ENTRY, START_DATE, END_DATE, NUMBER_OF_BLOCK) VALUES('2018-08-09 00:00:00.00', '2018-08-09 00:00:00.00', '2018-09-09 00:00:00.00', 1);
INSERT INTO BLOCK (YEAR_OF_ENTRY, START_DATE, END_DATE, NUMBER_OF_BLOCK) VALUES('2018-08-09 00:00:00.00', '2018-09-10 00:00:00.00', '2018-10-10 00:00:00.00', 2);
INSERT INTO BLOCK (YEAR_OF_ENTRY, START_DATE, END_DATE, NUMBER_OF_BLOCK) VALUES('2018-08-09 00:00:00.00', '2018-10-11 00:00:00.00', '2018-11-11 00:00:00.00', 3);
INSERT INTO BLOCK (YEAR_OF_ENTRY, START_DATE, END_DATE, NUMBER_OF_BLOCK) VALUES('2018-08-09 00:00:00.00', '2018-11-12 00:00:00.00', '2018-12-12 00:00:00.00', 4);
INSERT INTO BLOCK (YEAR_OF_ENTRY, START_DATE, END_DATE, NUMBER_OF_BLOCK) VALUES('2018-08-09 00:00:00.00', '2018-12-13 00:00:00.00', '2018-01-13 00:00:00.00', 5);
INSERT INTO BLOCK (YEAR_OF_ENTRY, START_DATE, END_DATE, NUMBER_OF_BLOCK) VALUES('2018-08-09 00:00:00.00', '2018-01-14 00:00:00.00', '2018-02-14 00:00:00.00', 6);
INSERT INTO BLOCK (YEAR_OF_ENTRY, START_DATE, END_DATE, NUMBER_OF_BLOCK) VALUES('2018-08-09 00:00:00.00', '2018-02-15 00:00:00.00', '2018-03-15 00:00:00.00', 7);
INSERT INTO BLOCK (YEAR_OF_ENTRY, START_DATE, END_DATE, NUMBER_OF_BLOCK) VALUES('2018-08-09 00:00:00.00', '2018-03-16 00:00:00.00', '2018-04-16 00:00:00.00', 8);

INSERT INTO BLOCK_SESSION (BLOCK_ID, SESSION_ID) VALUES(1, 2);
INSERT INTO BLOCK_SESSION (BLOCK_ID, SESSION_ID) VALUES(2, 1);
INSERT INTO BLOCK_SESSION (BLOCK_ID, SESSION_ID) VALUES(3, 1);
INSERT INTO BLOCK_SESSION (BLOCK_ID, SESSION_ID) VALUES(4, 1);
INSERT INTO BLOCK_SESSION (BLOCK_ID, SESSION_ID) VALUES(5, 1);
INSERT INTO BLOCK_SESSION (BLOCK_ID, SESSION_ID) VALUES(6, 2);
INSERT INTO BLOCK_SESSION (BLOCK_ID, SESSION_ID) VALUES(7, 1);
INSERT INTO BLOCK_SESSION (BLOCK_ID, SESSION_ID) VALUES(8, 1);