INSERT INTO role(role) VALUES('ADMIN');
INSERT INTO role(role) VALUES('FACULTY');
INSERT INTO role(role) VALUES('STUDENT');

INSERT INTO attendance_type(type) VALUES('Morning meditation');
INSERT INTO attendance_type(type) VALUES('TM Checking');
INSERT INTO attendance_type(type) VALUES('Retreat');
INSERT INTO attendance_type(type) VALUES('DC Lecture');

INSERT INTO location(location_name,short_name) VALUES('Golden dom','GD');
INSERT INTO location(location_name,short_name) VALUES('Argiro Dalby Hall','DB');

INSERT INTO WEEK_SESSION (session_type,days) VALUES('4 weeks', 22);
INSERT INTO WEEK_SESSION (session_type,days) VALUES('2 weeks', 10);

INSERT INTO ENTRY (MONTH_YEAR) VALUES ('Feb 2018');
INSERT INTO ENTRY (MONTH_YEAR) VALUES ('Apr 2018');
INSERT INTO ENTRY (MONTH_YEAR) VALUES ('May 2018');
INSERT INTO ENTRY (MONTH_YEAR) VALUES ('Aug 2018');

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


INSERT INTO BLOCK (YEAR_OF_ENTRY, START_DATE, END_DATE, NUMBER_OF_BLOCK, SESSION_ID, CANCELED_DAYS) VALUES('2018-08-09 00:00:00.00', '2018-01-14 00:00:00.00', '2018-02-14 00:00:00.00', 'January 2018',2,0);
INSERT INTO BLOCK (YEAR_OF_ENTRY, START_DATE, END_DATE, NUMBER_OF_BLOCK, SESSION_ID, CANCELED_DAYS) VALUES('2018-08-09 00:00:00.00', '2018-02-15 00:00:00.00', '2018-03-15 00:00:00.00', 'February 2018',1,0);
INSERT INTO BLOCK (YEAR_OF_ENTRY, START_DATE, END_DATE, NUMBER_OF_BLOCK, SESSION_ID, CANCELED_DAYS) VALUES('2018-08-09 00:00:00.00', '2018-03-16 00:00:00.00', '2018-04-16 00:00:00.00', 'March 2018',1,3);
INSERT INTO BLOCK (YEAR_OF_ENTRY, START_DATE, END_DATE, NUMBER_OF_BLOCK, SESSION_ID, CANCELED_DAYS) VALUES('2018-08-09 00:00:00.00', '2018-04-17 00:00:00.00', '2018-05-16 00:00:00.00', 'April 2018',2,0);
INSERT INTO BLOCK (YEAR_OF_ENTRY, START_DATE, END_DATE, NUMBER_OF_BLOCK, SESSION_ID, CANCELED_DAYS) VALUES('2018-08-09 00:00:00.00', '2018-05-17 00:00:00.00', '2018-06-07 00:00:00.00', 'May 2018',1,1);
INSERT INTO BLOCK (YEAR_OF_ENTRY, START_DATE, END_DATE, NUMBER_OF_BLOCK, SESSION_ID, CANCELED_DAYS) VALUES('2018-08-09 00:00:00.00', '2018-06-08 00:00:00.00', '2018-07-08 00:00:00.00', 'June 2018',1,2);
INSERT INTO BLOCK (YEAR_OF_ENTRY, START_DATE, END_DATE, NUMBER_OF_BLOCK, SESSION_ID, CANCELED_DAYS) VALUES('2018-08-09 00:00:00.00', '2018-07-09 00:00:00.00', '2018-08-09 00:00:00.00', 'July 2018',1,0);
INSERT INTO BLOCK (YEAR_OF_ENTRY, START_DATE, END_DATE, NUMBER_OF_BLOCK, SESSION_ID, CANCELED_DAYS) VALUES('2018-08-09 00:00:00.00', '2018-08-10 00:00:00.00', '2018-09-07 00:00:00.00', 'August 2018',1,1);
INSERT INTO BLOCK (YEAR_OF_ENTRY, START_DATE, END_DATE, NUMBER_OF_BLOCK, SESSION_ID, CANCELED_DAYS) VALUES('2018-08-09 00:00:00.00', '2018-09-08 00:00:00.00', '2018-10-09 00:00:00.00', 'September 2018',2,0);
INSERT INTO BLOCK (YEAR_OF_ENTRY, START_DATE, END_DATE, NUMBER_OF_BLOCK, SESSION_ID, CANCELED_DAYS) VALUES('2018-08-09 00:00:00.00', '2018-10-11 00:00:00.00', '2018-11-12 00:00:00.00', 'October 2018',1,0);
INSERT INTO BLOCK (YEAR_OF_ENTRY, START_DATE, END_DATE, NUMBER_OF_BLOCK, SESSION_ID, CANCELED_DAYS) VALUES('2018-08-09 00:00:00.00', '2018-11-13 00:00:00.00', '2018-12-14 00:00:00.00', 'November 2018',1,3);
INSERT INTO BLOCK (YEAR_OF_ENTRY, START_DATE, END_DATE, NUMBER_OF_BLOCK, SESSION_ID, CANCELED_DAYS) VALUES('2018-08-09 00:00:00.00', '2018-12-15 00:00:00.00', '2019-01-08 00:00:00.00', 'December 2018',1,3);
INSERT INTO BLOCK (YEAR_OF_ENTRY, START_DATE, END_DATE, NUMBER_OF_BLOCK, SESSION_ID, CANCELED_DAYS) VALUES('2018-08-09 00:00:00.00', '2019-01-14 00:00:00.00', '2019-02-14 00:00:00.00', 'January 2019',2,0);
INSERT INTO BLOCK (YEAR_OF_ENTRY, START_DATE, END_DATE, NUMBER_OF_BLOCK, SESSION_ID, CANCELED_DAYS) VALUES('2018-08-09 00:00:00.00', '2019-02-15 00:00:00.00', '2019-03-15 00:00:00.00', 'February 2019',1,0);
INSERT INTO BLOCK (YEAR_OF_ENTRY, START_DATE, END_DATE, NUMBER_OF_BLOCK, SESSION_ID, CANCELED_DAYS) VALUES('2018-08-09 00:00:00.00', '2019-03-16 00:00:00.00', '2019-04-16 00:00:00.00', 'March 2019',1,3);
INSERT INTO BLOCK (YEAR_OF_ENTRY, START_DATE, END_DATE, NUMBER_OF_BLOCK, SESSION_ID, CANCELED_DAYS) VALUES('2018-08-09 00:00:00.00', '2019-04-17 00:00:00.00', '2019-05-16 00:00:00.00', 'April 2019',2,0);
INSERT INTO BLOCK (YEAR_OF_ENTRY, START_DATE, END_DATE, NUMBER_OF_BLOCK, SESSION_ID, CANCELED_DAYS) VALUES('2018-08-09 00:00:00.00', '2019-05-17 00:00:00.00', '2019-06-16 00:00:00.00', 'May 2019',2,0);
INSERT INTO BLOCK (YEAR_OF_ENTRY, START_DATE, END_DATE, NUMBER_OF_BLOCK, SESSION_ID, CANCELED_DAYS) VALUES('2018-08-09 00:00:00.00', '2019-06-17 00:00:00.00', '2019-07-16 00:00:00.00', 'June 2019',2,0);


