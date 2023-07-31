--ddl ? data definition language. 데이터 정의어
	create ~~~
	drop ~~~
	truncate ~~~
--dml ? data manupulation  language. 데이터 조직어 LCUD

select id, content, dis_cnt, ...
  from t_post
 where title like '감자전을 먹을 때 %'
  and like_cnt > 100
	  ...
insert into t_post(id, title, content) values('ggtgtg', '감자전을 먹을 때 막걸리도 먹자', 'ㄱㅎㅅㅎㅍ')

update t_post 
  set content = '단골집에 녹두전 추천 갈려구요'
 where id='ggtgtg'
 
delete
  from t_post
 where title like '감자전을 먹을 때 %'
  and like_cnt > 100
  
--dcl ? data control language. 데이터 
  
  pl_sql