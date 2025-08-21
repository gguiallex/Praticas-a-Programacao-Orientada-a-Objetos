## PRÁTICA SOBRE CONCEITOS BÁSICOS DE ORIENTAÇÃO A OBJETOS

Uma tag de pedágio é um dispositivo eletrônico utilizado para permitir a cobrança automática de
pedágios em rodovias. Ela faz parte de um sistema chamado sistema de cobrança eletrônica de
pedágio e funciona por meio da tecnologia de identificação por radiofrequência (RFID). A tag é
colada geralmente no para-brisa do carro, próxima ao retrovisor. Quando o veículo se aproxima de
uma cabine de pedágio com sistema eletrônico, antenas instaladas detectam o sinal da tag. O
sistema do pedágio lê o código da tag e verifica se há saldo disponível. Se estiver tudo certo, a
cancela abre automaticamente e o valor do pedágio é debitado do saldo da tag.
Seguindo as boas práticas em Programação Orientada a Objetos, implemente em Java uma classe
denominada TagPedagio que represente uma tag. Essa classe deve conter apenas os seguintes
atributos: placa (String), para armazenar o número da placa do veículo que contém a tag; e
saldo (double), para armazenar o saldo da tag.

Implemente essa classe de modo que seja possível criar uma tag informando os valores para
inicializar todos os atributos da classe TagPedagio ou somente o valor do atributo placa.
Sempre que uma tag é criada, o seu saldo inicial deve ser no mínimo igual a R$ 10,00. Portanto, se
somente o atributo placa for informado no momento da criação da tag, o atributo saldo deve ser
inicializado com R$ 10,00. Caso contrário, o valor do crédito passado por parâmetro deve ser
acrescido de R$ 10,00 para definir o valor inicial do atributo saldo. Além disso, você deve
implementar nessa classe:

>> a - Um método denominado atualizarSaldo que permite acrescentar um valor (recebido porparâmetro) ao saldo da tag.

>> b - Um método denominado passarNoPedagio que compara o saldo da tag com o valor do pedágio (recebido por parâmetro) e:

>> I. Se o saldo da tag for suficiente para pagar o pedágio, o valor do saldo é atualizado (o valor do pedágio é debitado do saldo da tag) e a seguinte mensagem é impressa na tela:
>> “Passagem liberada para @placa. Novo saldo: @valor.” (Obs.: @placa e @valor devem corresponder ao número da placa e ao saldo vinculados à tag).

>> II. Se o saldo da tag for insuficiente para pagar o pedágio, a seguinte mensagem é impressa na tela: “Passagem bloqueada para @placa. Saldo insuficiente!” (Obs.: @placa deve corresponder ao número da placa vinculado à tag).

Por fim, no método main da classe App, utilize os métodos criados na classe TagPedagio para
realizar as seguintes tarefas:
I. Crie uma tag informando apenas a placa "ABC1D23". Em seguida, utilize essa tag para
tentar passar em um pedágio que custa R$ 15,00.

II. Crie uma outra tag informando a placa "EFG4H56" e um valor de crédito de R$ 20,00. Em
seguida, atualize o saldo dessa tag colocando mais R$ 15,00 de crédito. Por fim, utilize essa

tag para tentar passar em um pedágio que custa R$ 23,00.
Obs.: Não usar inferência de tipo nem expressão lambda na sua implementação.