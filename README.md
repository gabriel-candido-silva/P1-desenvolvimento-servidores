# Projeto P1: Sistema Orientado a Objetos - Universo Dragon Ball

Este projeto foi desenvolvido como parte da avaliação da P1 da matéria de **Desenvolvimento de Servidores**. O objetivo principal é aplicar e demonstrar na prática os pilares da **Orientação a Objetos (OO)** utilizando Java, estruturando um sistema temático baseado no universo da obra *Dragon Ball*.


## Objetivo do Tema Escolhido

O tema **Dragon Ball** foi escolhido para modelar um domínio real de entretenimento, dividindo o sistema em duas hierarquias principais:
1. **O Contexto da Obra:** Gerenciamento de informações sobre o desenho, sagas, arcos e episódios específicos.
2. **As Entidades (Personagens):** Modelagem de personagens clássicos divididos por raças (como guerreiros Saiyajins e membros da raça do Freeza), permitindo simular combates e transformações características da obra.


## Conceitos de OO Aplicados

* **Classes e Atributos com Visibilidade:** Uso de modificadores de acesso `private` para garantir o encapsulamento dos dados.
* **Métodos e Construtores:** Inicialização de objetos limpos através de construtores cheios utilizando a palavra-chave `super` para reaproveitamento de código.
* **Encapsulamento:** Métodos *Getters* e *Setters* implementados em todas as classes para acesso e modificação controlada dos atributos.
* **Herança:** 
  * `DragonBall` herda de `Desenho`.
  * `Saiyajin` e `Freeza` herdam de `Personagem`.
* **Reescrita de Método (*Override*):** Sobrescrita do método `mostrarDados()` na classe filha `DragonBall` para exibir informações complementares (Saga, Arco e Episódio).
* **Sobrecarga de Método (*Overload*):** Implementação de variações do método `transformar()` nas classes de personagens, permitindo chamadas sem parâmetros ou recebendo níveis de transformação específicos.


## Estrutura do Projeto

* `Desenho.java`: Superclasse base contendo atributos gerais de obras (nome, ano de lançamento, autor).
* `DragonBall.java`: Subclasse que especializa o desenho adicionando dados de saga, arco e episódio.
* `Personagem.java`: Superclasse base para os indivíduos (nome, raça, idade).
* `Saiyajin.java`: Subclasse de personagem focada nos guerreiros Saiyajins, contendo sobrecarga para transformações.
* `Freeza.java`: Subclasse de personagem focada no antagonista e sua raça, aplicando lógica própria de evolução.
* `Main.java`: Classe principal de execução que simula um episódio e interações de combate entre os personagens.
