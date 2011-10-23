Narrativa:
Como um cliente
Desejo sacar dinheiro em um caixa eletronico
Para obter que não se tenha que esperar na fila

Cenário: Cliente especial com saldo negativo

Dado que um cliente especial com saldo atual de -200 reais
Quando for solicitado um saque no valor 100 reais
Então deve efetuar um saque e atualizar o saldo da conta para -300 reais

Quando for solicitado um saque no valor 200 reais
Então deve efetuar um saque e atualizar o saldo da conta para -500 reais

