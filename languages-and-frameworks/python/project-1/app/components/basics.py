
from components.utils import logger

def variables():
    # Tipagem dinâmica, não precisa definir o tipo da variável, o python verifica o tipo da variável de acordo com o valor atribuído
    name = "Luma"
    age = 21
    height = 1.64
    numeros = [1, 2, 3, 4, 5]
    numeros_list = list()
    # Python não trabalha com valores primitivos. Mesmo numeros sao considerados objetos
    data = {
        "name": "Luma",
        "age": 21,
        "height": 1.64
    }
    dados_dict = dict()
    # É possível atribuir valores a variáveis de forma dinâmica, tipagem fraca sendo possível alterar o tipo da variável durante o cliclo de vida
    nome = 31
    #Sugestões de tipo:  É possível definir o tipo da variável para "hints" para o interpretador, mas não é obrigatório
    nome: str = "Luma"
    print(name, age, height, numeros, data, nome)

def controle_fluxo():
    logger('Controle de fluxo')
    letras = ['a', 'b', 'c', 'd', 'e']
    logger(letras)
    switch = {
        'a': 'letra a',
    }
    for letra in letras:
        logger(letra)
        logger(switch.get(1, 'padrao'))
