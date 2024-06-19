# Terraform

## O que é o Terraform?

Terraform é uma ferramenta de Infrastructure as Code (IaC) que permite definir, provisionar e gerenciar a infraestrutura de TI usando arquivos de configuração legíveis por humanos. Criado pela HashiCorp, o Terraform é utilizado para automatizar a criação e gerenciamento de recursos em provedores de nuvem, serviços e outros provedores de infraestrutura.

## Para que é utilizado?

- **Automatização da Infraestrutura**: Permite a criação e gerenciamento automático de recursos de infraestrutura.
- **Consistência e Reutilização**: Configurações podem ser versionadas e reutilizadas, promovendo consistência entre diferentes ambientes.
- **Gestão de Provedores Múltiplos**: Suporta múltiplos provedores de nuvem e serviços de infraestrutura.

## Em que cenários é útil?

- **Provisionamento de Infraestrutura em Nuvem**: Criação de máquinas virtuais, redes, bancos de dados e outros recursos.
- **Gerenciamento de Configuração de Infraestrutura**: Manutenção e atualização de infraestrutura existente de maneira controlada e versionada.
- **Automação e Integração de DevOps**: Integração com pipelines CI/CD para automação completa do ciclo de vida da infraestrutura.

Por exemplo, pra subir um servidor na AWS, ao invés de acessar o console e configurar manualmente (algo que ficaria "obscuro", não documentado e não replicável), você pode definir um arquivo de configuração Terraform que descreve o servidor, suas configurações e dependências, e executar o Terraform para criar o servidor automaticamente.

## Comandos Básicos

### `terraform validate`
- Verifica se o arquivo de configuração é válido.

### `terraform fmt`
- Formata o arquivo de configuração de acordo com o padrão.

### `terraform plan`
- Exibe o plano de execução, mostrando o que será alterado com as novas mudanças no arquivo de configuração.

### `terraform apply`
- Repete a informação do `plan` e executa as alterações.
