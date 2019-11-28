# Implementação de 3 design patterns em um mesmo problema

* ## **Integrantes:**
 
_Lêda Taís Silva._  

* ## **Descrição**:

Foi proposto à criação de um cenário para fazer uma implementação em Java utilizando 3 designs patterns vistos na disciplina de Análise de Desenvolvimento de Sistemas. 
O cenário escolhido para o trabalho foi onde era necessário criar um relatório, onde ele pode ser um arquivo em PDF, TXT ou CSV, além disso, o mesmo pode ser zipado ou criptografado. Após o arquivo ser criado e finalizado é possível buscar o arquivo do relatório na rede, na cloud ou no local.


* ## **Design Patterns Implementados**:

**Bridge: ** Tem o objetivo de fornecer opções possíveis para que se possa executar uma ação em determinado momento.

Na pasta finalizarRelatorios tem-se o arquivo Modo que é uma interface e funciona em como aquela informação vai ser processada, dentro dela tem o método finalizar. As classes que implementam essa interface como o modo de finalizar são as classes  Cript (Criptografar) e Zip (Zipar). 

**Vantagem: **Elimina múltiplas heranças e reduz a quantidade de classes existentes no projeto.

**Template : **Define passos de um algoritmo, permitindo que alguns desses passos sejam implementados por subclasses. Na classe abstrata temos métodos abstratos, concretos e finais.  

A pasta relatorios está o que vai ser processado, nessa pasta se encontra a classe abstrata relatório e nela contém a implementação de métodos para realizar operações e envia solicitação para as classes PDF, TXT e CSV para que seja informado o tipo de arquivo que será exportado para o Modo que é usado na Bridge. 

**Vantagem: ** Poder reutilizar código sem perder o controle dos algoritmos. 

**Chain of Responsibility: ** Mantém um ponteiro como "próximo". Cada classe derivada implementa sua própria contribuição para manusear o pedido (request). Se o pedido precisa ser passado para outra classe, então a classe derivada "chama de volta" à classe padrão, delegando um novo ponteiro.  O usuário cria e encadeia a cadeia, a qual pode incluir uma ligação do último nó até o nó da raiz. O usuário lança e deixa cada request com a raiz da cadeia. 
A chain foi utilizada  no caso para fazer  uma busca onde um arquivo está localizado, na cloud, na rede ou no local, utilizando a classe abstrata BuscadorArquivo.  

**Vantagem: ** Pode-se ter responsabilidade que são intercambiáveis.

Tudo é demonstrado na classe main, mostrando qual o formato de arquivo foi criado, a forma como ele foi finalizado e a partir da busca onde ele está localizado.