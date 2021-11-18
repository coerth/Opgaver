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
Teams_player1 varchar(10) not null,
Teams_player2 varchar(10) not null,
Teams_goalscore tinyint,
Teams_points tinyint,
Teams_tournamentID tinyint not null,
foreign key (Teams_tournamentID) references tournaments(Id_tournaments)
);
create table players(
Id_players tinyint primary key auto_increment,
Players_name varchar(45) not null,
Players_teamID tinyint not null,
foreign key (Players_teamID) references teams(Id_teams)

);

INSERT INTO tournaments(Tournaments_name, Tournaments_date, Tournaments_isfixed)
VALUES("LakseLigaen", "2022,12,12,12,12", true);
INSERT INTO tournaments(Tournaments_name, Tournaments_date, Tournaments_isfixed)
VALUES("FlemseLigaen", "2022,11,11,11,11", false);

INSERT INTO teams(teams_name, teams_player1, teams_player2,teams_tournamentid)
VALUES("PepsiLax01","Player1","Player2", 1);
INSERT INTO teams(teams_name, teams_player1, teams_player2,teams_tournamentid)
VALUES("PepsiLax02","Player3","Player4", 1);
INSERT INTO teams(teams_name, teams_player1, teams_player2,teams_tournamentid)
VALUES("PepsiLax03","Player5","Player6", 1);
INSERT INTO teams(teams_name, teams_player1, teams_player2,teams_tournamentid)
VALUES("PepsiLax04","Player7","Player8", 1);
INSERT INTO teams(teams_name, teams_player1, teams_player2,teams_tournamentid)
VALUES("PepsiLax05","Player9","Player10", 1);
INSERT INTO teams(teams_name, teams_player1, teams_player2,teams_tournamentid)
VALUES("PepsiLax06","Player11","Player12", 1);
INSERT INTO teams(teams_name, teams_player1, teams_player2,teams_tournamentid)
VALUES("PepsiLax07","Player13","Player14", 1);
INSERT INTO teams(teams_name, teams_player1, teams_player2,teams_tournamentid)
VALUES("PepsiLax08","Player15","Player16", 1);
INSERT INTO teams(teams_name, teams_player1, teams_player2,teams_tournamentid)
VALUES("PepsiLax09","Player17","Player18", 1);
INSERT INTO teams(teams_name, teams_player1, teams_player2,teams_tournamentid)
VALUES("PepsiLax10","Player19","Player20", 1);
INSERT INTO teams(teams_name, teams_player1, teams_player2,teams_tournamentid)
VALUES("PepsiLax11","Player21","Player22", 1);
INSERT INTO teams(teams_name, teams_player1, teams_player2,teams_tournamentid)
VALUES("PepsiLax12","Player23","Player24", 1);
INSERT INTO teams(teams_name, teams_player1, teams_player2,teams_tournamentid)
VALUES("PepsiLax13","Player25","Player26", 1);
INSERT INTO teams(teams_name, teams_player1, teams_player2,teams_tournamentid)
VALUES("PepsiLax14","Player27","Player28", 1);
INSERT INTO teams(teams_name, teams_player1, teams_player2,teams_tournamentid)
VALUES("PepsiLax15","Player29","Player30", 1);
INSERT INTO teams(teams_name, teams_player1, teams_player2,teams_tournamentid)
VALUES("PepsiLax16","Player31","Player32", 1);
INSERT INTO teams(teams_name, teams_player1, teams_player2,teams_tournamentid)
VALUES("LaxPepsi01","Player1","Player2", 2);
INSERT INTO teams(teams_name, teams_player1, teams_player2,teams_tournamentid)
VALUES("PepsiLax02","Player3","Player4", 2);
INSERT INTO teams(teams_name, teams_player1, teams_player2,teams_tournamentid)
VALUES("PepsiLax03","Player5","Player6", 2);
INSERT INTO teams(teams_name, teams_player1, teams_player2,teams_tournamentid)
VALUES("PepsiLax04","Player7","Player8", 2);
INSERT INTO teams(teams_name, teams_player1, teams_player2,teams_tournamentid)
VALUES("PepsiLax05","Player9","Player10", 2);
INSERT INTO teams(teams_name, teams_player1, teams_player2,teams_tournamentid)
VALUES("PepsiLax06","Player11","Player12", 2);
INSERT INTO teams(teams_name, teams_player1, teams_player2,teams_tournamentid)
VALUES("PepsiLax07","Player13","Player14", 2);
INSERT INTO teams(teams_name, teams_player1, teams_player2,teams_tournamentid)
VALUES("PepsiLax08","Player15","Player16", 2);
INSERT INTO teams(teams_name, teams_player1, teams_player2,teams_tournamentid)
VALUES("PepsiLax09","Player17","Player18", 2);
INSERT INTO teams(teams_name, teams_player1, teams_player2,teams_tournamentid)
VALUES("PepsiLax10","Player19","Player20", 2);
INSERT INTO teams(teams_name, teams_player1, teams_player2,teams_tournamentid)
VALUES("PepsiLax11","Player21","Player22", 2);
INSERT INTO teams(teams_name, teams_player1, teams_player2,teams_tournamentid)
VALUES("PepsiLax12","Player23","Player24", 2);
INSERT INTO teams(teams_name, teams_player1, teams_player2,teams_tournamentid)
VALUES("PepsiLax13","Player25","Player26", 2);
INSERT INTO teams(teams_name, teams_player1, teams_player2,teams_tournamentid)
VALUES("PepsiLax14","Player27","Player28", 2);
INSERT INTO teams(teams_name, teams_player1, teams_player2,teams_tournamentid)
VALUES("PepsiLax15","Player29","Player30", 2);
INSERT INTO teams(teams_name, teams_player1, teams_player2,teams_tournamentid)
VALUES("PepsiLax16","Player31","Player32", 2);


