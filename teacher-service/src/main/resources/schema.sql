DROP TABLE IF EXISTS teacher;

CREATE TABLE IF NOT EXISTS teacher
(
    id        INT NOT NULL AUTO_INCREMENT,
    firstName VARCHAR(255),
    lastName  VARCHAR(255),
    email     VARCHAR(255),
    phone     VARCHAR(100),
    PRIMARY KEY (id)
);

INSERT INTO `teacher` (`id`, `firstName`, `lastName`, `email`, `phone`)
VALUES ('1', 'ittikorn', 'Chawkamud', 'do.ittikorn@gmail.com', '0935281333')
ON DUPLICATE KEY UPDATE `id`        = '1',
                        `firstName` = 'ittikorn',
                        `lastName`  = 'Chawkamud',
                        `email`     = 'do.ittikorn@gmail.com',
                        `phone`     = '0935281333';
