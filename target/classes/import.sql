

insert into car(CAR_NAME,car_type,car_brand,production_year,color,engine_capacity,mileage,engine_power,price_by_day) VALUES ('TOYOTA YARIS','HATCHBACK','TOYOTA','2017','SILVER',1.4,20400,90,220);

insert into car(CAR_NAME,car_type,car_brand,production_year,color,engine_capacity,mileage,engine_power,price_by_day) VALUES ('FORD FIESTA','HATCHBACK','FORD','2014','SILVER',1.5,42300,75,200);

insert into car(CAR_NAME,car_type,car_brand,production_year,color,engine_capacity,mileage,engine_power,price_by_day) VALUES ('SEAT LEON','HATCHBACK','SEAT','2015','BLACK',2.0,32400,120,240);

insert into car(CAR_NAME,car_type,car_brand,production_year,color,engine_capacity,mileage,engine_power,price_by_day) VALUES ('VOLKSWAGEN PASSAT','SEDAN','VOLKSWAGEN','2015','BLACK',2.0,32400,150,220);

insert into car(CAR_NAME,car_type,car_brand,production_year,color,engine_capacity,mileage,engine_power,price_by_day) VALUES ('VOLVO V40','COMBI','VOLVO','2004','BLUE',2.0,132400,160,420);

insert into car(CAR_NAME,car_type,car_brand,production_year,color,engine_capacity,mileage,engine_power,price_by_day) VALUES ('AUDI A6','SEDAN','AUDI','2015','SILVER',2.0,92358,190,500);

insert into car(CAR_NAME,car_type,car_brand,production_year,color,engine_capacity,mileage,engine_power,price_by_day) VALUES ('RENAULT TRAFFIC','VAN','RENAULT','2016','GREY',1.6,43299,140,300);

insert into division(city,street_address,phone_number,email_address) values ('POZNAN','CHABROWA 3','21345672','POZNAN@RENTAL.PL');
insert into division(city,street_address,phone_number,email_address) values('WROCLAW','MYSIA 1','71345672','WROCLAW@RENTAL.PL');
insert into division(city,street_address,phone_number,email_address) values ('KRAKOW','WISLANA 51','42532621','KRAKOW@RENTAL.PL');

insert into WORKERS(position_name,name,surname,age,division_id) values ('Salesman','DANUTA','CZOP',47,3);
insert into WORKERS(position_name,name,surname,age,division_id) values ('Director','JOZEF','KOWALSKI',57,3);
insert into WORKERS(position_name,name,surname,age,division_id) values ('Accountant','RENATA','WISNIEWSKA',39,3);

insert into WORKERS(position_name,name,surname,age,division_id) values ('Salesman','WOJCIECH','WITEK',29,2);
insert into WORKERS(position_name,name,surname,age,division_id) values ('Accountant','KAMIL','WILCZEK',42,2);
insert into WORKERS(position_name,name,surname,age,division_id) values ('Director','RENATA','MAZUT',49,2);

insert into WORKERS(position_name,name,surname,age,division_id) values ('Director','RYSZARD','WODNIK',54,1);
insert into WORKERS(position_name,name,surname,age,division_id) values ('Salesman','WERONIKA','KLONOWICZ',31,1);
insert into WORKERS(position_name,name,surname,age,division_id) values ('Accountant','ZDZISLAWA','KONIOWSKA',51,1);

insert into client(name,surname,date_of_birth,city,street_address,credit_card_number,email_address) values ('Marian','Pudzianowski','1959-12-23','Warszawa','Wolska 12/2','1234121213134343','marian.pudzianowski@wp.pl');

insert into client(name,surname,date_of_birth,city,street_address,credit_card_number,email_address) values ('Witold','Puszkin','1969-02-13','Poznan','Kolista 16/7','9729008006240820','witold.puszkin@poczta.interia.pl');

insert into client(name,surname,date_of_birth,city,street_address,credit_card_number,email_address) values ('Katarzyna','Figura','1964-11-20','Poznan','Zimna 12','5583411427138849','katarzyna.figura@gmail.com');

insert into client(name,surname,date_of_birth,city,street_address,credit_card_number,email_address) values ('Marcin','Stankiewicz','1978-04-03','Wroclaw','Wojenna 213','6234141213738373','marcin.stankiewicz@gmail.com');

insert into client(name,surname,date_of_birth,city,street_address,credit_card_number,email_address) values ('Adam','Bodnar','1981-01-23','Olawa','Blizniacza 12','3766639495056039','adam.bodnar@wp.pl');

insert into client(name,surname,date_of_birth,city,street_address,credit_card_number,email_address) values ('Patryk','Wojna','1991-01-23','Wisla','Kolumnowa 123/33','6033331291736272','patryk.wojna@buziaczek.pl');

