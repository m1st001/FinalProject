INSERT INTO users (id,username,password,role) values
  (1, 'doctor', 'doctor', 'DOCTOR'),
  (2, 'customer', 'customer', 'CUSTOMER'),
  (3, 'customer2', 'customer2', 'CUSTOMER');

INSERT INTO products (id,productname,price,recipe) values
  (1, 'Chtototamocin', 322, 0),
  (2, 'Whateverol', 70, 1),
  (3, 'Genericmedname', 144, 1),
  (4, 'Pomogaetin', 111, 0);

INSERT INTO recipes (id, username, productname, requestdate, status) values
  (1,'customer', 'Whateverol', '20210101', 0),
  (2,'customer2','Genericmedname','20210102',0);
