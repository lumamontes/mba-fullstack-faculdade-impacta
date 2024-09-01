from flask import Flask, jsonify, request
from imc_calculator import Person, calculate

app = Flask(__name__)

@app.route('/')
def hello():
    return 'hello!'

@app.route('/imc/calculate', methods=['POST'])
def calculate_imc():
    person = Person.from_dict(request.json)
    calculate(person)

    return jsonify(person.as_dict())


app.run(host="localhost", port=8080, debug=True)