# Spring Batch - Exemplos e Estudos Práticos

Este repositório contém uma coleção estruturada de exemplos modulares desenvolvidos com **Spring Batch**, com o objetivo de facilitar o aprendizado, prototipação e demonstração de cenários reais de processamento em lote.

Cada diretório segue um padrão de dupla abordagem:
- `*-start`: ponto de partida para implementação do exemplo.
- `*-solution`: solução completa e funcional do cenário.

## 🚀 Visão Geral do Projeto

O **Spring Batch** é um framework robusto e altamente escalável da Spring para desenvolvimento de aplicações de processamento em lote. Este repositório busca apresentar, de maneira incremental e orientada à prática, os principais conceitos e estratégias comumente aplicados no contexto de batch processing corporativo.

## 📂 Estrutura dos Módulos

Cada pasta representa um cenário distinto. A seguir, uma visão geral dos principais exemplos disponíveis:

| Módulo | Descrição |
|--------|-----------|
| `hello-world` | Exemplo básico de job batch com um `Tasklet` simples. |
| `atomic-processing` | Execução de unidades atômicas de processamento (`TaskletStep`). |
| `chunk-processing` | Abordagem baseada em leitura, processamento e escrita em chunks. |
| `complex-flow` | Fluxos condicionais e jobs compostos com múltiplos steps. |
| `flat-file-reading` | Leitura de arquivos CSV/flat usando `FlatFileItemReader`. |
| `file-reading-partitioning` | Paralelização de leitura de arquivos com particionamento. |
| `database-reading-partitioning` | Estratégia de particionamento baseada em banco de dados. |
| `file-dropping-launching` | Detecção de arquivos em diretório para disparo de jobs. |
| `execution-metadata` | Controle e rastreabilidade da execução via metadados. |
| `dynamic-job-parameters` | Uso de parâmetros dinâmicos para controlar jobs em tempo de execução. |

## 🧠 Objetivo Pedagógico

Este projeto é especialmente útil para:
- Desenvolvedores Java que desejam aprofundar o conhecimento em processamento batch.
- Arquitetos de software que precisam validar estratégias de particionamento, paralelização e controle transacional.
- Equipes que buscam acelerar a adoção de Spring Batch em projetos legados ou modernos.

## 🛠️ Requisitos

- Java 17+  
- Maven 3.8+  
- Spring Boot 3.x  
- IDE recomendada: IntelliJ IDEA ou VSCode com suporte a Spring

## 📦 Como executar um exemplo

Cada pasta contém seu próprio `pom.xml` ou estrutura de projeto Spring Boot. Para rodar:

```bash
cd chunk-processing-solution
./mvnw spring-boot:run
