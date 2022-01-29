drop schema if exists dnd;
CREATE DATABASE dnd DEFAULT CHARSET = utf8mb4;
use dnd;
SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE IF EXISTS loottable;
DROP TABLE IF EXISTS category;
DROP TABLE IF EXISTS entrytable;
SET FOREIGN_KEY_CHECKS = 1;

create table category(
	category_id int PRIMARY KEY AUTO_INCREMENT,
	category_name varchar(255) not null,
    INDEX  (category_id ASC) VISIBLE
    );

create table loottable(
	loottable_id int auto_increment,
	loottable_name varchar(255) not null,
    category_id int,
    loottable_weighted boolean not null,
	foreign key (category_id) references category(category_id),
    CONSTRAINT	combined_id PRIMARY KEY (loottable_id, category_id),
    INDEX  (loottable_id ASC) VISIBLE
     
    );
    
create table entrytable(
	entrytable_id int auto_increment,
    entrytable_text varchar(512) not null,
    entrytable_rollvalue int,
    loottable_id int,
    foreign key (loottable_id) references loottable(loottable_id),
    CONSTRAINT	combined_id PRIMARY KEY (entrytable_id, loottable_id),
    INDEX (entrytable_id ASC) VISIBLE
);

INSERT INTO category(category_name)
VALUES("Loot");
INSERT INTO category(category_name)
VALUES("Encounter");

INSERT INTO loottable(loottable_name, loottable_weighted, category_id)
VALUES("10 gp Gemstones", False, 1);

INSERT INTO entrytable(entrytable_text, loottable_id)
VALUES("Azurite (opaque mottled deep blue)", 1);
INSERT INTO entrytable(entrytable_text, loottable_id)
VALUES("Banded agate (translucent striped brown, blue, white, or red)", 1);
INSERT INTO entrytable(entrytable_text, loottable_id)
VALUES("Blue quartz (transparent pale blue)", 1);
INSERT INTO entrytable(entrytable_text, loottable_id)
VALUES("Eye agate (translucent circles of gray, white, brown, blue, or green)", 1);
INSERT INTO entrytable(entrytable_text, loottable_id)
VALUES("Hematite (opaque gray-black)", 1);
INSERT INTO entrytable(entrytable_text, loottable_id)
VALUES("Lapis lazuli (opaque light and dark blue with yellow flecks)", 1);
INSERT INTO entrytable(entrytable_text, loottable_id)
VALUES("Malachite (opaque striated light and dark green)", 1);
INSERT INTO entrytable(entrytable_text, loottable_id)
VALUES("Moss agate (translucent pink or yellow-white with mossy gray or green markings)", 1);
INSERT INTO entrytable(entrytable_text, loottable_id)
VALUES("Obsidian (opaque black)", 1);
INSERT INTO entrytable(entrytable_text, loottable_id)
VALUES("Rhodochrosite (opaque light pink)", 1);
INSERT INTO entrytable(entrytable_text, loottable_id)
VALUES("Tiger eye (translucent brown with golden center)", 1);
INSERT INTO entrytable(entrytable_text, loottable_id)
VALUES("Turquoise (opaque light blue-green)", 1);

INSERT INTO loottable(loottable_name, loottable_weighted, category_id)
VALUES("25 gp Art Object", False, 1);

INSERT INTO entrytable(entrytable_text, loottable_id)
VALUES("Silver ewer", 2);
INSERT INTO entrytable(entrytable_text, loottable_id)
VALUES("Carved bone statuette", 2);
INSERT INTO entrytable(entrytable_text, loottable_id)
VALUES("Small gold bracelet", 2);
INSERT INTO entrytable(entrytable_text, loottable_id)
VALUES("Cloth-of-gold vestments", 2);
INSERT INTO entrytable(entrytable_text, loottable_id)
VALUES("Black velvet mask stitched with silver thread", 2);
INSERT INTO entrytable(entrytable_text, loottable_id)
VALUES("Copper chalice with silver filigree", 2);
INSERT INTO entrytable(entrytable_text, loottable_id)
VALUES("Pair of engraved bone dice", 2);
INSERT INTO entrytable(entrytable_text, loottable_id)
VALUES("Small mirror set in a painted wooden frame", 2);
INSERT INTO entrytable(entrytable_text, loottable_id)
VALUES("Embroidered silk handkerchief", 2);
INSERT INTO entrytable(entrytable_text, loottable_id)
VALUES("Gold locket with a painted portrait inside", 2);

