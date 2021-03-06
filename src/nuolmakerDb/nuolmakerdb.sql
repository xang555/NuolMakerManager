-- MySQL Script generated by MySQL Workbench
-- 04/03/16 12:41:01
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
  `pic` VARCHAR(45) NULL,
  PRIMARY KEY (`MId`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `nuolmaker`.`Plan`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `nuolmaker`.`Plan` (
  `planId` INT NOT NULL AUTO_INCREMENT,
  `plantitle` VARCHAR(45) NULL,
  `planDate` DATE NULL,
  `planDateCommit` DATETIME NULL,
  `planStatus` TINYINT(1) NULL,
  PRIMARY KEY (`planId`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `nuolmaker`.`planorder`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `nuolmaker`.`planorder` (
  `rId` INT NOT NULL,
  `MId` INT NOT NULL,
  `planId` INT NOT NULL,
  `orderDate` DATETIME NULL,
  PRIMARY KEY (`rId`, `MId`, `planId`),
  INDEX `fk_order_member1_idx` (`MId` ASC),
  INDEX `fk_order_Plan1_idx` (`planId` ASC),
  CONSTRAINT `fk_order_member1`
    FOREIGN KEY (`MId`)
    REFERENCES `nuolmaker`.`member` (`MId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_order_Plan1`
    FOREIGN KEY (`planId`)
    REFERENCES `nuolmaker`.`Plan` (`planId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `nuolmaker`.`accessoritype`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `nuolmaker`.`accessoritype` (
  `typeId` INT NOT NULL,
  `typeName` VARCHAR(45) NULL,
  PRIMARY KEY (`typeId`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `nuolmaker`.`planorderDetail`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `nuolmaker`.`planorderDetail` (
  `rId` INT NOT NULL,
  `typeId` INT NOT NULL,
  `pName` VARCHAR(45) NULL,
  `pAmount` INT NULL,
  `pPrice` DECIMAL(10,2) NULL,
  PRIMARY KEY (`rId`, `typeId`),
  INDEX `fk_orderDetail_accessoritype1_idx` (`typeId` ASC),
  CONSTRAINT `fk_orderDetail_order`
    FOREIGN KEY (`rId`)
    REFERENCES `nuolmaker`.`planorder` (`rId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_orderDetail_accessoritype1`
    FOREIGN KEY (`typeId`)
    REFERENCES `nuolmaker`.`accessoritype` (`typeId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `nuolmaker`.`finance`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `nuolmaker`.`finance` (
  `fId` INT NOT NULL,
  `planId` INT NOT NULL,
  `MId` INT NOT NULL,
  `fmoney` DECIMAL(12,2) NULL,
  PRIMARY KEY (`fId`, `planId`, `MId`),
  INDEX `fk_finance_Plan1_idx` (`planId` ASC),
  INDEX `fk_finance_member1_idx` (`MId` ASC),
  CONSTRAINT `fk_finance_Plan1`
    FOREIGN KEY (`planId`)
    REFERENCES `nuolmaker`.`Plan` (`planId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_finance_member1`
    FOREIGN KEY (`MId`)
    REFERENCES `nuolmaker`.`member` (`MId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `nuolmaker`.`bin`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `nuolmaker`.`bin` (
  `bin` INT NOT NULL,
  `planId` INT NOT NULL,
  `fId` INT NOT NULL,
  `MId` INT NOT NULL,
  `bDate` VARCHAR(45) NULL,
  `binstatus` TINYINT(1) NULL,
  PRIMARY KEY (`bin`, `planId`, `fId`, `MId`),
  INDEX `fk_bin_Plan1_idx` (`planId` ASC),
  INDEX `fk_bin_finance1_idx` (`fId` ASC),
  INDEX `fk_bin_member1_idx` (`MId` ASC),
  CONSTRAINT `fk_bin_Plan1`
    FOREIGN KEY (`planId`)
    REFERENCES `nuolmaker`.`Plan` (`planId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_bin_finance1`
    FOREIGN KEY (`fId`)
    REFERENCES `nuolmaker`.`finance` (`fId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_bin_member1`
    FOREIGN KEY (`MId`)
    REFERENCES `nuolmaker`.`member` (`MId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `nuolmaker`.`bindetail`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `nuolmaker`.`bindetail` (
  `bindId` INT NOT NULL,
  `bin` INT NOT NULL,
  `typeId` INT NOT NULL,
  `bName` VARCHAR(45) NULL,
  `bAmount` INT NULL,
  `bPrice` DECIMAL(10,2) NULL,
  PRIMARY KEY (`bindId`, `bin`, `typeId`),
  INDEX `fk_bindetail_bin1_idx` (`bin` ASC),
  INDEX `fk_bindetail_accessoritype1_idx` (`typeId` ASC),
  CONSTRAINT `fk_bindetail_bin1`
    FOREIGN KEY (`bin`)
    REFERENCES `nuolmaker`.`bin` (`bin`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_bindetail_accessoritype1`
    FOREIGN KEY (`typeId`)
    REFERENCES `nuolmaker`.`accessoritype` (`typeId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `nuolmaker`.`speciepay`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `nuolmaker`.`speciepay` (
  `sp_id` INT NOT NULL AUTO_INCREMENT,
  `fId` INT NOT NULL,
  `MId` INT NOT NULL,
  `sp_description` VARCHAR(100) NULL,
  `sp_pay` DECIMAL(10,2) NULL,
  `sp_date` DATETIME NULL,
  PRIMARY KEY (`sp_id`, `fId`, `MId`),
  INDEX `fk_speciepay_finance1_idx` (`fId` ASC),
  INDEX `fk_speciepay_member1_idx` (`MId` ASC),
  CONSTRAINT `fk_speciepay_finance1`
    FOREIGN KEY (`fId`)
    REFERENCES `nuolmaker`.`finance` (`fId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_speciepay_member1`
    FOREIGN KEY (`MId`)
    REFERENCES `nuolmaker`.`member` (`MId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `nuolmaker`.`orderdetail`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `nuolmaker`.`orderdetail` (
  `rId` INT NOT NULL,
  `pName` VARCHAR(45) NULL DEFAULT NULL,
  `ptype` VARCHAR(45) NULL DEFAULT NULL,
  `pAmount` INT(11) NULL DEFAULT NULL,
  `pPrice` DECIMAL(10,2) NULL DEFAULT NULL,
  PRIMARY KEY (`rId`),
  CONSTRAINT `fk_orderDetail_order2`
    FOREIGN KEY (`rId`)
    REFERENCES `nuolmaker`.`planorder` (`rId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `nuolmaker`.`palnspecilepay`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `nuolmaker`.`palnspecilepay` (
  `ppId` INT NOT NULL AUTO_INCREMENT,
  `MId` INT NOT NULL,
  `planId` INT NOT NULL,
  `ppName` VARCHAR(100) NULL,
  `ppPay` DECIMAL(12,2) NULL,
  PRIMARY KEY (`ppId`, `MId`, `planId`),
  INDEX `fk_palnspecilePlan_Plan1_idx` (`planId` ASC),
  INDEX `fk_palnspecilePay_member1_idx` (`MId` ASC),
  CONSTRAINT `fk_palnspecilePlan_Plan1`
    FOREIGN KEY (`planId`)
    REFERENCES `nuolmaker`.`Plan` (`planId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_palnspecilePay_member1`
    FOREIGN KEY (`MId`)
    REFERENCES `nuolmaker`.`member` (`MId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `nuolmaker`.`specilebin`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `nuolmaker`.`specilebin` (
  `ssbin` INT NOT NULL,
  `bin` INT NOT NULL,
  `ssname` VARCHAR(45) NULL,
  `sspay` DECIMAL(10,2) NULL,
  `ssdate` DATETIME NULL,
  PRIMARY KEY (`ssbin`, `bin`),
  INDEX `fk_specilebin_bin1_idx` (`bin` ASC),
  CONSTRAINT `fk_specilebin_bin1`
    FOREIGN KEY (`bin`)
    REFERENCES `nuolmaker`.`bin` (`bin`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
