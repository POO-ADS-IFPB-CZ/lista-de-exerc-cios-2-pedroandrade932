[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/zaY_p4dR)

	Explique por que é considerado boa prática usar getters e setters em vez de tornar os atributos públicos em uma classe. Dê um exemplo onde usar um setter permite controlar melhor a integridade dos dados de um objeto.


A principal razão está no princípio do encapsulamento, que consiste na proteção do estado interno de um objeto, controlando seu acesso e modificação. Existe também a possibilidade de validação do valor atribuído, e da opção de outras implementações.

	Considere que você está modelando um sistema de controle de biblioteca. Responda:
--------
	Quais informações você considera relevantes para representar um livro em um sistema?

identificação, título, nome do autor, editora, ano de publicação, edição e gênero.

	Por que podemos dizer que uma classe Livro seria uma abstração no seu código?

Pois a classe descarta os detalhes irrelevantes do livro para o código, deixando apenas o essencial para uso.

	Liste ao menos 3 métodos que fariam sentido existir nessa classe.

searchBook, addBook, removeBook, editBook.
