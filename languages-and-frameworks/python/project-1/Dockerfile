# Dockerfile

# Use uma imagem base do Python
FROM python:3.9-slim

# Defina o diretório de trabalho no contêiner
WORKDIR /app

# Copie o arquivo de requisitos para o contêiner
COPY requirements.txt .

# Instale as dependências
RUN pip install --no-cache-dir -r requirements.txt

# Copie o conteúdo do diretório atual para o contêiner
COPY . .

# Defina o comando padrão para executar quando o contêiner iniciar
CMD ["python", "app/main.py"]
