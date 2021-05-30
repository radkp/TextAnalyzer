package io.sahaj.controller;

import io.sahaj.helper.TextAnalyzer;
import io.sahaj.resource.TextAnalysis;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class TextAnalyzerController {

    private TextAnalyzer textAnalyzer = new TextAnalyzer();

    @PostMapping(value = "analyze", consumes = MediaType.TEXT_PLAIN_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public TextAnalysis analyze(@RequestBody String text) {
        return textAnalyzer.analyze(text);
    }

}
