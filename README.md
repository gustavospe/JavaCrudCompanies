# 🏢 Sistema de CRUD de Empresas em Java

Este projeto demonstra todos os conceitos fundamentais de Programação Orientada a Objetos (POO) por meio de um simples sistema de gerenciamento de empresas.

## 📚 Conceitos de POO Demonstrados

### 1. **Encapsulamento** 🔒
- Atributos privados nas classes
- Métodos getter e setter para acesso controlado
- Lista de empresas encapsulada no gerenciador

### 2. **Herança** 👨‍👩‍👧‍👦
- Classe abstrata `Company` como classe pai
- Classes `PrivateCompany` e `PublicCompany` herdam de `Company`
- Reutilização de código por meio da herança

### 3. **Polimorfismo** 🎭
- Métodos abstratos implementados de forma diferente em cada classe filha
- Sobrescrita de métodos (`@Override`)
- Interface `CrudOperations` implementada pela classe `CompanyManager`

### 4. **Abstração** 🎨
- Classe abstrata `Company` com métodos abstratos
- Interface `CrudOperations` define contratos
- Ocultação dos detalhes de implementação

## 🚀 Como Executar

### Pré-requisitos
- Java 11 ou superior
- Maven 3.6 ou superior

### Executando o projeto
```bash
# Compile o projeto
mvn compile

# Execute o programa
mvn exec:java
```

## 📋 Funcionalidades

- ➕ **Criar**: Adicionar novas empresas (privadas ou públicas)
- 📋 **Listar**: Ver todas as empresas registradas
- 🔍 **Buscar**: Encontrar empresa pelo CNPJ
- ✏️ **Atualizar**: Modificar dados de empresas existentes
- 🗑️ **Deletar**: Remover empresas do sistema
- 📊 **Estatísticas**: Ver resumo dos dados

## 🏗️ Estrutura do Projeto

```
src/main/java/com/companies/
├── model/
│   ├── Company.java          # Classe base abstrata
│   ├── PrivateCompany.java   # Herda de Company
│   └── PublicCompany.java    # Herda de Company
├── service/
│   ├── CrudOperations.java   # Interface (abstração)
│   └── CompanyManager.java   # Implementa CRUD
└── Main.java                 # Classe principal
```

## 💡 Características do Código

- ✅ **Sintaxe simples** e fácil de entender
- ✅ **Comentários em português** para usuários brasileiros
- ✅ **Código limpo** e bem estruturado
- ✅ **Demonstração prática** de todos os conceitos de POO
- ✅ **Interface de console amigável**

## 🎯 Objetivos Educacionais

Este projeto foi criado para:
- Demonstrar os 4 pilares da POO na prática
- Mostrar como aplicar conceitos teóricos em código real
- Fornecer um exemplo completo de sistema CRUD
- Servir como base para estudos de Java e POO
