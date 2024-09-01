
## Data Persistence 



### Relacional X Não Relacional


### O que é ORM?


### Porquê adotar ORM? 

Pra otimizar o fluxo de trabalho


### Qual ORM escolher ?

TypeORM
npx typeorm init --name MyProject --database mysql

Drizzle
Prisma

npm init -y
npm install typescript ts-node @types/node --save-dev
npm install prisma --save-dev
npm install @prisma/client --save-dev
npx tsc --init
npx prisma init --da

Sequelize




## Persistência de dados


## Table Data Gateway 

An object that acts as a Gateway (466) to a database table. One instannce handles all the rows in the table.


## Row Data Gateway 

An object that acts as a Gateway (466) to a single record in the database. One instance handles all the database access.

## Active Record

An object that wraps a row in a database table or view, encapsulates the database access, and adds domain logic on that data.


## Data Maper 

A layer of Mappers that moves data between objects and a database while keeping them independent of each other and the mapper itself 

Aplicabilidade: onde usar um Data Mapper x um Active Record