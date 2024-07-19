## Diagramação de classes do iPhone

Este repositório contém uma implementação detalhada de um desafio de modelagem de software para representar um iPhone, usando princípios de programação orientada a objetos e modelagem UML. O projeto abrange três funcionalidades principais do iPhone: Reprodutor Musical, Aparelho Telefônico e Navegador na Internet. Inclui o código-fonte em Java, documentação completa, insights de design e instruções para executar o código e explorar o diagrama UML associado. Este projeto oferece uma oportunidade de aprender e aplicar melhores práticas de engenharia de software.


This repository contains a detailed implementation of a software modeling challenge to represent an iPhone, using object-oriented programming principles and UML modeling. The project covers three main functionalities of the iPhone: Music Player, Telephone, and Internet Browser. It includes Java source code, comprehensive documentation, design insights, and instructions to run the code and explore the associated UML diagram. This project provides an opportunity to learn and apply best practices in software engineering.

## 📊 Diagrama UML

![alt text](<Diagrama em branco (1).png>)


Classe Dispositivo

Dispositivo(String modelo, String versaoOS): Construtor que inicializa o modelo e a versão do OS.

void iniciar(): Método para iniciar o dispositivo.

void desligar(): Método para desligar o dispositivo.

Classe ReprodutorMusical

Classe que representa um reprodutor musical.


ReprodutorMusical(String faixaAtual, int volume): Construtor que inicializa a faixa e o volume.

void tocar(): Método para tocar a música.

void pausar(): Método para pausar a música.

void parar(): Método para parar a música.

void proximaFaixa(): Método para ir para a próxima faixa.

void faixaAnterior(): Método para voltar para a faixa anterior.

void aumentaVolume(): Método para aumentar o volume.

void baixarVolume(): Método para diminuir o volume.


Classe Telefone
Classe que representa um telefone.

Telefone(): Construtor que inicializa a chamada atual como null.

void fazerChamada(String numero): Método para fazer uma chamada.

void terminarChamada(): Método para terminar uma chamada.

void atenderChamada(): Método para atender uma chamada.

Classe Navegador
Classe que representa um navegador de internet.

Navegador(): Construtor que inicializa o histórico como uma lista vazia.

void carregarPagina(String url): Método para carregar uma nova página.

void atualizar(): Método para atualizar a página atual.

void voltar(): Método para voltar para a página anterior no histórico.

void avancar(): Método para avançar para a próxima página no histórico.


Classe Iphone
Classe que representa um iPhone, herda de Dispositivo e agrega funcionalidades de ReprodutorMusical, Telefone e Navegador.

Iphone(String modelo, String versaoOS, ReprodutorMusical reprodutorMusical, Telefone telefone, Navegador navegador): Construtor que inicializa as instâncias de reprodutor musical, telefone e navegador.

void tocarMusica(): Método para tocar música usando o reprodutor musical.

void fazerChamada(String numero): Método para fazer uma chamada usando o telefone.

void carregarPagina(String url): Método para carregar uma página usando o navegador.
