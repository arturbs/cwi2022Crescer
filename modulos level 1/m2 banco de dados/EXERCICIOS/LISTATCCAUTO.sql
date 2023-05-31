select L.TITULO, to_char(L.INICIO_VIGENCIA, 'DD/month/YYYY') AS INICIO, 
to_char(L.fim_vigencia, 'DD/month/YYYY') AS FIM
from lic_licitacao L 
where (L.INICIO_VIGENCIA >= '2018/01/01' )
AND (L.fim_vigencia <= '2018/06/30');

select  to_char(L.DATA_FECHAMENTO, 'DD-month-YYYY') AS FECHAMENTO, 
TRUNC(L.VALOR_ESTIMADO_MIN) AS MIN,
L.TITULO
from lic_licitacao L 
where (L.INICIO_VIGENCIA >= '2018/01/01' )
AND (L.fim_vigencia <= '2018/06/30')
;



SELECT idcontratante, round(CAST(((VALOR_ESTIMADO_MIN + VALOR_ESTIMADO_MAX)/2) AS NUMERIC),2) 
AS VALOR_MEDIO, VALOR_ESTIMADO_MIN, VALOR_ESTIMADO_MAX FROM lic_licitacao WHERE 
IDCONTRATANTE = 705 OR IDCONTRATANTE = 738;

SELECT idcontratante, trunc(AVG(VALOR_ESTIMADO_MIN),2) as minimo_medio,
trunc(AVG(VALOR_ESTIMADO_MAX),2) as maxim_medio 
FROM lic_licitacao WHERE  IDCONTRATANTE = 705 OR IDCONTRATANTE = 738 group by idcontratante;



select idcontratante, count(*) from lic_licitacao group by idcontratante 
order by count desc;



SELECT 
         CASE (situacao)
                                   WHEN 'S' THEN 'selecionada'
                                   WHEN 'D' THEN 'desqualificada'
                                   WHEN 'N' THEN 'nao selecionada'
                                   END AS situacao
								   , idlicitacao, idempresa
  FROM lic_proposta where (data_inscricao >= '2018/06/01' )
  ;
  
  
  
select idproposta, trunc(valor_inicial) as inicial, 
trunc(valor_final) as final from lic_proposta;



SELECT idlicitacao, TRUNC(VALOR_FINAL) AS FINAL FROM LIC_PROPOSTA WHERE SITUACAO = 'S' 
ORDER BY TRUNC(VALOR_FINAL) DESC;



SELECT situacao, to_char(date_trunc('month', DATA_INSCRICAO), 'mm') as mes, 
to_char(date_trunc('year', DATA_INSCRICAO),'yyyy') AS ano , count(*) FROM 
LIC_PROPOSTA WHERE to_char(date_trunc('year', DATA_INSCRICAO),'yyyy') = '2018' 
GROUP BY situacao, to_char(date_trunc('month', DATA_INSCRICAO), 'mm'),
to_char(date_trunc('year', DATA_INSCRICAO),'yyyy')
ORDER BY to_char(date_trunc('month', DATA_INSCRICAO), 'mm'), 
situacao;



SELECT * FROM LIC_MATERIAL WHERE IDCLASSE_MATERIAL = 13 AND NOME LIKE '%ALTURA 925 MM%';



select valor_minimo * quantidade AS valor_minimo_total, 
valor_maximo * quantidade AS valor_maximo_total, idlicitacao from
lic_item_licitacao order by idlicitacao;



SELECT P.NOME, C.NOME, c.uf, 
         CASE (ESFERA)
                                   WHEN 'M' THEN 'Municipal'
                                   WHEN 'E' THEN 'Estadual'
                                   END AS ESFERA
  FROM lic_cidade as C, lic_contratante as P WHERE
  C.NOME = 'Recife' AND C.UF = 'PE'
  ;
  
  
  
SELECT E.NOME as empresa, C.NOME as cidade, E.CNPJ
FROM LIC_CIDADE AS C, LIC_EMPRESA AS E
WHERE E.CNPJ LIKE '%86'
;

SELECT E.NOME as empresa, C.NOME as cidade, E.CNPJ
FROM LIC_CIDADE AS C, LIC_EMPRESA AS E
WHERE E.CNPJ LIKE '________86________'
;

