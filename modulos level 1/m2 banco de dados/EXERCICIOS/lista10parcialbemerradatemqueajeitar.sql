select f.nomeempregado, fg.nomeempregado as nomegerente, d.nomedepartamento
from empregado as f, empregado as fg, departamento as d where f.idgerente = fg.idempregado and 
d.iddepartamento = f.iddepartamento;

select f.idempregado, f.nomeempregado, f.iddepartamento, f.salario from empregado as f JOIN (SELECT 
empregado.nomeempregado, max(empregado.salario) as ms from empregado
group by salario, nomeempregado) AS suporte ON f.salario = suporte.ms AND 
f.nomeempregado = suporte.nomeempregado order by salario desc;

select  * from empregado order by salario desc;
select * from departamento;



SELECT t.c, t.v
FROM test t
JOIN (SELECT test.c, max(i) as mi FROM test GROUP BY c) j ON
  t.i = j.mi AND
  t.c  = j.c
ORDER BY c