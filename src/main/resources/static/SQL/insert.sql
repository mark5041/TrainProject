insert into tratta(id_tratta,nome) values(1,'ROMA-NAPOLI');
insert into tratta(id_tratta,nome) values(2,'MILANO-VENEZIA');
insert into tratta(id_tratta,nome) values(3,'VENEZIA-BOLOGNA');
insert into tratta(id_tratta,nome) values(4,'BOLOGNA-MILANO');
insert into tratta(id_tratta,nome) values(5,'NAPOLI-ROMA');

insert into treno(id_treno, stato) values ('RC101XD', 1); 
insert into treno(id_treno, stato) values ('DC737EU', 1);
insert into treno(id_treno, stato) values ('DR648TV', 0);
insert into treno(id_treno, stato) values ('MV696VM', 0); 
insert into treno(id_treno, stato) values ('TS319DD', 0);

insert into carta_fedelta(id_carta, sconto) values ('silver', 10); 
insert into carta_fedelta(id_carta, sconto) values ('gold', 20); 
insert into carta_fedelta(id_carta, sconto) values ('platinum', 30);

insert into utente(email,nome, cognome,indirizzo,data,password,enabled,role,id_Carta) values
('giovanni@gmail.com', 'giovanni', 'rossi', 'via verdi',STR_TO_DATE("19-02-1967","%e-%m-%Y"),'pass',1,'admin','silver');
insert into utente(email,nome, cognome,indirizzo,data,password,enabled,role,id_Carta) values
('alfonso@gmail.com', 'alfonso', 'neri', 'via trieste',STR_TO_DATE("13-02-1964","%e-%m-%Y"),'word',1,'admin','gold');
insert into utente(email,nome, cognome,indirizzo,data,password,enabled,role,id_Carta) values
('max@gmail.com', 'max', 'gialli', 'via arturo',STR_TO_DATE("25-04-1976","%e-%m-%Y"),'ref',1,'admin','platinum');

insert into tratta_treno(id_tratta_treno,id_tratta,id_treno, orario) values(1,5,'RC101XD',NOW());
insert into tratta_treno(id_tratta_treno,id_tratta,id_treno, orario) values(3,2,'DC737EU',NOW());

insert into posto(id_posto,id_tratta_treno,numero_posto,stato_posto,classe) values(10,3,'1A', 1, 'platinum');
insert into posto(id_posto,id_tratta_treno,numero_posto,stato_posto,classe) values(11,3,'4A', 1, 'platinum');
insert into posto(id_posto,id_tratta_treno,numero_posto,stato_posto,classe) values(12,3,'5A', 0, 'platinum');
insert into posto(id_posto,id_tratta_treno,numero_posto,stato_posto,classe) values(13,3,'1B', 1, 'gold');
insert into posto(id_posto,id_tratta_treno,numero_posto,stato_posto,classe) values(14,3,'3B', 0, 'gold');
insert into posto(id_posto,id_tratta_treno,numero_posto,stato_posto,classe) values(15,3,'7B', 1, 'gold');
insert into posto(id_posto,id_tratta_treno,numero_posto,stato_posto,classe) values(16,3,'1C', 1, 'silver');
insert into posto(id_posto,id_tratta_treno,numero_posto,stato_posto,classe) values(17,3,'5C', 1, 'silver');
insert into posto(id_posto,id_tratta_treno,numero_posto,stato_posto,classe) values(18,3,'8C', 0, 'silver');

insert into posto(id_posto,id_tratta_treno,numero_posto,stato_posto,classe) values(1,1,'1A', 1, 'platinum');
insert into posto(id_posto,id_tratta_treno,numero_posto,stato_posto,classe) values(2,1,'4A', 1, 'platinum');
insert into posto(id_posto,id_tratta_treno,numero_posto,stato_posto,classe) values(3,1,'5A', 0, 'platinum');
insert into posto(id_posto,id_tratta_treno,numero_posto,stato_posto,classe) values(4,1,'1B', 1, 'gold');
insert into posto(id_posto,id_tratta_treno,numero_posto,stato_posto,classe) values(5,1,'3B', 0, 'gold');
insert into posto(id_posto,id_tratta_treno,numero_posto,stato_posto,classe) values(6,1,'7B', 1, 'gold');
insert into posto(id_posto,id_tratta_treno,numero_posto,stato_posto,classe) values(7,1,'1C', 1, 'silver');
insert into posto(id_posto,id_tratta_treno,numero_posto,stato_posto,classe) values(8,1,'5C', 1, 'silver');
insert into posto(id_posto,id_tratta_treno,numero_posto,stato_posto,classe) values(9,1,'8C', 0, 'silver');

insert into biglietto(id_tratta_treno,id_biglietto,email,data_acquisto,prezzo,minorenne,numero_posto) values
(1,1,'max@gmail.com',STR_TO_DATE("05-02-2022","%e-%m-%Y"),37,0,'1B');
insert into biglietto(id_tratta_treno,id_biglietto,email,data_acquisto,prezzo,minorenne,numero_posto) values
(3,2,'alfonso@gmail.com',STR_TO_DATE("13-04-2022","%e-%m-%Y"),43,1,'8C');

commit