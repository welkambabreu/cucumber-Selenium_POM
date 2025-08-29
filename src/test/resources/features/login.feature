#language:pt

Funcionalidade: login

  Cenario: Realizar Login 1
    Dado que esteja na url do process
    Quando o login for realizado com
      | usuario | usuario1 |
      | senha   | 123456   |
    Entao valido que o login foi realizado


  Cenario: Realizar Login 2
    Dado que esteja na url do process
    Quando o login for realizado com
      | usuario | usuario2 |
      | senha   | 123456   |
    Entao valido que o login foi realizado


  Cenario: Realizar Login 3
    Dado que esteja na url do process
    Quando o login for realizado com
      | usuario | usuario3 |
      | senha   | 123456   |
    Entao valido que o login foi realizado


  Cenario: Realizar Login 4
    Dado que esteja na url do process
    Quando o login for realizado com
      | usuario | usuario4 |
      | senha   | 123456   |
    Entao valido que o login foi realizado
