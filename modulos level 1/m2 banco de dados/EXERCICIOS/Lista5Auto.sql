SELECT IDEMPREGADO, NOMEEMPREGADO, DATAADMISSAO FROM EMPREGADO ORDER BY DATAADMISSAO ASC;

SELECT NOMEEMPREGADO, SALARIO FROM EMPREGADO WHERE COMISSAO IS NULL order by salario;

SELECT IDEMPREGADO, NOMEEMPREGADO AS NOME, SALARIO * 13 AS SALARIOANUAL, 
COALESCE(COMISSAO,0) * 12 AS COMISSAOANUAL, 
(SALARIO * 13 + coalesce(COMISSAO,0) * 12) AS RENDAANUAL 
FROM EMPREGADO ORDER BY NOMEEMPREGADO;

SELECT idempregado AS ID, nomeempregado AS nome, cargo, salario * 13 as salario_anual FROM empregado WHERE
CARGO = 'Atendente' OR salario * 13 < 18500 ORDER BY nomeempregado;

SELECT nomeempregado AS nome, cargo FROM empregado WHERE cargo = 'Atendente' OR idgerente = 7698 
ORDER BY nomeempregado;

select iddepartamento, nomedepartamento FROM DEPARTAMENTO WHERE localizacao like 'SAO%' 
ORDER BY NOMEDEPARTAMENTO;

SELECT * FROM CIDADEEX WHERE idcidade > 3 AND idcidade < 10 ORDER BY idcidade;

SELECT IDDEPARTAMENTO FROM EMPREGADO;
SELECT IDDEPARTAMENTO FROM DEPARTAMENTO;

SELECT  nomeempregado AS nome, CARGO FROM EMPREGADO WHERE iddepartamento IS null order by nomeempregado; 

SELECT NOMEEMPREGADO AS NOME FROM EMPREGADO WHERE idgerente = 7566 
OR idgerente = 7698 OR idgerente = 7782 ORDER BY NOMEEMPREGADO;