INSERT INTO loottable(loottable_name, loottable_weighted, category_id)
VALUES("Individual Treasure: Challenge 0-4", TRUE, 1);

INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("CP: 5d6 (17)", 30, 3);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("SP: 4d6 (14)", 60, 3);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("EP: 3d6 (10)", 70, 3);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("GP: 3d6 (10)", 95, 3);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("PP: 1d6 (3)", 100, 3);

INSERT INTO loottable(loottable_name, loottable_weighted, category_id)
VALUES("Individual Treasure: Challenge 5-10", TRUE, 1);

INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("CP: 4d6 × 100 (1,400), EP: 1d6 × 10 (35)", 30, 4);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("SP: 6d6 × 10 (210), GP: 2d6 × 10 (70)", 60, 4);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("EP: 3d6 × 10 (105), GP: 2d6 × 10 (70)", 70, 4);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("GP: 4d6 × 10 (140)", 95, 4);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("GP: 2d6 × 10 (70), PP: 3d6 (10)", 100, 4);

INSERT INTO loottable(loottable_name, loottable_weighted, category_id)
VALUES("Individual Treasure: Challenge 11-16", TRUE, 1);

INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("SP: 4d6 × 100 (1,400), GP: 1d6 × 100 (350)", 20, 5);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("EP: 1d6 × 100 (350), GP: 1d6 × 100 (350)", 35, 5);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("GP: 2d6 × 100 (700), PP: 1d6 × 10 (35)", 75, 5);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("GP: 2d6 × 100 (700), PP: 2d6 × 10 (70)", 100, 5);


INSERT INTO loottable(loottable_name, loottable_weighted, category_id)
VALUES("Individual Treasure: Challenge 17+", TRUE, 1);

INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("EP: 2d6 × 1,000 (7,000), GP: 8d6 × 100 (2,800)", 15, 6);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("GP: 1d6 × 1,000 (3,500), PP: 1d6 × 100 (350)", 55, 6);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("GP: 1d6 × 1,000 (3,500), PP: 2d6 × 100 (700)", 100, 6);

INSERT INTO loottable(loottable_name, loottable_weighted, category_id)
VALUES("Magic Item Table A", TRUE, 1);

INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Potion of healing", 50, 7);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Spell scroll (cantrip)", 60, 7);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Potion of climbing", 70, 7);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Spell scroll (1st level)", 90, 7);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Spell scroll (2nd level)", 94, 7);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Potion of healing (greater)", 98, 7);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Bag of holding", 99, 7);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Driftglobe", 100, 7);

INSERT INTO loottable(loottable_name, loottable_weighted, category_id)
VALUES("Magic Item Table B", TRUE, 1);

INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Potion of healing (greater)", 15, 8);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Potion of fire breath", 22, 8);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Potion of resistance", 29, 8);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Ammunition, +1", 34, 8);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Potion of animal friendship", 39, 8);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Potion of hill giant strength", 44, 8);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Potion of growth", 49, 8);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Potion of water breathing", 54, 8);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Spell scroll (2nd level)", 59, 8);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Spell scroll (3rd level)", 64, 8);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Bag of holding", 67, 8);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Keoghtom’s ointment", 70, 8);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Oil of slipperiness", 73, 8);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Dust of disappearance", 75, 8);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Dust of dryness", 77, 8);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Dust of sneezing and choking", 79, 8);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Elemental gem", 81, 8);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Philter of love", 83, 8);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Alchemy jug", 84, 8);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Cap of water breathing", 85, 8);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Cloak of the manta ray", 86, 8);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Driftglobe", 87, 8);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Goggles of night", 88, 8);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Helm of comprehending languages", 89, 8);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Immovable rod", 90, 8);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Lantern of revealing", 91, 8);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Mariner’s armor", 92, 8);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Mithral armor", 93, 8);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Potion of poison", 94, 8);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Ring of swimming", 95, 8);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Robe of useful items", 96, 8);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Rope of climbing", 97, 8);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Saddle of the cavalier", 98, 8);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Wand of magic detection", 99, 8);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id)
VALUES("Wand of secrets", 100, 8);

INSERT INTO loottable(loottable_name, loottable_weighted, category_id) VALUES("Magic Item Table C", true, 1);

INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Potion of healing (superior)", 15, 9);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Spell scroll (4th level)", 22, 9);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ammunition", 27, 9);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Potion of clairvoyance", 32, 9);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Potion of diminution", 37, 9);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Potion of gaseous form", 42, 9);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Potion of frost giant strength", 47, 9);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Potion of stone giant strength", 52, 9);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Potion of heroism", 57, 9);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Potion of invulnerability", 62, 9);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Potion of mind reading", 67, 9);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Spell scroll (5th level)", 72, 9);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Elixir of health", 75, 9);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Oil of etherealness", 78, 9);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Potion of fire giant strength", 81, 9);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Quaal’s feather token", 84, 9);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Scroll of protection", 87, 9);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Bag of beans", 89, 9);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Bead of force", 91, 9);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Chime of opening", 92, 9);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Decanter of endless water", 93, 9);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Eyes of minute seeing", 94, 9);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Folding boat", 95, 9);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Heward’s handy haversack", 96, 9);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Horseshoes of speed", 97, 9);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Necklace of fireballs", 98, 9);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Periapt of health", 99, 9);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Sending stones", 100, 9);

INSERT INTO loottable(loottable_name, loottable_weighted, category_id) VALUES("Magic Item Table D", true, 1);

INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Potion of healing (supreme)", 20, 10);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Potion of invisibility", 30, 10);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Potion of speed", 40, 10);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Spell scroll (6th level)", 50, 10);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Spell scroll (7th level)", 57, 10);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ammunition", 62, 10);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Oil of sharpness", 67, 10);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Potion of flying", 72, 10);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Potion of cloud giant strength", 77, 10);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Potion of longevity", 82, 10);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Potion of vitality", 87, 10);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Spell scroll (8th level)", 92, 10);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Horseshoes of a zephyr", 95, 10);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Nolzur’s marvelous pigments", 98, 10);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Bag of devouring", 99, 10);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Portable hole", 100, 10);

INSERT INTO loottable(loottable_name, loottable_weighted, category_id) VALUES("Magic Item Table E", true, 1);

INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Spell scroll (8th level)", 30, 11);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Potion of storm giant strength", 55, 11);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Potion of healing (supreme)", 70, 11);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Spell scroll (9th level)", 85, 11);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Universal solvent", 93, 11);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Arrow of slaying", 98, 11);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Sovereign glue", 100, 11);

INSERT INTO loottable(loottable_name, loottable_weighted, category_id) VALUES("Magic Item Table F", true, 1);

INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Weapon", 15, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Shield", 18, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Sentinel shield", 21, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Amulet of proof against detection and location", 23, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Boots of elvenkind", 25, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Boots of striding and springing", 27, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Bracers of archery", 29, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Brooch of shielding", 31, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Broom of flying", 33, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Cloak of elvenkind", 35, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Cloak of protection", 37, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Gauntlets of ogre power", 39, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Hat of disguise", 41, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Javelin of lightning", 43, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Pearl of power", 45, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Rod of the pact keeper", 47, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Slippers of spider climbing", 49, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Staff of the adder", 51, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Staff of the python", 53, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Sword of vengeance", 55, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Trident of fish command", 57, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Wand of magic missiles", 59, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Wand of the war mage", 61, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Wand of web", 63, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Weapon of warning", 65, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Adamantine armor (chain mail)", 66, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Adamantine armor (chain shirt)", 67, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Adamantine armor (scale mail)", 68, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Bag of tricks (gray)", 69, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Bag of tricks (rust)", 70, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Bag of tricks (tan)", 71, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Boots of the winterlands", 72, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Circlet of blasting", 73, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Deck of illusions", 74, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Eversmoking bottle", 75, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Eyes of charming", 76, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Eyes of the eagle", 77, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Figurine of wondrous power (silver raven)", 78, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Gem of brightness", 79, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Gloves of missile snaring", 80, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Gloves of swimming and climbing", 81, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Gloves of thievery", 82, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Headband of intellect", 83, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Helm of telepathy", 84, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Instrument of the bards (Doss lute)", 85, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Instrument of the bards (Fochlucan bandore)", 86, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Instrument of the bards (Mac-Fuimidh cittern)", 87, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Medallion of thoughts", 88, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Necklace of adaptation", 89, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Periapt of wound closure", 90, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Pipes of haunting", 91, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Pipes of the sewers", 92, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ring of jumping", 93, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ring of mind shielding", 94, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ring of warmth", 95, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ring of water walking", 96, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Quiver of Ehlonna", 97, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Stone of good luck (luckstone)", 98, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Wind fan", 99, 12);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Winged boots", 100, 12);

INSERT INTO loottable(loottable_name, loottable_weighted, category_id) VALUES("Magic Item Table G", true, 1);

INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Weapon", 11, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Figurine of wondrous power (roll d8) \n 1: Figurine of wondrous power (Bronze griffon) \n 2: Figurine of wondrous power (Ebony fly) \n 3: Figurine of wondrous power (Golden lions) \n 4: Figurine of wondrous power (Ivory goats) \n 5: Figurine of wondrous power (Marble elephant) \n 6–7: Figurine of wondrous power (Onyx dog) \n 8: Figurine of wondrous power (Serpentine owl)", 14, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Adamantine armor (breastplate)", 15, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Adamantine armor (splint)", 16, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Amulet of health", 17, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Armor of vulnerability", 18, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Arrow-catching shield", 19, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Belt of dwarvenkind", 20, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Belt of hill giant strength", 21, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Berserker axe", 22, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Boots of levitation", 23, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Boots of speed", 24, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Bowl of commanding water elementals", 25, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Bracers of defense", 26, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Brazier of commanding fire elementals", 27, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Cape of the mountebank", 28, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Censer of controlling air elementals", 29, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Armor", 30, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Armor of resistance (chain mail)", 31, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Armor", 32, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Armor of resistance (chain shirt)", 33, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Cloak of displacement", 34, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Cloak of the bat", 35, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Cube of force", 36, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Daern’s instant fortress", 37, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Dagger of venom", 38, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Dimensional shackles", 39, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Dragon slayer", 40, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Elven chain", 41, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Flame tongue", 42, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Gem of seeing", 43, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Giant slayer", 44, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Glamoured studded leather", 45, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Helm of teleportation", 46, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Horn of blasting", 47, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Horn of Valhalla (silver or brass)", 48, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Instrument of the bards (Canaith mandolin)", 49, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Instrument of the bards (Cli lyre)", 50, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ioun stone (awareness)", 51, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ioun stone (protection)", 52, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ioun stone (reserve)", 53, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ioun stone (sustenance)", 54, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Iron bands of Bilarro", 55, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Armor", 56, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Armor of resistance (leather)", 57, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Mace of disruption", 58, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Mace of smiting", 59, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Mace of terror", 60, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Mantle of spell resistance", 61, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Necklace of prayer beads", 62, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Periapt of proof against poison", 63, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ring of animal influence", 64, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ring of evasion", 65, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ring of feather falling", 66, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ring of free action", 67, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ring of protection", 68, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ring of resistance", 69, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ring of spell storing", 70, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ring of the ram", 71, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ring of X-ray vision", 72, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Robe of eyes", 73, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Rod of rulership", 74, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Rod of the pact keeper", 75, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Rope of entanglement", 76, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Armor", 77, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Armor of resistance (scale mail)", 78, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Shield", 79, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Shield of missile attraction", 80, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Staff of charming", 81, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Staff of healing", 82, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Staff of swarming insects", 83, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Staff of the woodlands", 84, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Staff of withering", 85, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Stone of controlling earth elementals", 86, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Sun blade", 87, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Sword of life stealing", 88, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Sword of wounding", 89, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Tentacle rod", 90, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Vicious weapon", 91, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Wand of binding", 92, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Wand of enemy detection", 93, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Wand of fear", 94, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Wand of fireballs", 95, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Wand of lightning bolts", 96, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Wand of paralysis", 97, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Wand of the war mage", 98, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Wand of wonder", 99, 13);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Wings of flying", 100, 13);

INSERT INTO loottable(loottable_name, loottable_weighted, category_id) VALUES("Magic Item Table H", true, 1);

INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Weapon", 10, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Amulet of the planes", 12, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Carpet of flying", 14, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Crystal ball (very rare version)", 16, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ring of regeneration", 18, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ring of shooting stars", 20, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ring of telekinesis", 22, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Robe of scintillating colors", 24, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Robe of stars", 26, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Rod of absorption", 28, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Rod of alertness", 30, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Rod of security", 32, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Rod of the pact keeper", 34, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Scimitar of speed", 36, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Shield", 38, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Staff of fire", 40, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Staff of frost", 42, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Staff of power", 44, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Staff of striking", 46, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Staff of thunder and lightning", 48, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Sword of sharpness", 50, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Wand of polymorph", 52, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Wand of the war mage", 54, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Adamantine armor (half plate)", 55, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Adamantine armor (plate)", 56, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Animated shield", 57, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Belt of fire giant strength", 58, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Belt of frost giant strength (or stone)", 59, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Armor", 60, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Armor of resistance (breastplate)", 61, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Candle of invocation", 62, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Armor", 63, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Armor", 64, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Cloak of arachnida", 65, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Dancing sword", 66, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Demon armor", 67, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Dragon scale mail", 68, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Dwarven plate", 69, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Dwarven thrower", 70, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Efreeti bottle", 71, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Figurine of wondrous power (obsidian steed)", 72, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Frost brand", 73, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Helm of brilliance", 74, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Horn of Valhalla (bronze)", 75, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Instrument of the bards (Anstruth harp)", 76, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ioun stone (absorption)", 77, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ioun stone (agility)", 78, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ioun stone (fortitude)", 79, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ioun stone (insight)", 80, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ioun stone (intellect)", 81, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ioun stone (leadership)", 82, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ioun stone (strength)", 83, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Armor", 84, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Manual of bodily health", 85, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Manual of gainful exercise", 86, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Manual of golems", 87, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Manual of quickness of action", 88, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Mirror of life trapping", 89, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Nine lives stealer", 90, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Oathbow", 91, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Armor", 92, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Spellguard shield", 93, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Armor", 94, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Armor of resistance (splint)", 95, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Armor", 96, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Armor of resistance (studded leather)", 97, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Tome of clear thought", 98, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Tome of leadership and influence", 99, 14);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Tome of understanding", 100, 14);

INSERT INTO loottable(loottable_name, loottable_weighted, category_id) VALUES("Magic Item Table I", true, 1);

INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Defender", 5, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Hammer of thunderbolts", 10, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Luck blade", 15, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Sword of answering", 20, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Holy avenger", 23, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ring of djinni summoning", 26, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ring of invisibility", 29, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ring of spell turning", 32, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Rod of lordly might", 35, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Staff of the magi", 38, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Vorpal sword", 41, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Belt of cloud giant strength", 43, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Armor", 45, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Armor", 47, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Armor", 49, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Cloak of invisibility", 51, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Crystal ball (legendary version)", 53, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Armor", 55, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Iron flask", 57, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Armor", 59, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Armor", 61, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Robe of the archmagi", 63, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Rod of resurrection", 65, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Armor", 67, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Scarab of protection", 69, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Armor", 71, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Armor", 73, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Well of many worlds", 75, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Magic armor (roll d12) \n 1–2: Armor +2 half plate \n 3–4: Armor +2 plate \n 5–6: Armor +3 studded leather \n 7–8: Armor +3 breastplate \n 9–10: Armor +3 splint \n 11: Armor +3 half plate \n 12: Armor +3 plate", 76, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Apparatus of Kwalish", 77, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Armor of invulnerability", 78, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Belt of storm giant strength", 79, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Cubic gate", 80, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Deck of many things", 81, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Efreeti chain", 82, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Armor of resistance (half plate)", 83, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Horn of Valhalla (iron)", 84, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Instrument of the bards (Ollamh harp)", 85, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ioun stone (greater absorption)", 86, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ioun stone (mastery)", 87, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ioun stone (regeneration)", 88, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Plate armor of etherealness", 89, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Armor of resistance (plate)", 90, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ring of air elemental command", 91, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ring of earth elemental command", 92, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ring of fire elemental command", 93, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ring of three wishes", 94, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Ring of water elemental command", 95, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Sphere of annihilation", 96, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Talisman of pure good", 97, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Talisman of the sphere", 98, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Talisman of ultimate evil", 99, 15);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Tome of the stilled tongue", 100, 15);

INSERT INTO loottable(loottable_name, loottable_weighted, category_id) VALUES("50 gp Gemstones", false, 1);

INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Bloodstone (opaque dark gray with red flecks)", 16);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Carnelian (opaque orange to red-brown)", 16);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Chalcedony (opaque white)", 16);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Chrysoprase (translucent green)", 16);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Citrine (transparent pale yellow-brown)", 16);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Jasper (opaque blue, black, or brown)", 16);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Moonstone (translucent white with pale blue glow)", 16);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Onyx (opaque bands of black and white, or pure black or white)", 16);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Quartz (transparent white, smoky gray, or yellow)", 16);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Sardonyx (opaque bands of red and white)", 16);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Star rose quartz (translucent rosy stone with white star-shaped center)", 16);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Zircon (transparent pale blue-green)", 16);

INSERT INTO loottable(loottable_name, loottable_weighted, category_id) VALUES("100 gp Gemstones", false, 1);

INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Amber (transparent watery gold to rich gold)", 17);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Amethyst (transparent deep purple)", 17);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Chrysoberyl (transparent yellow-green to pale green)", 17);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Coral (opaque crimson)", 17);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Garnet (transparent red, brown-green, or violet)", 17);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Jade (translucent light green, deep green, or white)", 17);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Jet (opaque deep black)", 17);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Pearl (opaque lustrous white, yellow, or pink)", 17);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Spinel (transparent red, red-brown, or deep green)", 17);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Tourmaline (transparent pale green, blue, brown, or red)", 17);

INSERT INTO loottable(loottable_name, loottable_weighted, category_id) VALUES("500 gp Gemstones", false, 1);

INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Alexandrite (transparent dark green)", 18);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Aquamarine (transparent pale blue-green)", 18);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Black pearl (opaque pure black)", 18);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Blue spinel (transparent deep blue)", 18);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Peridot (transparent rich olive green)", 18);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Topaz (transparent golden yellow)", 18);

INSERT INTO loottable(loottable_name, loottable_weighted, category_id) VALUES("1000 gp Gemstones", false, 1);

INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Black opal (translucent dark green with black mottling and golden flecks)", 19);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Blue sapphire (transparent blue-white to medium blue)", 19);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Emerald (transparent deep bright green)", 19);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Fire opal (translucent fiery red)", 19);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Opal (translucent pale blue with green and golden mottling)", 19);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Star ruby (translucent ruby with white star-shaped center)", 19);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Star sapphire (translucent blue sapphire with white star-shaped center)", 19);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Yellow sapphire (transparent fiery yellow or yellow-green)", 19);

INSERT INTO loottable(loottable_name, loottable_weighted, category_id) VALUES("5000 gp Gemstones", false, 1);

INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Black sapphire (translucent lustrous black with glowing highlights)", 20);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Diamond (transparent blue-white, canary, pink, brown, or blue)", 20);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Jacinth (transparent fiery orange)", 20);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Ruby (transparent clear red to deep crimson)", 20);

INSERT INTO loottable(loottable_name, loottable_weighted, category_id) VALUES("250 gp Art Objects", false, 1);

INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Gold ring set with bloodstones", 21);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Carved ivory statuette", 21);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Large gold bracelet", 21);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Silver necklace with a gemstone pendant", 21);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Bronze crown", 21);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Silk robe with gold embroidery", 21);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Large well-made tapestry", 21);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Brass mug with jade inlay", 21);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Box of turquoise animal figurines", 21);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Gold bird cage with electrum filigree", 21);

INSERT INTO loottable(loottable_name, loottable_weighted, category_id) VALUES("750 gp Art Objects", false, 1);

INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Silver chalice set with moonstones", 22);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Silver-plated steel longsword with jet set in hilt", 22);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Carved harp of exotic wood with ivory inlay and zircon gems", 22);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Small gold idol", 22);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Gold dragon comb set with red garnets as eyes", 22);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Bottle stopper cork embossed with gold leaf and set with amethysts", 22);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Ceremonial electrum dagger with a black pearl in the pommel", 22);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Silver and gold brooch", 22);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Obsidian statuette with gold fittings and inlay", 22);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Painted gold war mask", 22);

INSERT INTO loottable(loottable_name, loottable_weighted, category_id) VALUES("2500 gp Art Objects", false, 1);

INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Fine gold chain set with a fire opal", 23);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Old masterpiece painting", 23);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Embroidered silk and velvet mantle set with numerous moonstones", 23);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Platinum bracelet set with a sapphire", 23);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Embroidered glove set with jewel chips", 23);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Jeweled anklet", 23);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Gold music box", 23);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Gold circlet set with four aquamarines", 23);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Eye patch with a mock eye set in blue sapphire and moonstone", 23);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("A necklace string of small pink pearls", 23);

INSERT INTO loottable(loottable_name, loottable_weighted, category_id) VALUES("7500 gp Art Objects", false, 1);

INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Jeweled gold crown", 24);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Jeweled platinum ring", 24);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Small gold statuette set with rubies", 24);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Gold cup set with emeralds", 24);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Gold jewelry box with platinum filigree", 24);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Painted gold child’s sarcophagus", 24);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Jade game board with solid gold playing pieces", 24);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Bejeweled ivory drinking horn with gold filigree", 24);

INSERT INTO loottable(loottable_name, loottable_weighted, category_id) VALUES("Potion Miscibility", true, 1);

INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("The mixture creates a magical explosion", 1, 25);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("The mixture becomes an ingested poison of the DM’s choice.", 8, 25);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Both potions lose their effects.", 15, 25);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("One potion loses its effect.", 25, 25);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Both potions work", 35, 25);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Both potions work normally.", 90, 25);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("The numerical effects and duration of one potion are doubled. If neither potion has anything to double in this way", 99, 25);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Only one potion works", 100, 25);

INSERT INTO loottable(loottable_name, loottable_weighted, category_id) VALUES("Scroll Mishap", false, 1);

INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("A surge of magical energy deals the caster 1d6 force damage per level of the spell.", 26);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("The spell affects the caster or an ally (determined randomly) instead of the intended target, or it affects a random target nearby if the caster was the intended target.", 26);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("The spell affects a random location within the spell’s range.", 26);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("The spell’s effect is contrary to its normal one, but neither harmful nor beneficial. For instance, a fireball might produce an area of harmless cold.", 26);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("The caster suffers a minor but bizarre effect related to the spell. Such effects last only as long as the original spell’s duration, or 1d10 minutes for spells that take effect instantaneously. For example, a fireball might cause smoke to billow from the caster’s ears for 1d10 minutes.", 26);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("The spell activates after 1d12 hours. If the caster was the intended target, the spell takes effect normally. If the caster was not the intended target, the spell goes off in the general direction of the intended target, up to the spell’s maximum range, if the target has moved away.", 26);

INSERT INTO loottable(loottable_name, loottable_weighted, category_id) VALUES("Who Created It or Was Intended to Use It", true, 1);

INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Aberration. The item was created by aberrations in ancient times", 1, 27);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Human. The item was created during the heyday of a fallen human kingdom", 4, 27);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Celestial. The weapon is half the normal weight and inscribed with feathered wings", 5, 27);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Dragon. This item is made from scales and talons shed by a dragon. Perhaps it incorporates precious metals and gems from the dragon’s hoard. It grows slightly warm when within 120 feet of a dragon.", 6, 27);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Drow. The item is half the normal weight. It is black and inscribed with spiders and webs in honor of Lolth. It might function poorly", 7, 27);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Dwarf. The item is durable and has Dwarven runes worked into its design. It might be associated with a clan that would like to see it returned to their ancestral halls.", 9, 27);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Elemental Air. The item is half the normal weight and feels hollow. If it’s made of fabric", 10, 27);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Elemental Earth. This item might be crafted from stone. Any cloth or leather elements are studded with finely polished rock.", 11, 27);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Elemental Fire. This item is warm to the touch", 12, 27);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Elemental Water. Lustrous fish scales replace leather or cloth on this item", 13, 27);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Elf. The item is half the normal weight. It is adorned with symbols of nature: leaves", 15, 27);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Fey. The item is exquisitely crafted from the finest materials and glows with a pale radiance in moonlight", 16, 27);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Fiend. The item is made of black iron or horn inscribed with runes", 17, 27);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Giant. The item is larger than normal and was crafted by giants for use by their smaller allies.", 18, 27);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Gnome. The item is crafted to appear ordinary", 19, 27);
INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("Undead. The item incorporates imagery of death", 20, 27);

INSERT INTO loottable(loottable_name, loottable_weighted, category_id) VALUES("What Is a Detail from Its History", false, 1);

INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Arcane. This item was created for an ancient order of spellcasters and bears the order’s symbol.", 28);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Bane. This item was created by the foes of a particular culture or kind of creature. If the culture or creatures are still around, they might recognize the item and single out the bearer as an enemy.", 28);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Heroic. A great hero once wielded this item. Anyone who’s familiar with the item’s history expects great deeds from the new owner.", 28);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Ornament. The item was created to honor a special occasion. Inset gemstones, gold or platinum inlays, and gold or silver filigree adorn its surface.", 28);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Prophecy. The item features in a prophecy: its bearer is destined to play a key role in future events. Someone else who wants to play that role might try to steal the item, or someone who wants to prevent the prophecy from being fulfilled might try to kill the item’s bearer.", 28);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Religious. This item was used in religious ceremonies dedicated to a particular deity. It has holy symbols worked into it. The god’s followers might try to persuade its owner to donate it to a temple, steal the item for themselves, or celebrate its use by a cleric or paladin of the same deity.", 28);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Sinister. This item is linked to a deed of great evil, such as a massacre or an assassination. It might have a name or be closely associated with a villain who used it. Anyone familiar with the item’s history is likely to treat it and its owner with suspicion.", 28);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Symbol of Power. This item was once used as part of royal regalia or as a badge of high office. Its former owner or that person’s descendants might desire it, or someone might mistakenly assume its new owner is the item’s legitimate inheritor.", 28);

