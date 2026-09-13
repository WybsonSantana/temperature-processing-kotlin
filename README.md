# temperature-processing-kotlin

Serviço de **Temperature Processing** da plataforma KSensors, parte da capacidade de negócio de **Monitoramento de Temperaturas**.

## Descrição

Responsável pelo recebimento dos dados dos sensores em tempo real. Este serviço foi separado do Temperature Monitoring Service por motivos técnicos, visando garantir eficiência no processamento de grandes volumes de dados.

## Funcionalidades Principais

- Recebimento de dados em tempo real dos sensores

## Endpoints

| Método | Endpoint | Descrição |
| --- | --- | --- |
| `POST` | `/api/sensors/{sensorId}/temperatures/data` | Recebimento de dados dos sensores via HTTP |

## Objetos de Negócio

### Temperature Log

| Propriedade | Tipo |
| --- | --- |
| Id | UUIDv7 |
| SensorId | TSID |
| Registred At | OffsetDateTime |
| Value | Double |

## Tecnologias Utilizadas

- Linguagem de Programação: Kotlin

## Comunicação com Outros Serviços

- **Assíncrona (mensageria, ex.: RabbitMQ)**: Publica mensagens de novos dados de temperatura recebidos, que são consumidas pelo Temperature Monitoring Service.

## Papel na Solução

Este serviço resolve o problema de **desempenho do dashboard**: é escalado horizontalmente de forma independente para lidar com grande volume de dados de sensores em tempo real, sem impactar os demais serviços da plataforma.
