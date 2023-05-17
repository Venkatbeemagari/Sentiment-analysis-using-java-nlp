package com.venkat.nlp;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import java.util.Properties;
public class Pipeline{
    private static Properties properties;
    private static String propertiesName="tokenize ,parse,lemma,pos,ner,sentiment";
    private static StanfordCoreNLP stanfordCoreNLP;
    public Pipeline(){ }
    static {
        properties =new Properties();
        properties.setProperty("annotators",propertiesName);
    }
    public static StanfordCoreNLP getPipeline(){
        if(stanfordCoreNLP==null){
            stanfordCoreNLP=new StanfordCoreNLP(properties);
        }
        return stanfordCoreNLP;
    }
}
