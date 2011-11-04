Narrative:
As a Jogador
I want to informar a senha And o jogo me informe se acertei
In order to eu possa vencer o jogo

Scenario: Todos
Given um Jogo que a senha e <senhaCorreta> e o nome do jogador e <nomeJogador>
When eu informo a senha <senhaInformada>
Then o jogo me exibe um texto <contraSenha> e pergunta se deseja jogar novamente

Examples:
|senhaCorreta|senhaInformada|contraSenha|nomeJogador|
|1232|1232|Parabéns, Luana você quebrou a senha!|Luana|
|1232|4444|----|Luana|
|1232|2321|////|Luana|
|1232|1235|Dígito Inválido!!|Luana|
|1232|1432|+++-|Luana|
|1233|1244|++--|Luana|
|1232|1322|++//|Luana|
|1232|4232|+++-|Luana|
|1233|2334|+//-|Luana|
|1233|0000|Até a próxima!|Luana|
|1232|1232|Parabéns, Luana você quebrou a senha!|Luana|
|1232|4444|----|Luana|
|1232|2321|////|Luana|
|1232|1235|Dígito Inválido!!|Luana|
|1232|1432|+++-|Luana|
|1233|1244|++--|Luana|
|1232|1322|++//|Luana|
|1232|4232|+++-|Luana|
|1233|2334|+//-|Luana|
|1233|2334|+//-|Luana|
|1233|0000|Foi exedido o numero maximo de tentativas.|Luana|



