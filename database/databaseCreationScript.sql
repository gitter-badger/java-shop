CREATE SCHEMA IF NOT EXISTS `java_shop` DEFAULT CHARACTER SET utf8 ;
USE `java_shop` ;

DROP TABLE IF EXISTS `java_shop`.`users` ;

CREATE TABLE IF NOT EXISTS `java_shop`.`users` (
  `UserID` INT(11) NOT NULL AUTO_INCREMENT,
  `FirstName` CHAR(32) NOT NULL,
  `LastName` CHAR(32) NOT NULL,
  PRIMARY KEY (`UserID`)
)
ENGINE = InnoDB;
