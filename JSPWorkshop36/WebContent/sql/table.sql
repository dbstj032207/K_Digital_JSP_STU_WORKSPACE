
drop table myproduct purge;

create table myproduct
( prodId varchar2(10) primary key,
  prodName varchar2(20) not null,
  price number(6) not null,
  quantity number(2) not null );
  
  
  insert into myproduct values ( 'P1' , '냉장고' , 1000, 1);
   insert into myproduct values ( 'P2' , 'TV' , 2000, 2);
    insert into myproduct values ( 'P3' , '세탁기' , 700, 2);
    
     insert into myproduct values ( 'P4' , '노트북' , 900, 1);
  commit;