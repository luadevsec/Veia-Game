# Veia Game

**Veia Game** é um jogo da velha (tic-tac-toe) para mobile, projetado com uma arquitetura que facilita a expansão e a adição de novos modos de jogo. Este projeto foi criado para ser entregue como trabalho na faculdade, com o intuito de demonstrar conceitos aprendidos e proporcionar uma base para melhorias contínuas.

## Intuito

Desenvolver um jogo da velha para dispositivos móveis, permitindo melhorias contínuas e aplicações de conceitos vistos na faculdade. O projeto visa:

- Servir como base para treinamento de inteligência artificial.
- Realizar testes e experimentações com diferentes modos de jogo.
- Eventualmente lançar uma versão na Google Play.

## Arquitetura Atual

- **Padrão Arquitetural**: MVVM Components
- **Tecnologias Utilizadas**: Jetpack Compose

## Compatibilidade

- **Requerimentos Mínimos**: Android 8.1 (API 27) ou superior


## Licença

Este projeto está licenciado sob a [Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License](https://creativecommons.org/licenses/by-nc-sa/4.0/).

[![CC BY-NC-SA 4.0](https://licensebuttons.net/l/by-nc-sa/4.0/88x31.png)](https://creativecommons.org/licenses/by-nc-sa/4.0/)

Você é livre para:

- Compartilhar — copiar e redistribuir o material em qualquer suporte ou formato
- Adaptar — remixar, transformar, e criar a partir do material

Sob os seguintes termos:

- Atribuição — Você deve dar crédito apropriado, prover um link para a licença, e indicar se mudanças foram feitas. Você pode fazê-lo de qualquer forma razoável, mas não de maneira que sugira que o licenciante apoia você ou o seu uso.
- Uso Não Comercial — Você não pode usar o material para fins comerciais.
- Compartilhamento pela mesma Licença — Se você remixar, transformar, ou criar a partir do material, tem de distribuir as suas contribuições sob a mesma licença que o original.

Não há garantias. A licença pode não lhe oferecer todas as permissões necessárias para o uso pretendido. Para propósitos legais, consulte os [termos completos da licença](https://creativecommons.org/licenses/by-nc-sa/4.0/legalcode).


## MVP

- **Jogo da Velha Clássico**: Dois jogadores localmente.
- **Jogo da Velha Infinito**: Sempre há 3 peças de cada jogador no tabuleiro. Quando uma nova peça é adicionada, a mais antiga desaparece, dando lugar à nova peça.

## Roadmap

### Telas e Funcionalidades

- **Tela Inicial**: Exibir logo e botões para selecionar o modo de jogo.
- **Tela de Escolha de Modo**:
  - 1 Jogador (solo vs robô)
  - 2 Jogadores (localmente)
- **Tela do Jogo da Velha Clássico**: Implementar a interface e lógica do jogo clássico.

### Backend e Lógica

- Implementar a lógica de jogo para o Jogo da Velha Clássico.

## Estrutura de Branches

O desenvolvimento do projeto utiliza uma estrutura de branches específica para organizar o trabalho e as colaborações:

- **`main`**: Branch principal para o código estável e pronto para produção.
- **`faculdade`**: Branch para entregar a versão do projeto para a faculdade.
- **`dev`**: Branch para desenvolvimento oficial e contribuições da equipe.
- **`design`**: Branch para melhorias e implementações de design que não impactem a lógica do jogo.
- **`devColab`**: Branch para contribuições de desenvolvimento de colaboradores externos.
- **`designColab`**: Branch para contribuições de design de colaboradores externos.

### Diretrizes para Contribuição

- **Nomeie as Contribuições**: As colaborações devem sempre incluir o nome do colaborador na descrição do pull request para que possamos adicionar aos créditos.
- **Pull Requests**:
  - Para a branch `faculdade`, envie pull requests específicos para entregar as versões relacionadas à faculdade.
  - Para a branch `dev`, colaborações de desenvolvimento da equipe oficial.
  - Para a branch `design`, melhorias de design feitas pela equipe oficial.
  - Para `devColab` e `designColab`, pull requests de colaboradores externos.

### Ferramentas Recomendadas

Para evitar erros de pull request e commit, é altamente recomendado o uso de gerenciadores de Git, tais como:

- [**GitHub Desktop**](https://desktop.github.com/)
- [**GitKraken**](https://www.gitkraken.com/)
- [**Sourcetree**](https://www.sourcetreeapp.com/)
- [**Tower**](https://www.git-tower.com/)
- [**Git Extensions**](https://gitextensions.github.io/)

O uso dessas ferramentas facilita o processo de versionamento e colaboração, garantindo que os colaboradores mantenham o controle adequado de suas mudanças e que os contribuintes recebam crédito pelo seu trabalho.

## Contribuição

Contribuições são bem-vindas! Por favor, siga as diretrizes abaixo para colaborar com o projeto:

1. **Fork o Repositório**: Crie uma cópia do projeto no seu GitHub.
2. **Clone o Repositório**: Clone o fork para a sua máquina local.
   ```bash
   git clone https://github.com/sua-conta/veia-game.git
   ```
3. **Crie uma Branch**: Crie uma nova branch para a sua feature ou correção. Use as branches `devColab` ou `designColab` conforme apropriado.
   ```bash
   git checkout -b feature/nova-feature
   ```
4. **Faça Commit das Suas Mudanças**: Comente suas mudanças com mensagens claras, incluindo seu nome na descrição.
   ```bash
   git commit -m "Adicionar nova feature - Nome do Colaborador"
   ```
5. **Push para a Branch**: Envie suas mudanças para o GitHub.
   ```bash
   git push origin feature/nova-feature
   ```
6. **Abra um Pull Request**: Envie um pull request para revisão na branch apropriada.

## Instalação e Execução

1. **Clone o Repositório**:
   ```bash
   git clone https://github.com/Luadevsec/veia-game.git
   ```
2. **Abra o Projeto no Android Studio**.
3. **Build o Projeto**: Certifique-se de que todas as dependências estão corretamente instaladas.
4. **Execute o Aplicativo**: Execute o aplicativo em um emulador ou dispositivo físico.

## Colaboradores

- **Lunna Cipher** - [@Luadevsec](https://github.com/Luadevsec)
- **Dany Paes** - [@DanyPLS](https://github.com/DanyPaes)

## Contato

Para mais informações, entre em contato com **Lunna Cipher**:
- **GitHub**: [@Luadevsec](https://github.com/Luadevsec)
- **Email**: [lunna.devsec@gmail.com](mailto:lunna.devsec@gmail.com)

---

[![GitHub](https://img.shields.io/badge/GitHub-LunnaCipher-blue)](https://github.com/Luadevsec)