# Cloud Automation

## Conceitos básicos

## Cloud Computing

- **Agilidade e Redução de Custo** no provisionamento de infraestrutura e na operação
- **Escalabilidade**
- **Disponibilidade**
- **Abstração da Infraestrutura**

## Modelo de Serviço de Cloud

### On-Premises Solution
- A própria empresa compra máquinas e monta seu próprio data-center.
- Utiliza servidores físicos ou virtualização.

### IaaS (Infrastructure as a Service)
- Infraestrutura como serviço.
- Modelo parecido com on-premises.

### PaaS (Platform as a Service)
- Plataforma como serviço.
- Mais acesso à escalabilidade e alta disponibilidade.

### SaaS (Software as a Service)
- Comprado por algum racional de uso.

## Principais Players de Nuvem

### Amazon Web Services (AWS)
- Amplamente utilizado, oferece uma vasta gama de serviços.

### Microsoft Azure
- Integração robusta com produtos Microsoft.

### Google Cloud Platform (GCP)
- Conhecido por suas capacidades de machine learning e big data.


## Estrutura de Regiões e Zonas

- **Região (Region):** A região geográfica onde os recursos estão localizados.
- **Zona de Disponibilidade (AZ - Availability Zone):** Subdivisões dentro de uma região que isolam falhas de outras zonas.
- **Data Center (DC):** Instalações físicas dentro de uma zona de disponibilidade onde os recursos de computação são hospedados.

## Estratégias de Migração para a Cloud

A migração para a nuvem é um passo importante para muitas organizações, permitindo maior escalabilidade, flexibilidade e eficiência. Abaixo estão as estratégias recomendadas para iniciar sua jornada para a nuvem:

### Tipos de Estratégia

- **Avaliação e Planejamento:** Antes de iniciar a migração, é crucial avaliar suas necessidades atuais e futuras, bem como planejar a migração de forma a minimizar interrupções.

- **Re-hospedagem ("Lift and Shift"):** Esta estratégia envolve mover suas aplicações e dados para a nuvem com poucas ou nenhuma modificação. É uma forma rápida de migrar para a nuvem, mas pode não ser a mais eficiente em termos de custo e desempenho a longo prazo.

- **Refatoração:** Modificar e adaptar suas aplicações para melhor aproveitar os serviços e recursos nativos da nuvem. Esta abordagem pode exigir mais esforço inicial, mas resulta em maior eficiência e escalabilidade.

- **Replataformização:** Adaptação da aplicação para mudar sua base de tecnologia sem alterar o núcleo funcional. Isso pode incluir a mudança de bancos de dados ou a adoção de serviços gerenciados.

- **Reconstrução:** Redesenhar e reescrever a aplicação do zero, aproveitando as tecnologias modernas e as práticas de desenvolvimento. Esta é a abordagem mais demorada, mas pode oferecer os melhores resultados em termos de desempenho e escalabilidade.

# Estratégias de Implantação

## Blue-Green Deployment

O Blue-Green Deployment é uma estratégia de implantação que visa reduzir o tempo de inatividade e os riscos associados ao lançamento de novas versões de uma aplicação. Essa abordagem envolve manter duas ambientes de produção quase idênticos, conhecidos como Blue e Green.

### Passos:

1. **Cria versão 1 (Blue):** A versão atual em produção.
2. **Cria versão 2 (Green):** A nova versão da aplicação, que é preparada e testada em um ambiente de produção paralelo.
3. **Direciona tráfego para a versão nova (Green):** Uma vez que a nova versão (Green) está pronta e testada, o tráfego é gradualmente direcionado para ela, geralmente através de alterações na configuração do balanceador de carga. Se tudo correr bem, a Green se torna a nova produção.

### Vantagens:

- Minimiza o tempo de inatividade durante a implantação.
- Permite um rollback rápido caso algo dê errado, simplesmente redirecionando o tráfego de volta para o ambiente Blue.

## Implantação Contínua

A Implantação Contínua é uma prática de DevOps onde cada alteração no código, após passar pelos estágios de teste, é automaticamente liberada para o ambiente de produção. Isso permite uma entrega mais rápida de recursos e correções.

### Características:

- **Alteração incremental:** As mudanças são feitas em pequenos incrementos, o que facilita a detecção e correção de erros, além de reduzir o risco associado a cada implantação.

### Vantagens:

- Permite uma entrega mais rápida e frequente de melhorias e novas funcionalidades.
- Melhora a satisfação do cliente, pois as respostas às necessidades e correções de bugs são implementadas rapidamente.
- Encoraja a automação dos testes e do processo de implantação, aumentando a eficiência e a confiabilidade.

Ambas as estratégias, Blue-Green Deployment e Implantação Contínua, são fundamentais para modernas práticas de entrega de software, permitindo que as organizações implementem novas funcionalidades e correções com maior rapidez, segurança e eficiência.


Para mais informações e detalhes sobre cada estratégia, consulte a documentação oficial da sua plataforma de nuvem escolhida.

