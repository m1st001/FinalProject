CREATE TABLE user (
         id bigint not null auto_increment,
         username VARCHAR(24) NOT NULL ,
         password VARCHAR(24) NOT NULL ,
         role enum('CUSTOMER', 'DOCTOR') NOT NULL,
         PRIMARY KEY (id)
);

CREATE TABLE product (
        id bigint not null auto_increment,
        productname VARCHAR(24) NOT NULL ,
        price BIGINT NOT NULL ,
        recipe BOOL NOT NULL ,
        PRIMARY KEY (id)
);

CREATE TABLE recipe (
       id BIGINT NOT NULL AUTO_INCREMENT,
       user_id bigint not null,
       product_id bigint not null,
       requestdate DATE NOT NULL ,
       status BOOL NOT NULL ,
       PRIMARY KEY (id)
);