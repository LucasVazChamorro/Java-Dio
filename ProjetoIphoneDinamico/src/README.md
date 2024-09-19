# Projeto Simulador de iPhone

## Visão Geral

Este projeto implementa um simulador simplificado de iPhone em Java, demonstrando várias funcionalidades tipicamente encontradas em um smartphone. O simulador inclui recursos para reprodução de música, chamadas telefônicas e navegação na web, todos acessíveis através de um sistema de menu baseado em console.

## Estrutura do Projeto

O projeto consiste em vários arquivos Java:

1. `Iphone.java`: Classe base para armazenar informações do proprietário
2. `iPhone1.java`: Classe principal implementando a funcionalidade do iPhone
3. `MusicPlayer.java`: Interface para funções do reprodutor de música
4. `Phone.java`: Interface para funções de telefone
5. `InternetBrowser.java`: Interface para funções do navegador de internet

## Principais Funcionalidades

1. Reprodutor de Música:
    - Tocar, pausar e selecionar músicas
    - Gerenciar uma lista de músicas, artistas e álbuns

2. Telefone:
    - Fazer chamadas e atender chamadas recebidas
    - Gerenciar contatos (adicionar, editar, excluir)
    - Acessar correio de voz

3. Navegador de Internet:
    - Exibir páginas da web
    - Abrir novas abas
    - Atualizar a página atual

4. Informações do Proprietário:
    - Armazenar e exibir dados pessoais do proprietário

## Funcionalidades Java e Lógica de Programação

1. **Programação Orientada a Objetos (POO)**:
    - Herança: `iPhone1` estende `Iphone`
    - Interfaces: `MusicPlayer`, `Phone` e `InternetBrowser`
    - Encapsulamento: Campos privados com getters e setters

2. **Estruturas de Dados**:
    - `ArrayList` para armazenar músicas, artistas, álbuns e contatos

3. **Entrada/Saída**:
    - `Scanner` para entrada do usuário
    - `System.out.println()` para saída

4. **Estruturas de Controle**:
    - Loops `while` para navegação no menu
    - Declarações `switch` para opções do menu
    - `if-else` para lógica condicional

5. **Tratamento de Exceções**:
    - Blocos `try-catch` para validação de entrada

6. **Sobrescrita de Métodos**:
    - Implementação de métodos de interface

7. **Métodos Estáticos**:
    - Método `main()` na classe `iPhone1`

## Princípios de Design Orientado a Objetos

1. **Abstração**:
    - Interfaces definem comportamentos abstratos para reprodutor de música, telefone e navegador

2. **Encapsulamento**:
    - Campos privados na classe `Iphone` com getters e setters públicos

3. **Herança**:
    - `iPhone1` herda de `Iphone`, estendendo sua funcionalidade

4. **Polimorfismo**:
    - `iPhone1` implementa múltiplas interfaces, permitindo que se comporte como um reprodutor de música, telefone e navegador

5. **Princípio da Responsabilidade Única**:
    - Cada classe e interface tem um papel e responsabilidade específicos

## Como Executar

1. Compile todos os arquivos Java:
   ```
   javac *.java
   ```

2. Execute a classe `iPhone1`:
   ```
   java iPhone1
   ```

3. Siga as instruções na tela para navegar pelo sistema de menu do simulador de iPhone.

## Melhorias Futuras

A medida que os estudos em Java forem avançando, irei promover atualizações constantes no projeto.

Pretendo em breve:
1. Implementar uma interface gráfica do usuário (GUI) para uma experiência de iPhone mais realista
2. Adicionar persistência para armazenar dados entre sessões (por exemplo, usando E/S de arquivo ou um banco de dados)
3. Expandir a funcionalidade dentro de cada recurso (por exemplo, playlists para música, histórico de navegação para o navegador)
4. Implementar multithreading para operações simultâneas (por exemplo, tocar música enquanto navega)

Este projeto serve como uma demonstração de conceitos fundamentais de programação Java e princípios de design orientado a objetos, fornecendo uma base para o desenvolvimento de aplicações mais complexas.