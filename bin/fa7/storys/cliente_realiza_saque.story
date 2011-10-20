Narrative:
As a cliente
I want to sacar dinheiro em um caixa eletrônico
In order to que n‹o se tenha que esperar na fila

Scenario: Cliente especial com saldo negativo

Given um cliente especial com saldo atual de -200 reais
When for solicitado um saque no valor 100 reais
Then deve efetuar um saque e atualizar o saldo da conta para -300 reais

When for solicitado um saque no valor 200 reais
Then deve efetuar um saque e atualizar o saldo da conta para -500 reais

