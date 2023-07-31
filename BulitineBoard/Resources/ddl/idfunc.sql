--시퀀스 정보를 가지고 있는 Sequence 테이블 만들기



CREATE TABLE t_sequence (
	NAME VARCHAR(255) PRIMARY KEY,
	NUM INT NOT NULL DEFAULT 0
);
INSERT INTO t_sequence (NAME) VALUES ('s_bulitine board');


DELIMITER $$
CREATE OR REPLACE FUNCTION NEXT_pk(t_NAME VARCHAR(255)) RETURNS char(4)
BEGIN
	DECLARE unrecorded boolean;
	DECLARE r_sequence CHAR(4);
	
	select not exists(select num from t_sequence where NAME = t_NAME) into unrecorded;
	
	if (unrecorded) then
		INSERT INTO t_sequence (NAME) VALUES (t_NAME);
	end if;
	
	UPDATE t_sequence SET NUM = NUM + 1  WHERE NAME = t_NAME;

	SELECT c.SEED INTO r_sequence
	 FROM t_sequence s, T_ID_SEED c
	WHERE s.NAME = t_NAME
	  and s.NUM = c.SEQ	;
	
  	RETURN r_sequence;
END;
$$
DELIMITER ;

SELECT NEXT_pk('s_post');

