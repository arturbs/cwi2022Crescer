select to_char(current_timestamp, 'DD-mon-YYYY HH24:MI:SS') AS data;

select lower(substring (nomeempregado,1,4)) from empregado;
SELECT SUBSTR(LOWER(NOMEEMPREGADO),1,4) NOME, e.* FROM EMPREGADO e;

select nomeempregado || cargo as nomecargo1, CONCAT(concat(nomeempregado, ' '), CARGO) 
AS nomecargo2 from empregado e;

SELECT TO_CHAR(E.DATAADMISSAO + '8 hours':: interval, 'DD/MM/YYYY HH24:MI:SS') FROM EMPREGADO E;
