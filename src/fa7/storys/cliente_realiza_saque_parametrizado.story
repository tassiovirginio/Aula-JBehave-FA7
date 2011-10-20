Narrative:
As a cliente
I want to sacar dinheiro em um caixa eletr™nico
In order to que n‹o se tenha que esperar na fila

Meta:
@author Joazinho

Scenario: Cliente especial com saldo negativo
Given um cliente especial com saldo atual de <saldoAtual> reais
When for solicitado um saque no valor <valorDoSaque> reais
Then deve efetuar um saque e atualizar o saldo da conta para <novoSaldo> reais

Examples:
|saldoAtual|valorDoSaque|novoSaldo|
|-200|100|-300|
|-200|200|-400|