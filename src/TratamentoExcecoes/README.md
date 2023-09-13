# Tratamento de Exceções

- Uma exceção é um evento que interrompe o fluxo padrão do programa.
- Com o tratamento de exceções, o programa pode tratar esse problema e continuar o fluxo normalmente.
- **Importante:** ao iniciar o desenvolvimento do programa, já incorpore o sistema de tratamento de exceções.

---------------------------------------------------------------------------
# Tipos de Exceções

- **Error:** Usado pela JVM que serve para inidicar se existe algum problema de recurso do programa, tornando a execução impossível de continuar.

- **Unchecked (Runtime)**: Exceptions que **PODEM** ser evitados se forem tratados e analisados pelo desenvolvedor.

- **Checked Exception**: Exceptions que **DEVEM** ser evitados e tratados pelo desenvolvedor para o programa funcionar.

---------------------------------------------------------------------------
# Tratamento em JAVA

- **try, catch, finally:** Cada uma dessas palavras, juntas, definem blocos para o tratamento de exceções.

- **throws:** Declara que método pode lançar uma ou várias exceções.

- **throw:** Lança explicitamente uma exception.
