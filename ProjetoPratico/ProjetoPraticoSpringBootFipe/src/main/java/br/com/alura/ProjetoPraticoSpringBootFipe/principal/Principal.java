package br.com.alura.ProjetoPraticoSpringBootFipe.principal;

import br.com.alura.ProjetoPraticoSpringBootFipe.model.Dados;
import br.com.alura.ProjetoPraticoSpringBootFipe.model.Modelos;
import br.com.alura.ProjetoPraticoSpringBootFipe.model.Veiculo;
import br.com.alura.ProjetoPraticoSpringBootFipe.service.ConsumoAPI;
import br.com.alura.ProjetoPraticoSpringBootFipe.service.ConverteDados;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {

    Scanner scanner = new Scanner(System.in);

    private final String URL_INICIAL = "https://parallelum.com.br/fipe/api/v1/";
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConverteDados converteDados = new ConverteDados();


    public void exibirMenu(){
        var menu = """
                OPÇÕES:
                
                CARRO
                MOTO
                CAMINHAO
                
                DIGITE UMA DAS OPÇÕES PARA CONSULTA:
                """;

        System.out.println(menu);

        var opcao = scanner.nextLine();
        String endereco = "";

        if(opcao.toLowerCase().contains("carro")){
            endereco = URL_INICIAL + "carros/marcas";
        }else if (opcao.toLowerCase().contains("moto")){
            endereco = URL_INICIAL + "/motos/marcas";
        } else if (opcao.toLowerCase().contains("caminhao")) {
            endereco = URL_INICIAL + "/caminhoes/marcas";
        }else {
            System.out.println("Informe uma opcao valida entre: CARRO, MOTO, CAMINHAO");
        }

        var json = consumoAPI.obterDados(endereco);
        System.out.println(json);

        var marcas = converteDados.obterLista(json, Dados.class);
        marcas.stream().sorted(Comparator.comparing(Dados::codigo)).forEach(System.out::println);

        System.out.println("Informe o codigo da marca para consulta: ");
        var codigoMapa = scanner.nextLine();

        final String enderecoNovo = endereco + "/" + codigoMapa + "/modelos";
        json = consumoAPI.obterDados(enderecoNovo);
        var modeloLista = converteDados.obterDados(json, Modelos.class);
        System.out.println("\nModelos dessa marca: \n");
        modeloLista.modelos().stream().sorted(Comparator.comparing(Dados::codigo)).forEach(System.out::println);

        System.out.println("\n Digite um trecho do nome do carro a ser buscado: ");
        var nomeVeiculo = scanner.nextLine();
        List<Dados> modelosFiltrados = modeloLista.modelos().stream().filter(m -> m.nome().toLowerCase().contains(nomeVeiculo.toLowerCase())).collect(Collectors.toList());
        System.out.println("\n Modelos filtrados: ");
        modelosFiltrados.forEach(System.out::println);

        System.out.println("Digite o codigo do modelo do veiculo: ");
        var codigoModelo = scanner.nextLine();
        final String enderecoModelo = enderecoNovo + "/" + codigoModelo + "/anos";
        json = consumoAPI.obterDados(enderecoModelo);
        List<Dados> anos = converteDados.obterLista(json, Dados.class);
        List<Veiculo> veiculos = new ArrayList<>();

        for(int i = 0; i < anos.size(); i++){
            var enderecoAnos = enderecoModelo + "/" + anos.get(i).codigo();
            json = consumoAPI.obterDados(enderecoAnos);
            Veiculo veiculo = converteDados.obterDados(json, Veiculo.class);
            veiculos.add(veiculo);
        }

        System.out.println("\nTodos os veiculos filtrados com avaliações por ano: ");
        veiculos.forEach(System.out::println);
    }
}
