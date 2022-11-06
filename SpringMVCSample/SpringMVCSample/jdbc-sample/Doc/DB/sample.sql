--------------------------------------------------------
--  파일이 생성됨 - 일요일-11월-06-2022   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table IZ_TEAM
--------------------------------------------------------

  CREATE TABLE "C##TEMPUSER"."IZ_TEAM" 
   (	"NAME" VARCHAR2(20 BYTE), 
	"PEOPLECOUNT" NUMBER(*,0), 
	"ROLE" VARCHAR2(100 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SAMPLETABLESPACE" ;
REM INSERTING into C##TEMPUSER.IZ_TEAM
SET DEFINE OFF;
Insert into C##TEMPUSER.IZ_TEAM (NAME,PEOPLECOUNT,ROLE) values ('연구1팀',14,'솔루션 개발 및 유지보수');
Insert into C##TEMPUSER.IZ_TEAM (NAME,PEOPLECOUNT,ROLE) values ('연구2팀',10,'SI 프로젝트 수행');
Insert into C##TEMPUSER.IZ_TEAM (NAME,PEOPLECOUNT,ROLE) values ('연구3팀',6,'유지보수 기술지원');
--------------------------------------------------------
--  Constraints for Table IZ_TEAM
--------------------------------------------------------

  ALTER TABLE "C##TEMPUSER"."IZ_TEAM" MODIFY ("NAME" NOT NULL ENABLE);
