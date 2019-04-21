DROP DATABASE IF EXISTS mybatisTest;
CREATE DATABASE mybatisTest;

USE mybatisTest;

CREATE TABLE user(
	id int(32) PRIMARY KEY AUTO_INCREMENT,
	username varchar(64) UNIQUE,
	password varchar(64),
	category varchar(16)
);

INSERT INTO user VALUES('1','hrxiong', '123', 'type1');
INSERT INTO user VALUES('2','xrnie', '123', 'type2');
INSERT INTO user VALUES('3','xwang', '123', 'type3');