# Lista Avaliativa II (Padrões de Projeto)

## Questão 1 – Arquivo de Configuração (Padrão Singleton)

### Enunciado resumido
Criar um sistema que lê um arquivo `config.ini` apenas uma vez e mantém os dados carregados em memória.  
Usar o padrão **Singleton** para garantir que só exista **uma instância** da configuração.

### Objetivo
Ilustrar o uso do padrão **Singleton**, garantindo acesso global a um arquivo de configuração centralizado sem reler o arquivo várias vezes.

### Como executar
1. Coloque o arquivo `config.ini` e as classes `.java` dentro de `src/`
2. Compile:
   ```bash
   javac *.java
   ```
3. Execute:
   ```bash
   java Main
   ```

