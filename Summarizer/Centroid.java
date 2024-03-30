package Summarizer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Set;


//must use sentencescore arraylist of class sentence to get the final sentence score.
//have used field corlus.
public class Centroid {
    ArrayList<String> centroid = new ArrayList<String>();
    Hashtable<String, Float> wordscore = new Hashtable<String, Float>();
    ArrayList<Sentence> sentencescore = new ArrayList<Sentence>();
    ArrayList<WordScoreField> finalwordscore = new ArrayList<WordScoreField>();
    Corplus corplus;
    float threshold1 = 3f;
    
    public Centroid(Corplus corplus) {
        this.corplus = corplus;
    }
    public static void main(String[] args) {
        Centroid centroid = new Centroid(new Corplus("yemen crisis/"));
        centroid.buildCentroid();
        Set<String> s = centroid.wordscore.keySet();
    }
    public void buildCentroid() {
        calculateWordScore(corplus);
        calculateFinalWordScore();
        makeCentroid();
        calculateSentenceScore();
    }
    public void calculateSentenceScore() {
        int sentenceno = 0;
        for (int i = 0 ; i < corplus.featureset.size() ; i ++) {
            for (int j = 0 ; j < corplus.featureset.get(i).size() ; j ++) {
                sentencescore.add(new Sentence(i, j, findIntersection(corplus.featureset.get(i).get(j), centroid), sentenceno));
                sentenceno ++;
            }
        }
        Collections.sort(sentencescore);
    }
    public void makeCentroid() {
        for (int i = 0 ; i < finalwordscore.size() ; i ++) {
            if (finalwordscore.get(i).score >= threshold1) {
                centroid.add(finalwordscore.get(i).word);
            }
            
        }
    }
    public int findIntersection(ArrayList<String> a, ArrayList<String> b) {
        int count = 0;
        for (String s : a) {
            if (b.contains(s)) {
                count ++;
            }
        }
        return count;
    }
    public void calculateWordScore(Corplus corplus) {
        Set<String> keys = corplus.allwordfreq.keySet();
        for (String s : keys) {
            wordscore.put(s, corplus.allwordfreq.get(s) * corplus.allwordidf.get(s));
        }
    }
    public void calculateFinalWordScore() {
        Set<String> keys = wordscore.keySet();
        for (String s : keys) {
            finalwordscore.add(new WordScoreField(s, wordscore.get(s)));
        }
        Collections.sort(finalwordscore);
    }
}

class WordScoreField implements Comparable<WordScoreField>{
    String word;
    float score;
    public WordScoreField(String word, float score) {
        this.word = word;
        this.score = score;
    }
    @Override
    public String toString() {
        return String.valueOf(score);
    }
    public int compareTo(WordScoreField a) {
        Float x = new Float(score);
        Float y = new Float(a.score);
        return -x.compareTo(y);
    }
}