INSERT INTO loottable(loottable_name, loottable_weighted, category_id) VALUES("What Quirk Does It Have", false, 1);

INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Blissful. While in possession of the item, the bearer feels fortunate and optimistic about what the future holds. Butterflies and other harmless creatures might frolic in the item’s presence.", 29);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Confident. The item helps its bearer feel self-assured.", 29);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Covetous. The item’s bearer becomes obsessed with material wealth.", 29);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Frail. The item crumbles, frays, chips, or cracks slightly when wielded, worn, or activated. This quirk has no effect on its properties, but if the item has seen much use, it looks decrepit.", 29);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Hungry. This item’s magical properties function only if fresh blood from a humanoid has been applied to it within the past 24 hours. It needs only a drop to activate.", 29);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Loud. The item makes a loud noise—such as a clang, a shout, or a resonating gong—when used.", 29);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Metamorphic. The item periodically and randomly alters its appearance in slight ways. The bearer has no control over these minor alterations, which have no effect on the item’s use.", 29);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Muttering. The item grumbles and mutters. A creature who listens carefully to the item might learn something useful.", 29);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Painful. The bearer experiences a harmless flash of pain when using the item.", 29);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Possessive. The item demands attunement when first wielded or worn, and it doesn’t allow its bearer to attune to other items. (Other items already attuned to the bearer remain so until their attunement ends.)", 29);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Repulsive. The bearer feels a sense of distaste when in contact with the item, and continues to sense discomfort while bearing it.", 29);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Slothful. The bearer of this item feels slothful and lethargic. While attuned to the item, the bearer requires 10 hours to finish a long rest.", 29);

INSERT INTO loottable(loottable_name, loottable_weighted, category_id) VALUES("What Minor Property Does It Have", false, 1);

INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Beacon. The bearer can use a bonus action to cause the item to shed bright light in a 10-foot radius and dim light for an additional 10 feet, or to extinguish the light.", 30);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Compass. The wielder can use an action to learn which way is north.", 30);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Conscientious. When the bearer of this item contemplates or undertakes a malevolent act, the item enhances pangs of conscience.", 30);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Delver. While underground, the bearer of this item always knows the item’s depth below the surface and the direction to the nearest staircase, ramp, or other path leading upward.", 30);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Gleaming. This item never gets dirty.", 30);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Guardian. The item whispers warnings to its bearer, granting a +2 bonus to initiative if the bearer isn’t incapacitated.", 30);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Harmonious. Attuning to this item takes only 1 minute.", 30);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Hidden Message. A message is hidden somewhere on the item. It might be visible only at a certain time of the year, under the light of one phase of the moon, or in a specific location.", 30);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Key. The item is used to unlock a container, chamber, vault, or other entryway.", 30);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Language. The bearer can speak and understand a language of the DM’s choice while the item is on the bearer’s person.", 30);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Sentinel. Choose a kind of creature that is an enemy of the item’s creator. This item glows faintly when such creatures are within 120 feet of it.", 30);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Song Craft. Whenever this item is struck or is used to strike a foe, its bearer hears a fragment of an ancient song.", 30);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Strange Material. The item was created from a material that is bizarre given its purpose. Its durability is unaffected.", 30);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Temperate. The bearer suffers no harm in temperatures as cold as −20 degrees Fahrenheit or as warm as 120 degrees Fahrenheit.", 30);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Unbreakable. The item can’t be broken. Special means must be used to destroy it.", 30);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("War Leader. The bearer can use an action to cause his or her voice to carry clearly for up to 300 feet until the end of the bearer’s next turn.", 30);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Waterborne. This item floats on water and other liquids. Its bearer has advantage on Strength (Athletics) checks to swim.", 30);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Wicked. When the bearer is presented with an opportunity to act in a selfish or malevolent way, the item heightens the bearer’s urge to do so.", 30);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Illusion. The item is imbued with illusion magic, allowing its bearer to alter the item’s appearance in minor ways. Such alterations don’t change how the item is worn, carried, or wielded, and they have no effect on its other magical properties. For example, the wearer could make a red robe appear blue, or make a gold ring look like it’s made of ivory. The item reverts to its true appearance when no one is carrying or wearing it.", 30);
INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("Roll twice, rerolling any additional 20s.", 30);
