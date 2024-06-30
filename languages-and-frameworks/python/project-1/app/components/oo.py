from abc import ABC, abstractmethod

class Logger(ABC): # classe abstrata
    @abstractmethod
    def log(self, msg):
        print(f'{msg}')

class LoggerWithPrefix(Logger): # especialização da classe Logger
    def __init__(self, prefix):
        self.prefix = prefix

    def log(self, msg):
        print(f'{self.prefix} {msg}')

class LoggerWithStandardPrefix(LoggerWithPrefix):
    def __init__(self):
        self.prefix = LoggerWithPrefix.__name__

def play_oo():
    logger = LoggerWithStandardPrefix()
    # dois underlines: 
    logger.__prefix = 'prefixo_novo: '
    logger.log('Iniciando com orientação a objetos')
    logger.log('Finalizando com orientação a objetos')


# Na orientação a objetos, dar preferência para aplicar herança e polimorfismo em casos é mais pertinente, que irá gerar ganhos 
# como reutilização de código

# ABC # Abstract Base Class
# abstractmethod # método abstrato, que deve ser implementado pelas classes filhas
# No python, o ABC é uma classe que não pode ser instanciada, apenas herdada. O método abstrato é um método que deve ser implementado pelas classes filhas,

#Encapsulamento

# O encapsulamento é um dos pilares da orientação a objetos, que consiste em proteger os atributos e métodos de uma classe, para que eles não sejam acessados diretamente, mas sim através de métodos get e set, que são métodos que permitem acessar e alterar os valores dos atributos de uma classe.
# No python, o encapsulamento é feito através do name mangling, que é um mecanismo que adiciona um prefixo ao nome do atributo ou método, para que ele não seja acessado diretamente.
#Name mangling
# O python não tem modificadores de acesso como o private, protected e public, mas ele tem uma convenção chamada name mangling, que é um mecanismo que adiciona um prefixo ao nome do atributo ou método, para que ele não seja acessado diretamente.
# Ele faz um embaralhamento do nome do atributo ou método, adicionando um underline e o nome da classe, para que ele não seja acessado diretamente, mas ele pode ser acessado, se necessário, mas não é recomendado.
#No geral, classes abstratas são pouco utilizadas no python