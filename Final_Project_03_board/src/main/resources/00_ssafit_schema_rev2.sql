DROP DATABASE IF EXISTS ssafit_final;
CREATE DATABASE IF NOT EXISTS ssafit_final;
USE ssafit_final;

CREATE SCHEMA IF NOT EXISTS `ssafit_final` DEFAULT CHARACTER SET utf8mb4 ;
USE `ssafit_final` ;

-- -----------------------------------------------------
-- Table `ssafit_final`.`User`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ssafit_final`.`User` (
  `user_id` VARCHAR(45) NOT NULL,
  `user_pw` VARCHAR(45) NOT NULL,
  `user_name` VARCHAR(20) NOT NULL,
  `user_email` VARCHAR(45) NOT NULL,
  `user_phone` VARCHAR(45) NOT NULL,
  `user_imgFolder` VARCHAR(200) NULL,
  `user_imgFile` VARCHAR(200) NULL,
  `user_nickname` VARCHAR(20) NOT NULL,
  `user_height` INT NULL,
  `user_weight` INT NULL,
  `user_point` INT NOT NULL DEFAULT 0,
  `user_created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `user_deleted_at` TIMESTAMP NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE INDEX `user_nickname_UNIQUE` (`user_nickname` ASC) VISIBLE,
  UNIQUE INDEX `user_phone_UNIQUE` (`user_phone` ASC) VISIBLE,
  UNIQUE INDEX `user_email_UNIQUE` (`user_email` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ssafit_final`.`Record`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ssafit_final`.`Record` (
  `record_num` INT NOT NULL,
  `user_id` VARCHAR(45) NOT NULL,
  `record_created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `record_modified_at` TIMESTAMP NULL,
  `record_recordDate` DATE NULL,
  `record_recordTime` TIME NULL,
  `record_title` VARCHAR(100) NULL,
  `record_content` VARCHAR(200) NULL,
  INDEX `user_id_idx` (`user_id` ASC) VISIBLE,
  PRIMARY KEY (`record_num`),
  CONSTRAINT `fk_Record_User`
    FOREIGN KEY (`user_id`)
    REFERENCES `ssafit_final`.`User` (`user_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ssafit_final`.`Board`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ssafit_final`.`Board` (
  `board_id` INT NOT NULL AUTO_INCREMENT,
  `board_name` VARCHAR(45) NOT NULL,
  `board_created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `board_point` INT NULL,
  PRIMARY KEY (`board_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ssafit_final`.`Post`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ssafit_final`.`Post` (
  `post_num` INT NOT NULL AUTO_INCREMENT,
  `post_writer_id` VARCHAR(45) NOT NULL,
  `post_board_id` INT NOT NULL,
  `post_title` VARCHAR(45) NOT NULL,
  `post_content` VARCHAR(300) NOT NULL,
  `post_img` VARCHAR(200) NULL,
  `post_created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `post_modified_at` TIMESTAMP NULL,
  `post_view_cnt` INT NOT NULL DEFAULT 0,
  PRIMARY KEY (`post_num`),
  INDEX `board_id_idx` (`post_board_id` ASC) VISIBLE,
  CONSTRAINT `fk_Post_User`
    FOREIGN KEY (`post_writer_id`)
    REFERENCES `ssafit_final`.`User` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Post_Board`
    FOREIGN KEY (`post_board_id`)
    REFERENCES `ssafit_final`.`Board` (`board_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ssafit_final`.`Comment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ssafit_final`.`Comment` (
  `comment_num` INT NOT NULL AUTO_INCREMENT,
  `post_num` INT NOT NULL,
  `comment_writer_id` VARCHAR(45) NOT NULL,
  `comment_content` VARCHAR(200) NOT NULL,
  `comment_created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `comment_modified_at` TIMESTAMP NULL,
  PRIMARY KEY (`comment_num`),
  INDEX `post_num_idx` (`post_num` ASC) ,
  INDEX `writer_idx` (`comment_writer_id` ASC) ,
  CONSTRAINT `fk_Comment_Post`
    FOREIGN KEY (`post_num`)
    REFERENCES `ssafit_final`.`Post` (`post_num`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Comment_User`
    FOREIGN KEY (`comment_writer_id`)
    REFERENCES `ssafit_final`.`User` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ssafit_final`.`PostLike`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ssafit_final`.`PostLike` (
  `postLike_num` VARCHAR(45) NOT NULL,
  `postLike_user_id` VARCHAR(15) NOT NULL,
  `postLike_post_num` INT NOT NULL,
  PRIMARY KEY (`postLike_num`),
  INDEX `like_post_idx` (`postLike_post_num` ASC),
  INDEX `like_id_idx` (`postLike_user_id` ASC),
  CONSTRAINT `fk_PostLike_Post`
    FOREIGN KEY (`postLike_post_num`)
    REFERENCES `mydb`.`Post` (`post_num`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_PostLike_User`
    FOREIGN KEY (`postLike_user_id`)
    REFERENCES `ssafit_final`.`User` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
