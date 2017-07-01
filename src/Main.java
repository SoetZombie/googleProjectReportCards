import jdk.nashorn.internal.ir.SplitNode;

import java.util.*;

public class Main  {


    private Integer mathGrade;
    private Integer englishGrade;
    private Integer biologyGrade;
    private Integer chemistryGrade;
    private Integer historyGrade;
    private Integer musicGrade;

    public Integer getMathGrade() {
        return mathGrade;
    }



    private ArrayList<Integer> mathGrades = new ArrayList<>();
    private ArrayList<Integer> englishGrades = new ArrayList<>();
    private ArrayList<Integer> biologyGrades = new ArrayList<>();
    private ArrayList<Integer> chemistryGrades = new ArrayList<>();
    private ArrayList<Integer> historyGrades = new ArrayList<>();
    private ArrayList<Integer> musicGrades = new ArrayList<>();
    private String biologyGradesString = "Your biology grades are: ";
    private  Double averageBiologyGrade = 0.0;
    public Main() {

    }

    public static void main(String[] args) {
        //Basic setup, also was thinking about using Singleton design pattern
        Main main = new Main();
        main.setBiologyGrades(1);
        main.setBiologyGrades(1);
        main.setBiologyGrades(1);
        main.setBiologyGrades(2);
        main.setBiologyGrades(1);
        main.setBiologyGrades(4);
        System.out.println(main.getAllBiologyGrades());
        //System.out.println(main.biologyGrades.size());
        //System.out.println("Biology grades: " + main.getBiologyGrades().get(0) + ", " + main.getBiologyGrades().get(1));
        System.out.println("Your grade average is : " + main.calculateBiologyAverageGrade());
    }
    public String getAllBiologyGrades(){
        for (Integer biologyGrade:biologyGrades
             ) {
            biologyGradesString+=biologyGrade.toString()+",";
        }

       return biologyGradesString;
    }
    public Double calculateBiologyAverageGrade(){
        for (Integer biologyGrade:biologyGrades
             ) {
            averageBiologyGrade += biologyGrade;
        }

        return averageBiologyGrade/ biologyGrades.size();

    }

    public Integer getMathGrades() {
        //get the last set grade, getall method included lower
        return mathGrade;
    }

    public void setMathGrades(Integer mathGrade) {
        //setting local variable and putting it into arraylist.
        this.mathGrade = mathGrade;
        mathGrades.add(mathGrade);
    }

    public Integer getEnglishGrade() {
        return englishGrade;
    }


    public void setEnglishGrades(Integer englishGrade) {
        this.englishGrade = englishGrade;
        englishGrades.add(englishGrade);
    }

    public Integer getBiologyGrade() {
        return biologyGrade;
    }

    public void setBiologyGrades(Integer biologyGrade) {
        this.biologyGrade = biologyGrade;
        biologyGrades.add(biologyGrade);
    }

    public Integer getChemistryGrade() {
        return chemistryGrade;
    }

    public void setChemistryGrades(Integer chemistryGrade) {
        this.chemistryGrade = chemistryGrade;
        chemistryGrades.add(chemistryGrade);
    }

    public Integer getHistoryGrade() {
        return historyGrade;
    }

    public void setHistoryGrade(Integer historyGrade) {
        this.historyGrade = historyGrade;
        historyGrades.add(historyGrade);
    }

    public Integer getMusicGrade() {
        return musicGrade;
    }

    public void setMusicGrade(Integer musicGrade) {
        this.musicGrade = musicGrade;
        musicGrades.add(musicGrade);

    }
    public ArrayList<Integer> getEnglishGrades() {
        return englishGrades;
    }

    public ArrayList<Integer> getBiologyGrades() {
        return biologyGrades;
    }

    public ArrayList<Integer> getChemistryGrades() {
        return chemistryGrades;
    }

    public ArrayList<Integer> getHistoryGrades() {
        return historyGrades;
    }

    public ArrayList<Integer> getMusicGrades() {
        return musicGrades;
    }
}