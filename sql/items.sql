-- Create table
create table items
(
  id           			INT(12) primary key,
  item_code    			VARCHAR(20),
  item_name		        VARCHAR(20),
  show_index			char(1),
  create_date  			DATE,
  done_date  			DATE,
  vaild_date  			DATE,
  expire_date  			DATE,
  state                	CHAR(1) not null,
  remarks              	VARCHAR(255)
);