SELECT E.NOME as empresa, C.NOME as cidade, E.CNPJ
FROM LIC_CIDADE AS C JOIN LIC_EMPRESA AS E ON C.IDCIDADE = E.IDCIDADE
WHERE E.CNPJ LIKE '%86'
;



SELECT substring(m.nome, 1, 20) as nome_parcial, trunc(cast(il.quantidade as numeric)) 
as quantidade, trunc(((il.valor_minimo + il.valor_maximo)/2) * cast(il.quantidade as numeric))
AS valor_medio_final FROM lic_material as m join lic_item_licitacao as il 
on m.idmaterial = il.idmaterial where il.idlicitacao = 60 ORDER BY QUANTIDADE;



SELECT l.titulo as nome_licitacao, l.inicio_vigencia, i.quantidade, m.nome as material, 
c.nome as classe FROM lic_licitacao as l join 
lic_item_licitacao as i on l.idlicitacao = i.idlicitacao join lic_material as m on 
i.idmaterial = m.idmaterial join lic_classe_material as c on 
m.idclasse_material = c.idclasse_material where l.idcontratante = 643 and 
to_char(l.data_fechamento, 'mm/yyyy') = '03/2018';



SELECT IDLICITACAO,(QUANTIDADE *(VALOR_MAXIMO -  VALOR_MINIMO)) 
AS DIFERENCA_FINAL FROM LIC_ITEM_LICITACAO
WHERE IDLICITACAO < 105 AND IDLICITACAO > 100;

SELECT  trunc((I.QUANTIDADE *(I.VALOR_MAXIMO -  I.VALOR_MINIMO)),2) AS DIFERENCA, 
I.IDLICITACAO AS LICITACAO FROM LIC_LICITACAO L 
JOIN LIC_ITEM_LICITACAO AS I ON L.IDLICITACAO = I.IDLICITACAO
ORDER BY (I.QUANTIDADE *(I.VALOR_MAXIMO -  I.VALOR_MINIMO)) DESC;

SELECT (QUANTIDADE * VALOR_MAXIMO - QUANTIDADE * VALOR_MINIMO) AS DIFERENCA, IDLICITACAO
FROM LIC_ITEM_LICITACAO ORDER BY DIFERENCA DESC;

SELECT SUM((QUANTIDADE * VALOR_MAXIMO - QUANTIDADE * VALOR_MINIMO)) AS DIFERENCA, IDLICITACAO
FROM LIC_ITEM_LICITACAO GROUP BY IDLICITACAO ORDER BY DIFERENCA DESC;

SELECT  trunc((I.QUANTIDADE *(I.VALOR_MAXIMO -  I.VALOR_MINIMO)),2) AS DIFERENCA, 
I.IDLICITACAO AS LICITACAO FROM LIC_LICITACAO L 
JOIN LIC_ITEM_LICITACAO AS I ON L.IDLICITACAO = I.IDLICITACAO
where l.idlicitacao = 3474
ORDER BY (I.QUANTIDADE *(I.VALOR_MAXIMO -  I.VALOR_MINIMO)) DESC;

select (l.valor_estimado_max - l.valor_estimado_min) as diferenca, l.idlicitacao
from lic_licitacao as l order by diferenca desc;



SELECT P.IDPROPOSTA, P.DATA_INSCRICAO, E.NOME AS EMPRESA, C.NOME AS CIDADE, C.UF AS ESTADO, 
COALESCE(e.cpf, '') || COALESCE(e.cnpj,'') AS CPF_CNPJ, L.TITULO,
L.SITUACAO, IL.QUANTIDADE, IL.OBSERVACAO, M.NOME AS MATERIAL
FROM LIC_PROPOSTA AS P JOIN LIC_EMPRESA AS E ON P.IDEMPRESA = E.IDEMPRESA 
JOIN LIC_CIDADE AS C ON E.IDCIDADE = C.IDCIDADE 
JOIN LIC_LICITACAO AS L ON P.IDLICITACAO = L.IDLICITACAO
JOIN LIC_ITEM_LICITACAO AS IL ON L.IDLICITACAO = IL.IDLICITACAO
JOIN LIC_MATERIAL AS M ON IL.IDMATERIAL = M.IDMATERIAL;



SELECT COUNT(*) FROM LIC_MATERIAL AS M LEFT JOIN LIC_ITEM_LICITACAO AS I 
ON M.IDMATERIAL = I.IDMATERIAL WHERE I.IDMATERIAL IS NULL; 


