CREATE TABLE users (
         id bigint not null auto_increment,
         username VARCHAR(24) NOT NULL ,
         password VARCHAR(24) NOT NULL ,
         role enum('CUSTOMER', 'DOCTOR') NOT NULL,
         PRIMARY KEY (id)
);

CREATE TABLE products (
        id bigint not null auto_increment,
        productname VARCHAR(24) NOT NULL ,
        price BIGINT NOT NULL ,
        recipe BOOL NOT NULL ,
        PRIMARY KEY (id)
);

CREATE TABLE recipes (
       id BIGINT NOT NULL AUTO_INCREMENT,
       username VARCHAR(24) NOT NULL ,
       productname VARCHAR(24) NOT NULL ,
       requestdate DATE NOT NULL ,
       status BOOL NOT NULL ,
       PRIMARY KEY (id)
);