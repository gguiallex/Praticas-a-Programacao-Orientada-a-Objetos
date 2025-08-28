## PRÁTICA SOBRE CONCEITOS BÁSICOS DE ORIENTAÇÃO A OBJETOS

# ETAPA 1
Este exercício se refere a um programa para ajudar alunos da escola primária no aprendizado da
multiplicação. Nesta primeira etapa, crie uma classe Questao que atenda às necessidades listadas a
seguir. Lembre-se de usar adequadamente a visibilidade (public/private) dos atributos e métodos.
• As questões devem possuir um enunciado e um gabarito, ou seja, a sua resposta correta.
• O construtor dessa classe deve gerar o enunciado do exercício, o qual sempre tem o formato
“Quanto é num1 * num2?”, sendo os dados que compõem esse enunciado (num1 e num2)
devem ser gerados aleatoriamente (entre 0 e 9) utilizando-se o método nextInt da classe
Random do Java (pacote java.util).1

Antes da declaração da classe Questao, não se esqueça da declaração import (import
java.util.Random;) para fazer uso da classe Random.
• Deve existir um método para ser possível consultar o enunciado.
• Deve existir um método que receba por parâmetro a resposta do aluno e retorne um
booleano indicando se o aluno acertou a questão ou não.
Crie uma segunda classe denominada Prova, que atenda aos seguintes requisitos:
• Cada prova deve conter uma única questão.
• Deve existir um método denominado aplicar que, quando chamado, apresente uma questão
para o usuário e obtenha a resposta do mesmo e, a partir dessa resposta, verifique a sua
corretude e imprima na tela uma das mensagens a seguir:
• Muito bem, você acertou!
• Infelizmente você errou!
Para testar o seu programa, crie uma terceira classe denominada App que contenha o método main.
No método main, apenas instancie um objeto da classe Prova e chame o método aplicar.

# ETAPA 2
Altere o método aplicar da classe Prova de modo a permitir que o usuário tenha mais uma chance
de responder corretamente a questão se a primeira resposta dele estiver incorreta. Nesse caso, deve
ser adicionada a seguinte mensagem para o usuário: "Você ganhou mais uma chance! Digite outra
resposta para a questão: ". Além disso, após verificar a corretude da(s) resposta(s), imprima na tela
uma das mensagens a seguir (onde x corresponde ao número de vezes que o usuário respondeu
aquela questão):
• Você tentou x vez(es) e acertou a questão.
• Você tentou 2 vezes e errou a questão. 

# ETAPA 3
Altere sua classe Questao inserindo um atributo que corresponda ao número da questão (por
exemplo, idQuestao). Além disso, crie um método para consultar esse atributo.
Queremos tratar a numeração dos exercícios de forma que ela seja automática (sem precisar ser
informada pelo usuário). Para isso, crie um atributo estático na classe Questao que armazena o
número da última questão criada (inicialmente tem o valor zero). No construtor da classe Questao
esse atributo deve ser incrementado e seu valor usado como o número do exercício que está sendo
criado (ao invés de ser recebido por parâmetro).
Agora, ao apresentar uma questão para o usuário, antes de seu enunciado, exiba na tela uma
mensagem com o número da questão (para que o usuário saiba qual questão ele está respondendo),
como por exemplo, "Questão 1" .
O próximo passo é alterar a implementação da classe Prova para que uma prova seja composta por
várias questões (crie um vetor de questões). Desse modo, cada vez que um objeto da classe Prova
for instanciado, uma prova contendo 5 questões deve ser criada. Portanto, você terá que alterar o
construtor da classe Prova para que isso aconteça. Além disso, a partir de agora, cada vez que o
método aplicar (classe Prova) for chamado, devem ser apresentadas para o usuário cada uma das 5
questões da prova. Todas as mensagens de acerto ou erro de resposta implementadas nas etapas
anteriores devem continuar sendo exibidas para cada questão da prova.