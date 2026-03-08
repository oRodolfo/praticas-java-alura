package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class MainDicionario {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o titulo do livro para a pesquisa: ");
        String livro = scanner.nextLine();

        String chave = "AIzaSyBxCwRuTVGrlXcMsHX8gt_XOISpMgrZwjc";
        String livroEncoded = URLEncoder.encode(livro, StandardCharsets.UTF_8);

        String dicionario = "https://www.googleapis.com/books/v1/volumes?q="
                + livroEncoded
                + "&key="
                + chave;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(dicionario)).build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        System.out.println("URL: " + dicionario);
    }
}

//key google: AIzaSyBxCwRuTVGrlXcMsHX8gt_XOISpMgrZwjc