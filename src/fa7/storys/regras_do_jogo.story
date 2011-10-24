Narrative:
As a Jogador
I want to informar a senha And o jogo me informe se acertei
In order to eu possa vencer o jogo

Scenario: Jogador acerta a senha completamentamente
Given um Jogo que a senha é 1234
When eu informo a senha 1234
Then o jogo me exibe um texto ++++

Scenario: Jogador erra completamente todos os dígitos
Given um Jogo que a senha é 1233
When eu informo a senha 4444
Then o jogo me exibe um texto ----

Scenario: Jogador erra a posição de todos os dígitos
Given um Jogo que a senha é 1234
When eu informo a senha 4321
Then o jogo me exibe um texto ////

Scenario: Jogador informa dígito fora dos limites
Given um Jogo que a senha é 1234
When eu informo a senha 1235
Then o jogo me exibe um texto Dígito Inválido!!

Scenario: Jogador erra completamente o ultimo dígito
Given um Jogo que a senha é 1233
When eu informo a senha 1234
Then o jogo me exibe um texto +++-

Scenario: Jogador erra completamente os 2 ultimos dígito
Given um Jogo que a senha é 1233
When eu informo a senha 1244
Then o jogo me exibe um texto ++--

Scenario: Jogador erra a ordem dos 2 ultimos dígitos
Given um Jogo que a senha é 1234
When eu informo a senha 1243
Then o jogo me exibe um texto ++//

Scenario: Jogador erra completamente o primeiro dígito
Given um Jogo que a senha é 1224
When eu informo a senha 3224
Then o jogo me exibe um texto +++-

Scenario: Jogador erra completamente o primeiro dígito
Given um Jogo que a senha é 1233
When eu informo a senha 2334
Then o jogo me exibe um texto +//-