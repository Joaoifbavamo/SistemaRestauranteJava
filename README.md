# Sistema de Gerenciamento de Restaurante

Trabalho de LP1 — **Grupo B**.

Sistema em Java que simula as operações básicas de um restaurante: cadastro de mesas e produtos, abertura de pedidos, adição de itens, cálculo do total e finalização do atendimento.

## Objetivo

Aplicar, na prática, os conceitos de Programação Orientada a Objetos estudados na disciplina: classes e objetos, atributos e métodos, encapsulamento, construtores, relacionamento entre objetos, depuração e recursividade.

## Funcionalidades

- Cadastro de mesas (número e capacidade)
- Cadastro de produtos do cardápio (nome, preço e disponibilidade)
- Abertura de pedido vinculado a uma mesa disponível
- Adição de produtos (com quantidade) a um pedido
- Cálculo do valor total do pedido — versão iterativa e versão recursiva
- Finalização do pedido, liberando a mesa
- Consulta das mesas disponíveis no momento

## Estrutura das classes

| Classe | Responsabilidade |
|---|---|
| `Produto` | Representa um item do cardápio (nome, preço, disponibilidade) |
| `Mesa` | Representa uma mesa física (número, capacidade, disponibilidade) |
| `Cliente` | Representa o cliente atendido (nome, CPF, telefone) |
| `ItemPedido` | Representa um produto pedido, com sua quantidade |
| `Pedido` | Reúne os itens pedidos em uma mesa e concentra as regras de negócio |
| `Restaurante` | Gerencia as listas de mesas, produtos e pedidos do sistema |

## Regras de negócio implementadas

- Uma mesa não pode ter dois pedidos ativos simultaneamente
- Não é permitida a inclusão de produto indisponível em um pedido
- Um pedido precisa ter pelo menos um item para ser finalizado
- O valor total é calculado a partir dos produtos e suas quantidades
- Ao finalizar um pedido, a mesa correspondente volta a ficar disponível

## Diagrama de classes

![Diagrama de classes do sistema](diagrama_classes.png)

## Como executar

1. Compile todas as classes:
   ```
   javac *.java
   ```
2. Execute a classe principal:
   ```
   java Main
   ```

## Exemplo de uso (Main.java)

```java
Restaurante restaurante = new Restaurante();

Mesa mesa1 = new Mesa(1, 4);
restaurante.cadastrarMesas(mesa1);

Produto produto1 = new Produto("Produto Genérico", 20.0);
restaurante.cadastrarProduto(produto1);

Pedido pedido1 = restaurante.abrirPedido(mesa1);
pedido1.adicionarProduto(produto1, 5);

System.out.println(pedido1.calcularTotal()); // 100.0

pedido1.finalizarPedido();
```

## Integrantes — Grupo B

- [nome do integrante 1]
- [nome do integrante 2]
- [nome do integrante 3]

## Dificuldades encontradas

[Preencher com as dificuldades reais do grupo durante o desenvolvimento.]
