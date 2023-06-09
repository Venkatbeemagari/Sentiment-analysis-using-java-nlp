package com.venkat.nlp;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class Sentimentanalysis {
    public static void main(String[] args) {
        StanfordCoreNLP stanfordCoreNLP=Pipeline.getPipeline();
        String text="I  like this apples";
        CoreDocument coreDocument=new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);
        List<CoreSentence> sentences=coreDocument.sentences();
        for(CoreSentence sentence:sentences){
            String sentiment=sentence.sentiment();
            System.out.println(sentiment+"\t"+sentence);
        }
    }
}
