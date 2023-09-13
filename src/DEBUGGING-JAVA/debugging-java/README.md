## Debugging Java

Erros de programação são denominados bugs e o processo de encontrar e corrigir os bugs é chamado de depuração ou debugging.

De forma geral, a depuração é uma tarefa difícil e trabalhosa, e a dificuldade varia de acordo com o ambiente de desenvolvimento, o que inclui a linguagem de programação e as ferramentas disponíveis, como depuradores.

Existem duas grandes categorias que englobam a natureza do erro:

- ### Erros de sintaxe:

    É um erro nas regras estabelecidas da linguagem:
    - Parêteses, chaves, colchetes que abrem, mas não fecham.
    - Duas instruções sem um ponto-e-vírgula entre elas;
    - Uma palavra-chave sendo usada numa posição inesperada.

- ### Erros de Semântica

    É um erro na "lógica do código", em sua semântica, o código está sintaticamente correto, porém não faz o que se esperava dele.
    - Tentar dividir um número por uma String ou por zero.
    - Atribuir um valor incorreto a um tipo de dado. Exemplo: int n = "".
    - Tentar fechar um arquivo que não foi aberto.

## Pilha de Execução de um Programa Java/Stack Trace

- ### Pilha de Execução:
Toda invocação de método é empilhada em uma estrutura de dados que isola a área de memória de cada um. Quando um método termina (retorna), ele volta para o método que invocou.

- ### Strack Trace 
É a matriz onde encontramos a pilha de execução da exceção. Em outras palavras, podemos dizer que o rastreamento da pilha busca (rastreio) para a próxima linha onde a exceção pode surgir.