insert into client(name,surname,date_of_birth,city,street_address,credit_card_number,email_address) values ('Jolanta','Kwasniewska','1951-07-14','Warszawa','Nasturcjowa 22','3162379798041340','slodkajola@gmail.com');

insert into client(name,surname,date_of_birth,city,street_address,credit_card_number,email_address) values ('Boguslawa','Wanders','1959-10-12','Wroclaw','Kolejowa 18/27','2402329038855372','bogusia_wanders@poczta.interia.pl');

insert into client(name,surname,date_of_birth,city,street_address,credit_card_number,email_address) values ('Jan','Kowalski','1979-10-22','Krakow','Zamkowa 18/12','4589721024582516','poprostujanek@gmail.com');

insert into client(name,surname,date_of_birth,city,street_address,credit_card_number,email_address) values ('Zofia','Nowak','1989-03-12','Zakopane','Goralska 28','6524163832574980','zofia.nowak@capgemini.com');

insert into car_workers(cars_id,workers_id) values (6,9);
insert into car_workers(cars_id,workers_id) values (2,1);
insert into car_workers(cars_id,workers_id) values (2,2);
insert into car_workers(cars_id,workers_id) values (7,3);
insert into car_workers(cars_id,workers_id) values (3,4);
insert into car_workers(cars_id,workers_id) values (3,5);
insert into car_workers(cars_id,workers_id) values (1,5);
insert into car_workers(cars_id,workers_id) values (4,6);
insert into car_workers(cars_id,workers_id) values (4,7);
insert into car_workers(cars_id,workers_id) values (5,8);
insert into car_workers(cars_id,workers_id) values (5,8);

insert into rent_details(CLIENT_ID,CAR_ID,rental_date,return_date,place_of_rent,place_of_return) values (1,6,'2017-10-12','2017-10-14',2,3);
insert into rent_details(CLIENT_ID,CAR_ID,rental_date,return_date,place_of_rent,place_of_return) values (2,6,'2017-10-08','2017-10-09',2,1);
insert into rent_details(CLIENT_ID,CAR_ID,rental_date,return_date,place_of_rent,place_of_return) values (3,3,'2017-09-12','2017-09-19',1,3);
insert into rent_details(CLIENT_ID,CAR_ID,rental_date,return_date,place_of_rent,place_of_return) values (4,2,'2017-09-17','2017-09-25',1,1);
insert into rent_details(CLIENT_ID,CAR_ID,rental_date,return_date,place_of_rent,place_of_return) values (5,7,'2017-10-17','2017-10-22',2,2);
insert into rent_details(CLIENT_ID,CAR_ID,rental_date,return_date,place_of_rent,place_of_return) values (6,7,'2017-09-17','2017-09-21',2,3);
insert into rent_details(CLIENT_ID,CAR_ID,rental_date,return_date,place_of_rent,place_of_return) values (7,3,'2017-10-24','2017-10-27',2,1);
insert into rent_details(CLIENT_ID,CAR_ID,rental_date,return_date,place_of_rent,place_of_return) values (8,3,'2017-10-13','2017-10-14',2,2);
insert into rent_details(CLIENT_ID,CAR_ID,rental_date,return_date,place_of_rent,place_of_return) values (9,1,'2017-10-12','2017-10-15',3,3);
insert into rent_details(CLIENT_ID,CAR_ID,rental_date,return_date,place_of_rent,place_of_return) values (10,4,'2017-09-22','2017-09-25',3,1);
insert into rent_details(CLIENT_ID,CAR_ID,rental_date,return_date,place_of_rent,place_of_return) values (2,6,'2017-10-02','2017-10-04',3,2);
insert into rent_details(CLIENT_ID,CAR_ID,rental_date,return_date,place_of_rent,place_of_return) values (2,5,'2017-10-12','2017-10-16',3,1);
insert into rent_details(CLIENT_ID,CAR_ID,rental_date,return_date,place_of_rent,place_of_return) values (3,5,'2017-10-11','2017-10-16',3,3);
insert into rent_details(CLIENT_ID,CAR_ID,rental_date,return_date,place_of_rent,place_of_return) values (5,7,'2017-09-23','2017-09-28',3,3);
insert into rent_details(CLIENT_ID,CAR_ID,rental_date,return_date,place_of_rent,place_of_return) values (6,1,'2017-09-23','2017-09-27',2,2);
insert into rent_details(CLIENT_ID,CAR_ID,rental_date,return_date,place_of_rent,place_of_return) values (7,1,'2017-09-29','2017-10-01',2,1);
insert into rent_details(CLIENT_ID,CAR_ID,rental_date,return_date,place_of_rent,place_of_return) values (8,4,'2017-09-29','2017-10-04',1,1);
insert into rent_details(CLIENT_ID,CAR_ID,rental_date,return_date,place_of_rent,place_of_return) values (7,3,'2017-10-29','2017-10-29',2,3);