## Python

Muito popularizada na comunidade científica e acadêmica, Python é uma linguagem de programação de alto nível, interpretada, de script, imperativa, orientada a objetos, funcional, de tipagem dinâmica e forte. 
Cross Plataform, Open Source, Modern, Consistent

## 📕 Recomendações de livros

Learn Python Programming
Patterns of Enterprise Application Architecture. Martin Fowler, 2003.

## Lyfe Cycle

[Status of Python versions](https://devguide.python.org/versions/#versions)


## O que é pyenv?

pyenv é uma ferramenta que permite instalar e gerenciar várias versões do Python em um sistema. Ele é útil para desenvolvedores que trabalham com vários projetos que requerem versões específicas do Python.

## O que é pip?

pip é um sistema de gerenciamento de pacotes usado para instalar e gerenciar pacotes de software escritos em Python. Muitos pacotes podem ser encontrados no [Python Package Index (PyPI)](https://pypi.org/).


# GLI - global intepreter lock

O Global Interpreter Lock, ou GIL, é um mutex que protege o acesso a objetos Python, evitando que várias threads executem código Python simultaneamente. Isso significa que, em um sistema com múltiplos núcleos, o Python não pode aproveitar a paralelização em nível de thread para acelerar a execução de código Python.

## Thread e processamento

Quando subimos um script python, é subido uma thread principal de execução

- Thread: é uma linha de execução de um programa.
- Processo: é um programa em execução.

## GIL: Global Interpreter Lock

O GIL é um mutex que protege o acesso a objetos Python, evitando que várias threads executem código Python simultaneamente. Isso significa que, em um sistema com múltiplos núcleos, o Python não pode aproveitar a paralelização em nível de thread para acelerar a execução de código Python.

O python vai entregar concorrência e não paralelismo:


## Asyncio

É uma biblioteca para escrever código concorrente usando a sintaxe async/await. A biblioteca asyncio foi introduzida na versão 3.4 do Python e é usada para escrever código assíncrono no python.

No entanto, em muitos casos a subida de múltiplos processos é mais eficiente que a subida de múltiplas threads.
Especialmente considerando que o python tem um custo de subir um processo é menor que o custo de subir uma thread.


## Spring Framework

Spring é um framework open source para a plataforma Java, criado para simplificar o desenvolvimento de aplicações Java

## Spring Boot

Spring Boot é um projeto da Spring que visa facilitar o processo de configuração e publicação de aplicações que utilizam o ecossistema Spring + Java, como aplicações web, REST APIs, microservices, etc.