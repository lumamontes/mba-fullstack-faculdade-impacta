class Person():
    def __init__(self, height ,weight):
        self.height = height
        self.weight = weight
        self.imc = 0
        self.imc_description = ""

    def from_dict(dictionary):
        height = dictionary['height']
        weight = dictionary['weight']
        
        p = Person(height, weight)
        return p
    
    def as_dict(self):
        d = dict()
        d['height'] = self.height
        d['weight'] = self.weight
        d['imc'] = self.imc
        d['imcDescription'] = self.imc_description
        return d

def calculate_imc(person):
    person.imc = person.weight / (person.height ** 2)

def calculate_imc_description(person):
    person.imc_description = 'Obesidade'
    if (person.imc < 18.5): person.imc_description = 'Magreza'
    if (person.imc < 24.9): person.imc_description = 'Normal'
    if (person.imc < 30.0): person.imc_description = 'Sobrepeso'
    
def calculate(person):
    calculate_imc(person)
    calculate_imc_description(person)