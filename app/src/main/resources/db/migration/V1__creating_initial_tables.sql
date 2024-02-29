CREATE TABLE trainers(
                         id INTEGER AUTO_INCREMENT,
                         name VARCHAR(100) NOT NULL,
                         level SMALLINT NOT NULL DEFAULT 1,
                         PRIMARY KEY (id)
);

CREATE TABLE pokemon(
                        id INTEGER AUTO_INCREMENT,
                        name VARCHAR(20) NOT NULL,
                        number SMALLINT NOT NULL,
                        PRIMARY KEY (id)
);

CREATE TABLE wild_pokemon(
                             id INTEGER AUTO_INCREMENT,
                             combat_power SMALLINT NOT NULL DEFAULT 0,
                             pokemon_id INTEGER NOT NULL,
                             trainer_id INTEGER,
                             PRIMARY KEY (id),
                             FOREIGN KEY (pokemon_id) REFERENCES pokemon (id),
                             FOREIGN KEY (trainer_id) REFERENCES trainers (id)
);