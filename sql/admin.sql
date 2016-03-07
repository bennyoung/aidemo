-- Create table
create table admin
(
  id           			int(12) primary key,
  username 	    		VARCHAR(200),
  password		        VARCHAR(200),           
  create_date  			DATE,
  done_date  			DATE,
  vaild_date  			DATE,
  expire_date  			DATE,
  state                	CHAR(1) not null,
  remarks              	VARCHAR(255)
);
