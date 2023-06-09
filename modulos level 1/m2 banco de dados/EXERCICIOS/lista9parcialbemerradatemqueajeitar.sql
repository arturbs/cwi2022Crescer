SELECT NOME, COUNT(*) FROM CLIENTE ORDER BY COUNT(*) OVER (PARTITION BY NOME) 
DESC FETCH FIRST 1 ROWS ONLY;
SELECT NOME, COUNT(*) FROM CLIENTE GROUP BY NOME ORDER BY COUNT(*) DESC;

select COUNT(*), SUM(VALORPEDIDO) from pedido where TO_CHAR(datapedido, 'YYYY-MM-DD') like '2018-03%';

SELECT * FROM CLIENTE;

SELECT CID.UF, COUNT(*) AS QUANTIDADECIDADES FROM CIDADE CID 
JOIN CLIENTE CLI ON CLI.IDCIDADE = CID.IDCIDADE GROUP BY CID.UF ORDER BY COUNT(*) DESC; 

SELECT PROD.IDPRODUTO, PROD.NOME FROM PRODUTO PROD 
JOIN PEDIDOITEM PI ON PROD.IDPRODUTO = PI.IDPRODUTO
GROUP BY PROD.IDPRODUTO ORDER BY IDPRODUTO ASC; 

SELECT PROD.NOME FROM PRODUTO PROD
LEFT JOIN PEDIDOITEM PI ON PI.IDPRODUTO = PROD.IDPRODUTO
WHERE PI.IDPRODUTO IS NULL;

SELECT PRODUTO.NOME , PEDIDO.VALORPEDIDO FROM ((PEDIDOITEM INNER JOIN PRODUTO
ON PEDIDOITEM.IDPRODUTO = PRODUTO.IDPRODUTO) INNER JOIN PEDIDO ON 
PEDIDOITEM.IDPEDIDO = PEDIDO.IDPEDIDO);

 select  *
from    PEDIDOITEM pi
join    (
        select  idproduto
        ,       count(*) as myColumnOne
        from    PRODUTO
        group by
                 idproduto
        ) PROD
on      PROD.idproduto = pi.idPRODUTO
join    (
        select  idpedido
        ,       SUM(VALORPEDIDO) as myColumnTwo
        from    PEDIDO
        group by
                idpedido
        ) PED
on      PED.idPEDIDO = PI.idPEDIDO;

SELECT * FROM pedidoitem WHERE idproduto = '3322';

