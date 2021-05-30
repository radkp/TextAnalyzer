package io.sahaj.resource;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class TextAnalysis {
    @Getter
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<ComplexSentence> complexSentences = new ArrayList<>();

    public void addComplexSentence(ComplexSentence complexSentence) {
        complexSentences.add(complexSentence);
    }
}
