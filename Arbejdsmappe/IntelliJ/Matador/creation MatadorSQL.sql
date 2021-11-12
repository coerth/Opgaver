CREATE DATABASE IF NOT EXISTS Matador DEFAULT CHARSET = utf8mb4;
use Matador;
SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE IF EXISTS field;
DROP TABLE IF EXISTS player;
DROP TABLE IF EXISTS deed;
SET FOREIGN_KEY_CHECKS = 1;
create table Field(
	field_id tinyint primary key auto_increment, 
    field_type ENUM("Start", "Plot", "Tax", "ShippingLine", "Chance", "Visit", "Brewery", "Bonus", "Prison"),
    field_label varchar(255),
    field_cost smallint,
    field_income smallint,
    field_seriesid tinyint
);

create table Player(

player_id tinyint primary key auto_increment,
player_name varchar(255),
player_balance int
);

create table Deed(
	deed_id tinyint,
    player_id tinyint,
    field_id tinyint,
     foreign key (player_id) references Player(player_id),
     foreign key (field_id) references Field(field_id),
     CONSTRAINT ownershipID PRIMARY KEY (field_id, player_id)
    );



INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Start", "Start", 0, 0, 0);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Plot", "Rødovrevej", 1200, 50, 1);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Chance", "Prøv Lykken", 0, 0, 0);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Plot", "Hvidovrevej", 1200, 50, 1 );
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Tax", "IndkomstSkat", 0, 0, 0);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("ShippingLine", "Scandlines", 4000, 500, 2 );
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Plot", "Roskildevej", 2000, 100, 3);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Chance", "Prøv Lykken", 0, 0, 0);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Plot", "Valby Langgade", 2000, 100, 3);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Plot", "Allégade", 2400, 150, 3);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Visit", "På besøg", 0, 0, 0);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Plot", "Frederiksberg Alle", 2800, 200, 4);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Brewery", "Squash", 3000, 100, 5);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Plot", "Bülowsvej", 2800, 200, 4);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Plot", "GL.Kongevej", 3200, 250, 4);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("ShippingLine", "Mols-Linjen", 4000, 500, 2);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Plot", "Bernstorffsvej", 3600, 300, 6);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Chance", "Prøv lykken", 0, 0, 0);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Plot", "Hellerupvej", 3600, 300, 6);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Plot", "Strandvejen", 4000, 350, 6);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Bonus", "Parkering", 0, 0, 0);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Plot", "Trianglen", 4400, 350, 7);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Chance", "Prøv Lykken", 0 , 0, 0);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Plot", "Østerbrogade", 4400, 350, 7);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Plot", "Grønningen", 4800, 400, 7);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("ShippingLine", "Molslinjen A/S", 4000, 500, 2);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Plot", "Bredgade", 5200, 450, 8);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Plot", "Kgs. Nytorv", 5200, 450, 8);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Brewery", "Faxe Bryggeri", 3000, 100, 5);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Plot", "Østergade", 5600, 500, 8);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Prison", "Fængsel", 0, 0, 0);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Plot", "Amagertorv", 6000, 550, 9);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Plot", "Vimmelskaftet", 6000, 550, 9);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Chance", "Prøv Lykken", 0, 0, 0);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Plot", "Nygade", 6400, 600, 9);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("ShippingLine", "Scandlines", 4000, 500, 2);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Chance", "Prøv Lykken", 0, 0, 0);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Plot", "Frederiksberggade", 7000, 700, 10);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Tax", "Statsskat", 0, 0, 0);
INSERT INTO Field (field_type, field_label, field_cost, field_income, field_seriesid) 
VALUES ("Plot", "Rådhuspladsen", 8000, 1000, 10);

