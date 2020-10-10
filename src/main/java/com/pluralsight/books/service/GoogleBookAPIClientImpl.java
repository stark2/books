package com.pluralsight.books.service;

import com.pluralsight.books.json.BookJSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.reactive.function.client.WebClient;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.time.Duration;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class GoogleBookAPIClientImpl {
    private static final Logger log = LoggerFactory.getLogger(GoogleBookAPIClientImpl.class);
    private static final String baseURL = "https://www.googleapis.com"; // https://www.googleapis.com/books/v1/volumes?q=isbn:0735619670

    private WebClient client;

    @Autowired
    public GoogleBookAPIClientImpl(WebClient.Builder builder) {
        client = builder.baseUrl(baseURL).build();
    }

    public BookJSON getBookByISBN(String... isbn) {
        String encoded = Stream.of(isbn)
                .map(this::encodeString)
                .collect(Collectors.joining(","));
        String path = "/books/v1/volumes";

        /*
        Response response = client.get()
                .uri(uriBuilder ->
                        uriBuilder.path(path)
                                .queryParam("q", encoded)
                                //.queryParam("key", KEY)
                                .build())
                .retrieve()
                .bodyToMono(Response.class)
                .block(Duration.ofSeconds(2));

        return new BookJSON(response.getFormattedAddress(), response.getLocation().getLat(), response.getLocation().getLng());
        */
        return new BookJSON();
    }

    private String encodeString(String s) {
        try {
            return URLEncoder.encode(s,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return s;
    }
}
