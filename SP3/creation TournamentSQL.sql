drop schema if exists tournament;
create schema tournament;
use tournament;
drop table if exists players;
drop table if exists teams;
drop table if exists tournaments;
create table tournaments(
Id_tournaments tinyint primary key auto_increment,
Tournaments_name varchar(45) not null,
Tournaments_date varchar(45) not null,
Tournaments_isfixed boolean not null
);
create table teams(
Id_teams tinyint primary key auto_increment,
Teams_name varchar(45) not null,
Teams_goalscore tinyint,
Teams_points tinyint,
Teams_tournamentID tinyint not null,
foreign key (Teams_tournamentID) references tournaments(Id_tournaments)
);
create table players(
Id_players tinyint primary key auto_increment,
Players_name varchar(45) not null,
Players_age tinyint,
Players_gender character,
Players_teamID tinyint not null,
foreign key (Players_teamID) references teams(Id_teams)

);