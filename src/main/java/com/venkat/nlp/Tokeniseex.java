package com.venkat.nlp;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class Tokeniseex {
    public static void main(String[] args){
        StanfordCoreNLP stanfordCoreNLP=Pipeline.getPipeline();
        String text="Hey ! This is venkatesh";
        CoreDocument coreDocument=new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);
        List<CoreLabel> coreLabelList=coreDocument.tokens();
        for (CoreLabel corelabel:coreLabelList
             ) {
            System.out.println(corelabel.originalText());
            
        }
    }
}
