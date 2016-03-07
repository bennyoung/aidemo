-- Create table
create table news
(
  id           			INT(12) primary key,
  news_title    		VARCHAR(200),
  news_content          VARCHAR(2000),
  items_id				INT(12),
  writer				VARCHAR(20),
  commend				CHAR(1),
  clicked				INT(5),
  image_url			    VARCHAR(400),            
  create_date  			DATE,
  done_date  			DATE,
  vaild_date  			DATE,
  expire_date  			DATE,
  state                	CHAR(1) not null,
  remarks              	VARCHAR(255)
);

create index IDX_NEWS on news (items_id);
