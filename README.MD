Projeto Guerra
=====================

#### Projeto sobre Design Patterns

## Instruções

Clone o projeto para sua máquina:

```bash
$ git clone https://github.com/danielcostta/guerra.git
```

- Abra o projeto no NetBeans.

## Descrição

- Esse projeto se trata de um cenário de guerra, onde temos um Soldado, que pode mudar estratégia de ataque, mudar seu estado, ser notificado quando se machucar e prestar socorro. Aqui encontramos 4 Patterns: Strategy, Template, State e Observer.

## Sobre o projeto
- Explicação da aplicação dos design patterns.
	
#### Pacote "guerra.EstadoSoldado"

- Onde ficam as classes de estado do "Soldado", que podem ser "Cansado" e "Normal" e que implementam a interface "Estado", aplicando o pattern "State".

#### Pacote "guerra.Frente"

- Onde ficam as classes de principais, a classe abstrata "Soldado", suas sub-classes "Combatente" e "Suporte", aplicando o pattern "Template" e a classe main "Guerra".

#### Pacote "guerra.JeitoDeCombate"

- Onde ficam as classes de jeito de combate do soldado que podem ser "ArmaBranca" ou "ArmaDeFogo" e que implementam a interface "JeitoDeCombate", aplicando o pattern Strategy.

#### Pacote "guerra.UnidadeMedica"

- Onde ficam as classes "Unidade" e "UnidadeMedica" onde a classe "UnidadeMedica" implementa a interface "Unidade", aplicando o pattern "Observer".

## Conclusão

- Esse projeto é um projeto acadêmico que tem por objetivo prática com Design Patterns.
