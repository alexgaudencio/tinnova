# Tinnova - Alex Gaudencio


Para realizar a configuração do banco de dados, criar uma base postgres com o nome "tinnova-alex".

Por padrão o acesso ao banco de dados é: 
- Usuário: postgres
- Senha: 123456

É possível alterar esses dados no arquivo de configuração encontrado no caminho:
- src/main/resources/application.properties

Para ter acesso ao exercícios resolvidos, após rodar o projeto, acessar o endereço do [Swagger](http://localhost:8080/swagger-ui.html).

  
### Exercícios
 [Exercício 1 - Votos em relação ao total de eleitores](http://localhost:8080/swagger-ui.html#/controller-eleitores)
 [Exercício 2 - Algoritmo de ordenação Bubble Sort](http://localhost:8080/swagger-ui.html#/controller-bubble)
 [Exercício 3 - Fatorial](http://localhost:8080/swagger-ui.html#/controller-fatorial)
 [Exercício 4 - Soma dos multiplos de 3 ou 5](http://localhost:8080/swagger-ui.html#/controller-multiplos)
 [Exercício 5 - Cadastro de veículos](http://localhost:8080/swagger-ui.html#/controller-veiculo)
 
 
 ### TODO
 - Os testes unitários não foram realizados;
 - Faltou realizar a distribuição de veículos por décadas;
 - As operações referentes aos veículos são todas realizadas através do Swagger, não sendo implementada uma UI mais completa;