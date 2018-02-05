PRAGMA foreign_keys = ON;
PRAGMA auto_vacuum = FULL;
CREATE TABLE REGIONS (REGION_ID NUMBER PRIMARY KEY, REGION_NAME VARCHAR2(25));
CREATE TABLE COUNTRIES (COUNTRY_ID CHAR(2) PRIMARY KEY, COUNTRY_NAME VARCHAR2(40), REGION_ID NUMBER, FOREIGN KEY (REGION_ID) REFERENCES REGIONS(REGION_ID) );
INSERT INTO REGIONS (REGION_ID,REGION_NAME) VALUES (1,'Europe');
INSERT INTO REGIONS (REGION_ID,REGION_NAME) VALUES (2,'Americas');
INSERT INTO REGIONS (REGION_ID,REGION_NAME) VALUES (3,'Asia');
INSERT INTO REGIONS (REGION_ID,REGION_NAME) VALUES (4,'Middle East and Africa');
INSERT INTO COUNTRIES (COUNTRY_ID, COUNTRY_NAME, REGION_ID) VALUES ('AD','ADFa', 1);
INSERT INTO COUNTRIES (COUNTRY_ID, COUNTRY_NAME, REGION_ID) VALUES ('DU','United States of Duke', 2);
INSERT INTO COUNTRIES (COUNTRY_ID, COUNTRY_NAME, REGION_ID) VALUES ('OR','OracleLand', 3);
INSERT INTO COUNTRIES (COUNTRY_ID, COUNTRY_NAME, REGION_ID) VALUES ('JA','Javatopia', 4);