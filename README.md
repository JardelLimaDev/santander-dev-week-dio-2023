# santander-dev-week-dio-2023
Java RESTFul API criado para o Santander Dev Wek da DIO

### Diagrama de Classes 

```mermaid

classDiagram
  class User {
    - name: String
    - account: Account
    - features: Feature[]
    - card: Card
    - news: News[]
  }

  class Account {
    - number: String
    - agency: String
    - balance: Double
    - limit: Double
  }

  class Feature {
    - pixIcon: String
    - pixDescription: String
  }

  class Card {
    - cardNumber: String
    - cardLimit: Double
  }

  class News {
    - newIcon: String
    - newDescription: String
  }

  User "1" *-- "1" Account
  User "1" *-- "n" Feature
  User "1" *-- "1" Card
  User "1" *-- "n" News

```
### Estrutura JSON para criar o diagrana de classes através da sintaxe Mermaid

```json
{
  "name": "Jardel",
  "accoutn": {
    "Number": "00000000-00",
    "Agency": "0000",
    "Balance": 1324.64,
    "Limit": 1000.0
  },
  "features": [
    {
      "pixIcon": "URL",
      "pixDescription": "PIX Descrição"
    }
  ],
  "card": {
    "cardNumber": "xxxx xxxx xxxx 0000",
    "cardLimit": 1000.00
  },
  "news": [
    {
      "newIcon": "URL",
      "newDescription": "O Santander tem soluções de crédito sob medida pra você."
    }
  ]
}
```
