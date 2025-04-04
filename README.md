# CONTROLE DE FLUXO - DESAFIO

Projeto criado com base nas instruções do desafio presente em 
*[DIO - Trilha Java Básico](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/controle-fluxo)*

## Qual o objetivo desse projeto?

Criar um programa que lerá pelo terminal dois parâmetros usados para a contagem de 
valores entre o segundo paramêtro e o primeiro. Também tem como objetivo criar uma 
classe exceção para tratar a regra de negócio do projeto.

O segundo parâmetro tem que ser maior que o primeiro, para que seja realizada a 
contagem. Se não for, a exceção criada deve ser lançada e tratada através do bloco:
```
try{
    \\\ bloco de código
} catch (Exception e) {
    \\ Tratamento da possível exceção 
}
```

Caso não haja motivo para a exceção, o programa irá imprimir uma contagem 
começando do número 1 (um) até a diferença entre o parâmetro dois e o parâmetro um.

Por exemplo, se tivermos:

| Parâmetro          | Valor |
|--------------------|-------|
| 1                  | 7     |
| 2                  | 23    |

Faremos 23 - 7 = 16, logo, o programa imprimirá uma contagem de 1 até 16.

Se a diferenças entre os parâmetros for menor ou igual a zero, 
então o programa lançará a exceção, que será mostrada na tela como:

``O segundo parâmetro deve ser menor que o primeiro``
