

-- 此sql文件是用来测试在不同的 数据库（mysql oracle）支持下，针对分页操作的相关操作； 

-- mysql 数据库
CREATE TABLE MutiDatabase(
    id bigint(32),
    name varchar(50)
);

-- oracle 数据库
CREATE TABLE MutiDatabase(
    id NUMBER(32),
    name VARCHAR2(50)
);