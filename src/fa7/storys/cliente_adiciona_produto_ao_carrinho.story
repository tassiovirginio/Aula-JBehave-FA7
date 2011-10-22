Scenario: Cliente Adiciona ao carrinho

Given que Joaozinho esta logado
Given que Joaozinho tem um carrinho
When um bilhete eh adicionado ao carrinho
Then o bilhete deve estar no carrinho



Scenario: Cliente Adiciona ao Carrinho Composto

Given Joaozinho comprou previamente um bilhete

