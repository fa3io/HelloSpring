CREATE TABLE usuarios (
  id INTEGER IDENTITY PRIMARY KEY,
  nome VARCHAR(30),
  email  VARCHAR(50)
);

CREATE TABLE Customer (
  id INTEGER IDENTITY PRIMARY KEY,
  nome VARCHAR(30),
  email  VARCHAR(50)
);

CREATE TABLE Address (
	id INTEGER IDENTITY PRIMARY KEY,
	customer_id INTEGER,
	street VARCHAR(255),
	number VARCHAR(20),
	city VARCHAR(255),
	state VARCHAR(2),
	conuntry VARCHAR(50),
	FOREIGN KEY (customer_id) references Customer(id)
);