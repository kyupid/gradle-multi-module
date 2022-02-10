DROP TABLE IF EXISTS `member`;

CREATE TABLE `member`
(
    `id`   bigint(20)  NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(50) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
