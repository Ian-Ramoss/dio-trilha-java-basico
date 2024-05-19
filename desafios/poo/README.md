# Desafio de POO - Modelagem e Diagramação de um Componente iPhone

Neste desafio da [DIO](https://www.dio.me/), fui responsável por modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.
Tudo foi feito com base no vídeo de lançamento do primeiro [iPhone](https://www.youtube.com/watch?v=9ou608QQRq8).

## Funcionalidades a Modelar

### Reprodutor Musical
- Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`

### Aparelho Telefônico
- Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`

### Navegador na Internet
- Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

## Diagrama UML
### Código:

classDiagram
class iPhone {
+tocar()
+pausar()
+selecionarMusica(String musica)
+ligar(String numero)
+atender()
+iniciarCorreioVoz()
+exibirPagina(String url)
+adicionarNovaAba()
+atualizarPagina()
}

    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet

### Imagem:

![Diagrama UML do iPhone](Print%20do%20diagrama.png)

## Implementação em Java

### Interface ReprodutorMusical

```java
public interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}
```

### Interface AparelhoTelefonico

```java
public interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}
```

### Interface NavegadorInternet

```java
public interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}
```

### Classe iPhone

```java
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação dos métodos de ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando música.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    // Implementação dos métodos de AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    // Implementação dos métodos de NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}
```

### Classe Main

```java 
public class Main {
    public static void main(String[] args) {
        // Cria uma instância de iPhone
        iPhone meuIPhone = new iPhone();

        // Testa os métodos de ReprodutorMusical
        System.out.println("Testando ReprodutorMusical:");
        meuIPhone.tocar();
        meuIPhone.pausar();
        meuIPhone.selecionarMusica("Imagine - John Lennon");

        // Testa os métodos de AparelhoTelefonico
        System.out.println("\nTestando AparelhoTelefonico:");
        meuIPhone.ligar("123-456-7890");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Testa os métodos de NavegadorInternet
        System.out.println("\nTestando NavegadorInternet:");
        meuIPhone.exibirPagina("www.example.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
```
