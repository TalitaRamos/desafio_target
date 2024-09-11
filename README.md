
# Desafio Target#  
  
Resolução das questões do desafio desenvolvedor.
  
### Primeira questão: ###  
  
*Resposta: 77
  
### Segunda questão: ###  
  
* a: 11
* b: 128
* c: 64
* d: 100
* e: 13
* f: 200
  
### Terceira questão ###  
  
A questão foi desenvolvida em java. E foi realizada de modo que o array fosse percorrido o mínimo de vezes possível.
Para testar é necessário rodar o arquivo de nome: terceira_questao.java
  
### Quarta questão: ###  
  
Foi desenvolvido um módelo lógico com as seguintes tabelas: cliente, telefone, tipo_telefone e estado. Segue abaixo o modelo e a consulta solicitada: 

![questao_quatro drawio](https://github.com/user-attachments/assets/5fc47740-6ff6-4ee1-9a8f-0638bb5e6553)

    SELECT c.id, c.razao_social, t.numero AS telefone FROM Cliente c JOIN Telefone t ON c.id = t.cliente_id JOIN Estado e ON c.estado_id = e.id WHERE e.codigo = 'SP';

### Quinta questão: ###  

Pode-se considerar que quando o carro e o caminhão se cruzarem na estrada estarão à mesma distância de Ribeirão Petro porque estarão exatamente no mesmo ponto da estrada
