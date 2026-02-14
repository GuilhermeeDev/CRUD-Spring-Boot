# 📦 CRUD Spring Boot

Aplicação **CRUD simples** desenvolvida com **Java + Spring Boot** para gerenciamento de produtos.

O projeto permite realizar as operações básicas de:

- Criar produtos  
- Listar produtos  
- Atualizar produtos  
- Deletar produtos  

---

## Tecnologias utilizadas

- Java 25  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- PostgreSQL (Docker)  
- Maven 4+

---

## Como rodar

#### 1. Clone este repositório

```bash
git clone https://github.com/GuilhermeeDev/CRUD-simples.git
cd CRUD-simples
```
#### 2. Rode a aplicação
```
mvnw spring-boot:run
```

#### 3. Rode com Docker
```
docker build -t crud-springboot .
```
```
docker run -d -p 8080:8080 --name crud-springboot crud-springboot
``
