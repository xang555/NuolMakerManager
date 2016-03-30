-- MySQL Script generated by MySQL Workbench
-- 03/30/16 12:35:25
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema nuolmaker
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema nuolmaker
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `nuolmaker` DEFAULT CHARACTER SET latin1 ;
USE `nuolmaker` ;

-- -----------------------------------------------------
-- Table `nuolmaker`.`member`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `nuolmaker`.`member` (
  `MId` INT NOT NULL,
  `stdId` VARCHAR(45) NULL,
  `name` VARCHAR(45) NULL,
  `lname` VARCHAR(45) NULL,
  `duty` VARCHAR(45) NULL,
  `user` VARCHAR(45) NULL,
  `passwd` VARCHAR(45) NULL,
  `class` VARCHAR(45) NULL,
  `phone` VARCHAR(45) NULL,
  `no` INT NULL,
  `Datecome` DATETIME NULL,
  `status` TINYINT(1) NULL,
  `permission` TINYINT(1) NULL,
  PRIMARY KEY (`MId`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `nuolmaker`.`order`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `nuolmaker`.`order` (
  `rId` INT NOT NULL,
  `MId` INT NOT NULL,
  `orderDate` DATETIME NULL,
  `orderStatus` TINYINT(1) NULL,
  PRIMARY KEY (`rId`, `MId`),
  INDEX `fk_order_member1_idx` (`MId` ASC),
  CONSTRAINT `fk_order_member1`
    FOREIGN KEY (`MId`)
    REFERENCES `nuolmaker`.`member` (`MId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `nuolmaker`.`orderDetail`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `nuolmaker`.`orderDetail` (
  `rId` INT NOT NULL,
  `pName` VARCHAR(45) NULL,
  `ptype` VARCHAR(45) NULL,
  `pAmount` INT NULL,
  `pPrice` DECIMAL(10,2) NULL,
  PRIMARY KEY (`rId`),
  CONSTRAINT `fk_orderDetail_order`
    FOREIGN KEY (`rId`)
    REFERENCES `nuolmaker`.`order` (`rId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `nuolmaker`.`buy`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `nuolmaker`.`buy` (
  `bId` INT NOT NULL,
  `rId` INT NOT NULL,
  `MId` INT NOT NULL,
  `bDate` DATETIME NULL,
  PRIMARY KEY (`bId`, `rId`, `MId`),
  INDEX `fk_buy_order1_idx` (`rId` ASC),
  INDEX `fk_buy_member1_idx` (`MId` ASC),
  CONSTRAINT `fk_buy_order1`
    FOREIGN KEY (`rId`)
    REFERENCES `nuolmaker`.`order` (`rId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_buy_member1`
    FOREIGN KEY (`MId`)
    REFERENCES `nuolmaker`.`member` (`MId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `nuolmaker`.`specie`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `nuolmaker`.`specie` (
  `rId` INT NOT NULL,
  `sp_description` VARCHAR(100) NULL,
  `sp_pay` DECIMAL(10,2) NULL,
  PRIMARY KEY (`rId`),
  CONSTRAINT `fk_specie_order1`
    FOREIGN KEY (`rId`)
    REFERENCES `nuolmaker`.`order` (`rId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `nuolmaker`.`orderdetail`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `nuolmaker`.`orderdetail` (
  `rId` INT(11) NOT NULL,
  `pName` VARCHAR(45) NULL DEFAULT NULL,
  `ptype` VARCHAR(45) NULL DEFAULT NULL,
  `pAmount` INT(11) NULL DEFAULT NULL,
  `pPrice` DECIMAL(10,2) NULL DEFAULT NULL,
  PRIMARY KEY (`rId`),
  CONSTRAINT `fk_orderDetail_order`
    FOREIGN KEY (`rId`)
    REFERENCES `nuolmaker`.`order` (`rId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
