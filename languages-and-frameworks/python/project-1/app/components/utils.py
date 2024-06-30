def logger_builder(prefix='prefixo: '):
    def logger(msg): # ./closure que vai ter acesso ao escopo lexixo da funcao logger_builder
        print(f'{prefix} {msg}')
    return logger

logger = logger_builder('prefixo_novo: ')

# //lambda: funcoes anonimas, forma simplificada de botar a estrutura sintatica pra quando so tem 1 parametro
# def logger_builder(prefix='prefixo: '):
#     return lambda msg: print(f'{prefix} {msg}')
