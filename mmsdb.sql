/*
SQLyog Ultimate v8.32 
MySQL - 5.0.27-community-nt : Database - mmsdb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mmsdb` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `mmsdb`;

/*Table structure for table `grp` */

DROP TABLE IF EXISTS `grp`;

CREATE TABLE `grp` (
  `gid` int(5) NOT NULL auto_increment,
  `gname` char(50) NOT NULL,
  PRIMARY KEY  (`gid`,`gname`),
  UNIQUE KEY `gid` (`gid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `grp` */

LOCK TABLES `grp` WRITE;

insert  into `grp`(`gid`,`gname`) values (1,'clg friends'),(2,'school friends'),(3,'relatives'),(4,'teachers'),(11,'friends'),(12,'aaaaa'),(13,'special friends'),(14,'ss'),(15,'jhmukh'),(16,'wff'),(17,'harshit'),(18,'hars');

UNLOCK TABLES;

/*Table structure for table `tbcontact` */

DROP TABLE IF EXISTS `tbcontact`;

CREATE TABLE `tbcontact` (
  `uid` char(50) default NULL,
  `cname` char(50) default NULL,
  `email` char(50) default NULL,
  `groupn` char(50) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tbcontact` */

LOCK TABLES `tbcontact` WRITE;

insert  into `tbcontact`(`uid`,`cname`,`email`,`groupn`) values ('h','kishan','hmharsh3@gmal.com','friends'),('h','harsh','ha@gmail.com','friends'),('h','harshit','success@mms.com','famaly'),('s','success','success@gmail.com','relatives'),('trial','trial','hmhars3@gmal.com','friends'),('h','hars','hmharsh3@gmal.com','friends'),('vidhya','harshit','success@mms.com','famaly'),('h','hhhh','hars3@gmal.com','har'),('hhh','harshit','success@mms.com','famaly'),('h','success','h@gmail.com','har'),('chhajed','peterer','peter@gmail.com',NULL),('chhajed','peterer','peter@gmail.com','q'),('yash mahajan','yash','yasj',''),('yash mahajan','yash','yasjgh',NULL),('h','h','hm','har'),('h','sjaf','skdj','friends'),('h','kljsf','lkdn','friends'),('h','kljsf','lkdn','friends'),('h','kjd','n sc','friends'),('h','skjfb','lkjf','friends'),('h','hm','govinda@gmail.com','famaly'),('rahul','rahul','sdfsas@gamil.com','mtech'),('rahul','harshit','success@mms.com','famaly'),('rahul','rfe','dcsd@gmail.com','mtech'),('rahul','sl','aa@gmail.com','class'),('shshr4','hhrsht','hesfdt@gnail.vcom','/it/'),('shshr4','Sachin','sdfsas@gamil.vom','/it/'),('ppp','pp','sd@yahoo.com','qq'),('h','fb','h@gmail.com','friends'),('123','harshit','success@mms.com','famaly'),('h','hhh','hhhh@mms.com','friends'),('h','hii','harshit@mms.com','friends'),('kk','harshit','success@mms.com','famaly'),('h','abc','ha@gmail.com@mms.com','friends'),('h','kjgjk','kjg@mms.com','friends');

UNLOCK TABLES;

/*Table structure for table `tblogin` */

DROP TABLE IF EXISTS `tblogin`;

CREATE TABLE `tblogin` (
  `tbname` char(50) default NULL,
  `tbuname` char(50) NOT NULL,
  `tbcontact` char(10) default NULL,
  `tbemail` char(50) default NULL,
  `tbpass` char(50) default NULL,
  PRIMARY KEY  (`tbuname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tblogin` */

LOCK TABLES `tblogin` WRITE;

insert  into `tblogin`(`tbname`,`tbuname`,`tbcontact`,`tbemail`,`tbpass`) values ('harshitm','111','8349935005','hmharsh3@gmail.com','846387695'),('harshit','12','8349935005','hmharsh3@gmail.com','123456789'),('success','1233','8349935005','sjka@mms.com','nksjfksdlkd'),('harshit','1849','8349935005','hmharsh3@gmail.com','894699jgfy'),('harshit','819','8349935005','hmharsh3@gmail.com','jhilhuig'),('hh','afWEF','8349935005','hmharsh3@gmail.com','sery5ysr'),('harshitm','ager','8349935005','hmharsh3@gmail.com','DSFGwEFwef'),('palak','chhajed','9826536101','palakchh@gmail.com','qwertyuiop'),('h','h','8349935005','hmharsh3@gmail.com','1'),('hhh','hhh','8349935005','abcc@gmail.com','123456789'),('harshit','hhhh','8349935005','hmharsh3@gmail.com','615941619'),('harshit','hm','8349935005','hmharsh3@gmail.com','12345678'),('harshit','hmharsh','8349935005','hmharsh@mms.com','123456789'),('harshit','hmharsh3','8349935005','hmharsh3@gmail.com','123'),('surbhi','joaskaj893849','6565565632','dakoliya.surabhi@gmail.com','12345678'),('kishan','kishanM','8814547538','fghsrth536@hfr.com','12345678k'),('kdgjb','kjbhklr','6846108456','dbv@gmail.com','6s41f65'),('kailash`','kk','9424564634','kk@mms.com','123456789'),('harshitmm','ksjf','8349935005','hmharsh3@gmail.com','skhdvsk'),('kjg','l;nkl','6464664464','kjb@mms.com','mhvhjmvj'),('kdjfb','lusic','2522222222','hmharsh3@gmail.com','62fr564df6'),('harshitm','m','8349935005','hmharsh3@gmail.com','12345678'),('xyz','mmm@yahoo.com','6854796544','govindamahajan16@gmail.com','zzzzsssss'),('h','nm','8349935005','hmharsh3@gmail.com','123456789'),('vidhya','parmar','9993605630','vidhya.parmar95@gmail.com','it2k13-41'),('pp','ppp','1111111111','sd@yahoo.com','11111111'),('rahul','rahul','9977440495','rahulgundia@gmail.com','rahulgundia'),('rahul','rahul@gMIL','3653255555','gtfukgtl65@gmail.com','rahulgundia'),('Rohan','rohan1795','9009685818','rohan.charlie@gmail.com','342 v3rqe'),('harshitmahajan','s','8349935005','hmharsh3@gmail.com','harshit16'),('jkgcs','scjbjk','4854864645','hmharsh3@gmail.com','65146546'),('h','sdGD','8349935005','hmharsh3@gmail.com','edgWREWGERGE'),('shshr','shshr4','8982853353','shishirmarch05@gmail.com','8982853353'),('harshit','ss','8349935005','sh@gmail.com','123456789'),('trial','trial','8349935005','hmharsh3@gmail.com','trialtrial'),('name','uname','8349935005','mail@host.com','123456789'),('vidhya','vidhya','9993605630','vidhya.parmar95@gmail.com','it2k13-41'),('uasg','yash mahajan','8940007465','yash_mahajan@mail.com','123456789'),('yash','yash1234','1234587452','yash1245@gnil.com','12345'),('yash','yash23895','1651116514','hmharsh3@gmail.com','69549496459');

UNLOCK TABLES;

/*Table structure for table `tbmail` */

DROP TABLE IF EXISTS `tbmail`;

CREATE TABLE `tbmail` (
  `to` varchar(2000) default NULL,
  `byy` char(255) default NULL,
  `msg` varchar(5000) default NULL,
  `sub` char(255) default NULL,
  `tim` varchar(500) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tbmail` */

LOCK TABLES `tbmail` WRITE;

insert  into `tbmail`(`to`,`byy`,`msg`,`sub`,`tim`) values ('hmharsh3@gmail.com','hmharsh3@gmail.com','jbdk','khbf','Sat Feb 20 2016 15:17:08 GMT+0530 (India Standard Time)'),(' hmharsh3@gmal.com','vidhya.parmar95@gmail.com','       ,jhln >ZX,/;                      ',' bjh','Sat Feb 20 2016 15:23:59 GMT+0530 (India Standard Time)'),(' hars3@gmal.com','hmharsh3@gmail.com','jdfkh                            ','hii','Tue Mar 01 2016 09:53:00 GMT+0530 (India Standard Time)'),(' peter@gmail.com peter@gmail.com','palakchh@gmail.com','heyy peter. how are you?                            ','my 1st mail','Tue Mar 01 2016 10:02:22 GMT+0530 (India Standard Time)'),('yask_majaja@mail.com','yash_mahajan@mail.com','safrtgghghhgh                            ','dgg','Tue Mar 01 2016 16:57:07 GMT+0530 (India Standard Time)'),(' hmharsh3@gmal.com','hmharsh3@gmail.com','akjdgbk                            ','trial','Tue Mar 01 2016 18:34:28 GMT+0530 (India Standard Time)'),(' success@gmail.com','hmharsh3@gmail.com','xfhzd','dhxdt','Tue Mar 01 2016 20:38:00 GMT+0530 (India Standard Time)'),('yash@gmail.com','hmharsh3@gmail.com','lkndfa','123','Tue Mar 01 2016 20:42:43 GMT+0530 (India Standard Time)'),('abc@gmail.com','hmharsh3@gmail.com','EF                     ','gfs','Tue Mar 01 2016 21:21:33 GMT+0530 (India Standard Time)'),(' success@gmail.com','hmharsh3@gmail.com','succcess','succcess','Tue Mar 01 2016 21:26:43 GMT+0530 (India Standard Time)'),(' ha@gmail.com','hmharsh3@gmail.com','skjf                            ','','Tue Mar 01 2016 23:29:12 GMT+0530 (India Standard Time)'),(' hmharsh3@gmal.com','hmharsh3@gmail.com','                  ','','Tue Mar 01 2016 23:28:56 GMT+0530 (India Standard Time)'),(' hmharsh3@gmal.com','hmharsh3@gmail.com','                  ','','Tue Mar 01 2016 23:37:18 GMT+0530 (India Standard Time)'),('hmharsh3@gmail.com','hmharsh3@gmail.com','                  kjdcn','skj','Tue Mar 01 2016 23:37:53 GMT+0530 (India Standard Time)'),('hmharsh3@gmail.com','hmharsh3@gmail.com','                  kjdcn','skj','Tue Mar 01 2016 23:38:17 GMT+0530 (India Standard Time)'),('h','hmharsh3@gmail.com','                  kjdcn','ERW','Tue Mar 01 2016 23:39:19 GMT+0530 (India Standard Time)'),('hh','hmharsh3@gmail.com','                            kndfc','xnvj c','Tue Mar 01 2016 23:41:47 GMT+0530 (India Standard Time)'),('hh','hmharsh3@gmail.com','                            kndfc','xnvj c','Tue Mar 01 2016 23:42:02 GMT+0530 (India Standard Time)'),('kjdb','hmharsh3@gmail.com','klj','xnc','Tue Mar 01 2016 23:42:57 GMT+0530 (India Standard Time)'),('sajkf','hmharsh3@gmail.com','lkndc','s,m','Tue Mar 01 2016 23:45:21 GMT+0530 (India Standard Time)'),('dlkvn','hmharsh3@gmail.com','klf','kjb','Tue Mar 01 2016 23:47:59 GMT+0530 (India Standard Time)'),('ha@gmail.com','hmharsh3@gmail.com','klf','kjb','Tue Mar 01 2016 23:48:09 GMT+0530 (India Standard Time)'),('ha@gmail.com','hmharsh3@gmail.com','knf','g,sn','Tue Mar 01 2016 23:49:10 GMT+0530 (India Standard Time)'),('jhn@gmail.com','fghsrth536@hfr.com','iughju','hjbd','Wed Mar 02 2016 00:55:48 GMT+0530 (India Standard Time)'),('ha@gmail.com','hmharsh3@gmail.com','jhb','hi','Wed Mar 02 2016 01:06:45 GMT+0530 (India Standard Time)'),('hmharsh3@gmail.com','hmharsh3@gmail.com','jg','hii','Wed Mar 02 2016 01:10:59 GMT+0530 (India Standard Time)'),('ha@gmail.com','hmharsh3@gmail.com','jbdw','hi','Wed Mar 02 2016 01:15:54 GMT+0530 (India Standard Time)'),('hmharts@gmail.com','rahulgundia@gmail.com','helloooo  welcomw\r\nhelloooo  welcomw\r\nhelloooo  welcomw\r\nhelloooo  welcomwhelloooo  welcomwhelloooo  welcomw','hii','Wed Mar 02 2016 09:44:10 GMT+0530 (India Standard Time)'),('  sdfsas@gamil.com haa@gmail.com dcsd@gmail.com','rahulgundia@gmail.com','dgbu                            ','hb bhj','Wed Mar 02 2016 09:46:23 GMT+0530 (India Standard Time)'),('95.monikalele@gmail.com','dakoliya.surabhi@gmail.com','      frhjgjgkjhk\r\nghgjhjhjhkhnb\r\nhjhj                      ','hey','Wed Mar 02 2016 09:54:37 GMT+0530 (India Standard Time)'),('  sd@yahoo.com','sd@yahoo.com','         kjbh                   ','jhbj,hb,','Wed Mar 02 2016 14:18:29 GMT+0530 (India Standard Time)'),(' success@gmail.com hm hars3@gmal.com','hmharsh3@gmail.com','.fcn','lwd','Wed Mar 02 2016 14:19:48 GMT+0530 (India Standard Time)'),('  hars3@gmal.com','hmharsh3@gmail.com','kjbd','dsjbh','Wed Mar 02 2016 15:21:07 GMT+0530 (India Standard Time)'),('  ha@gmail.com hars3@gmal.com skdj','hmharsh3@gmail.com','sd','fsa','Wed Mar 02 2016 20:36:51 GMT+0530 (India Standard Time)'),('  ha@gmail.com haa@gmail.com success@gmail.com','hmharsh3@gmail.com','hiii                            ','1 st trial mail','Thu Mar 03 2016 07:39:42 GMT+0530 (India Standard Time)'),('  hmharsh3@gmal.com','hmharsh3@gmail.com',',bnd','hii','Thu Mar 03 2016 07:42:14 GMT+0530 (India Standard Time)'),('  ha@gmail.com','hmharsh3@gmail.com','    kh\r\n\r\n\r\n\r\n\r\n                        ','jk','Thu Mar 03 2016 09:09:11 GMT+0530 (India Standard Time)'),('hmharsh3@gmail.com','yash1245@gnil.com','mail recieve success','hii','Thu Mar 03 2016 18:18:22 GMT+0530 (India Standard Time)'),('hmharsh3@gmail.com hii@gmail.com','yash1245@gnil.com','ds','kkkkkkkkkkk','Thu Mar 03 2016 18:25:59 GMT+0530 (India Standard Time)'),('hmharsh3@gmail.com','yash1245@gnil.com','        ndjknkncsnjknvd                    ','hdgu','Thu Mar 03 2016 18:34:54 GMT+0530 (India Standard Time)'),('  hmharsh@mms.com','hmharsh3@gmail.com','sjfbka\r\n                            ','hiiii','Fri Mar 04 2016 19:55:13 GMT+0530 (India Standard Time)'),('hmharsh@mms.com','hmharsh@mms.com','kld\r\n                            ','654g','Fri Mar 04 2016 19:57:05 GMT+0530 (India Standard Time)'),(' hmharsh3@gmail.com','fghsrth536@hfr.com','                  koi naaa          ','kkii','Sun Mar 06 2016 10:46:30 GMT+0530 (India Standard Time)'),('hm@gmail.com','','                            Sdffddff','hhh','Sun Mar 06 2016 10:50:23 GMT+0530 (IST)'),('  hmharsh@mms.com','kk@mms.com','jdeghw                            ','hii','Sun Mar 06 2016 22:34:46 GMT+0530 (India Standard Time)'),('harshit@mms.com','','      4rj;34utf[4wmti[49witeim4t9unrtb]4bn]tin]b                      ','ergfdr','Tue Mar 08 2016 10:06:56 GMT+0530 (India Standard Time)'),('  hmharsh3@gmal.com govinda@gmail.com','hmharsh3@gmail.com','                         ,nd  ','dc','Sun Mar 27 2016 16:54:29 GMT+0530 (India Standard Time)');

UNLOCK TABLES;

/* Procedure structure for procedure `del` */

/*!50003 DROP PROCEDURE IF EXISTS  `del` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `del`(ms CHAR(255))
BEGIN
INSERT INTO grp(msg) VALUES (ms);
    END */$$
DELIMITER ;

/* Procedure structure for procedure `getal` */

/*!50003 DROP PROCEDURE IF EXISTS  `getal` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `getal`()
BEGIN
SELECT * FROM tbcontact;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `getall` */

/*!50003 DROP PROCEDURE IF EXISTS  `getall` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `getall`()
BEGIN
SELECT * FROM tbcontact ;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `getgrpnam` */

/*!50003 DROP PROCEDURE IF EXISTS  `getgrpnam` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `getgrpnam`()
BEGIN
SELECT gname FROM grp;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `getsmail` */

/*!50003 DROP PROCEDURE IF EXISTS  `getsmail` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `getsmail`(bb CHAR(255))
BEGIN
SELECT
    `tbmail`.*
FROM
    `mmsdb`.`tbmail`
    ;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `insertgrp` */

/*!50003 DROP PROCEDURE IF EXISTS  `insertgrp` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `insertgrp`(grname CHAR(50))
BEGIN
INSERT INTO grp(gname) VALUES (grname);
    END */$$
DELIMITER ;

/* Procedure structure for procedure `insmail` */

/*!50003 DROP PROCEDURE IF EXISTS  `insmail` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `insmail`(t varCHAR(1000),b CHAR(255),ms varCHAR(5000),su CHAR(255),ti varchar(500))
BEGIN
INSERT INTO tbmail VALUES (t,b,ms,su,ti);
    END */$$
DELIMITER ;

/* Procedure structure for procedure `prcheck` */

/*!50003 DROP PROCEDURE IF EXISTS  `prcheck` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `prcheck`()
BEGIN
SELECT * FROM tblogin;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `prcontact` */

/*!50003 DROP PROCEDURE IF EXISTS  `prcontact` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `prcontact`(uid CHAR(50),cname CHAR(50),email CHAR(50),groupn CHAR(50))
BEGIN
INSERT INTO tbcontact VALUES (uid,cname,email,groupn);
    END */$$
DELIMITER ;

/* Procedure structure for procedure `prsignup` */

/*!50003 DROP PROCEDURE IF EXISTS  `prsignup` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `prsignup`(prname CHAR(50),pruname CHAR(50),prcontact CHAR(10),premail CHAR(50),prpass CHAR(50))
BEGIN
INSERT INTO tblogin VALUES (prname,pruname,prcontact,premail,prpass);
    END */$$
DELIMITER ;

/* Procedure structure for procedure `updatecon` */

/*!50003 DROP PROCEDURE IF EXISTS  `updatecon` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `updatecon`(uid CHAR(50),cnam CHAR(50),emai CHAR(50),groupa CHAR(50))
BEGIN
UPDATE tbcontact SET email=emai,groupn=groupa WHERE cname=cnam;
    END */$$
DELIMITER ;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