INSERT INTO COURSE_BLOCK(ID, BLOCK_ID) VALUES(1,1);
INSERT INTO COURSE_BLOCK(ID, BLOCK_ID) VALUES(2,5);
INSERT INTO COURSE_BLOCK(ID, BLOCK_ID) VALUES(3,3);
INSERT INTO COURSE_BLOCK(ID, BLOCK_ID) VALUES(4,2);
INSERT INTO COURSE_BLOCK(ID, BLOCK_ID) VALUES(5,5);
INSERT INTO COURSE_BLOCK(ID, BLOCK_ID) VALUES(6,5);
INSERT INTO COURSE_BLOCK(ID, BLOCK_ID) VALUES(7,5);
INSERT INTO COURSE_BLOCK(ID, BLOCK_ID) VALUES(8,2);
INSERT INTO COURSE_BLOCK(ID, BLOCK_ID) VALUES(9,1);
INSERT INTO COURSE_BLOCK(ID, BLOCK_ID) VALUES(10,8);
INSERT INTO COURSE_BLOCK(ID, BLOCK_ID) VALUES(11,7);
INSERT INTO COURSE_BLOCK(ID, BLOCK_ID) VALUES(12,7);
INSERT INTO COURSE_BLOCK(ID, BLOCK_ID) VALUES(13,4);
INSERT INTO COURSE_BLOCK(ID, BLOCK_ID) VALUES(14,6);
INSERT INTO COURSE_BLOCK(ID, BLOCK_ID) VALUES(15,5);