select idempregado, nomeempregado, extract(year from age('01/06/2021',dataadmissao)) as anos, 
extract(month from age('01/06/2021',dataadmissao)) as meses, 
extract(day from age('01/06/2021',dataadmissao)) as dias FROM EMPREGADO;

SELECT CARGO, COUNT(*) FROM EMPREGADO GROUP BY CARGO;

SELECT UF, COUNT(*) FROM CIDADE GROUP BY UF ORDER BY COUNT DESC;

SELECT * FROM EMPREGADO;
/*
NÃO atualizei mesmo para não mexer nos dados pois pode ter outras questoes depois com essa tabela
mas so de pegar todos os elementos da p ver quem vai sofre atualização
*/