INSERT INTO players(players_name, players_teamid)
VALUES("Player1", 1);
INSERT INTO players(players_name, players_teamid)
VALUES("Player2", 1);
INSERT INTO players(players_name, players_teamid)
VALUES("Player3", 2);
INSERT INTO players(players_name, players_teamid)
VALUES("Player4", 2);
INSERT INTO players(players_name, players_teamid)
VALUES("Player5", 3);
INSERT INTO players(players_name, players_teamid)
VALUES("Player6", 3);
INSERT INTO players(players_name, players_teamid)
VALUES("Player7", 4);
INSERT INTO players(players_name, players_teamid)
VALUES("Player8", 4);
INSERT INTO players(players_name, players_teamid)
VALUES("Player9", 5);
INSERT INTO players(players_name, players_teamid)
VALUES("Player10", 5);
INSERT INTO players(players_name, players_teamid)
VALUES("Player11", 6);
INSERT INTO players(players_name, players_teamid)
VALUES("Player12", 6);
INSERT INTO players(players_name, players_teamid)
VALUES("Player13", 7);
INSERT INTO players(players_name, players_teamid)
VALUES("Player14", 7);
INSERT INTO players(players_name, players_teamid)
VALUES("Player15", 8);
INSERT INTO players(players_name, players_teamid)
VALUES("Player16", 8);
INSERT INTO players(players_name, players_teamid)
VALUES("Player17", 9);
INSERT INTO players(players_name, players_teamid)
VALUES("Player18", 9);
INSERT INTO players(players_name, players_teamid)
VALUES("Player19", 10);
INSERT INTO players(players_name, players_teamid)
VALUES("Player20", 10);
INSERT INTO players(players_name, players_teamid)
VALUES("Player21", 11);
INSERT INTO players(players_name, players_teamid)
VALUES("Player22", 11);
INSERT INTO players(players_name, players_teamid)
VALUES("Player23", 12);
INSERT INTO players(players_name, players_teamid)
VALUES("Player24", 12);
INSERT INTO players(players_name, players_teamid)
VALUES("Player25", 13);
INSERT INTO players(players_name, players_teamid)
VALUES("Player26", 13);
INSERT INTO players(players_name, players_teamid)
VALUES("Player27", 14);
INSERT INTO players(players_name, players_teamid)
VALUES("Player28", 14);
INSERT INTO players(players_name, players_teamid)
VALUES("Player29", 15);
INSERT INTO players(players_name, players_teamid)
VALUES("Player30", 15);
INSERT INTO players(players_name, players_teamid)
VALUES("Player31", 16);
INSERT INTO players(players_name, players_teamid)
VALUES("Player32", 16);

