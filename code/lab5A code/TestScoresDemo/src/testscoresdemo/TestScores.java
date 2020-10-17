/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testscoresdemo;

/**
 *
 * @author 19219
 */
public class TestScores {
    private double score1;
    private double score2;
    private double score3;

    TestScores(double s1, double s2, double s3) {
        score1 = s1;
        score2 = s2;
        score3 = s3;
    }
    
    public void TestScores(double s1, double s2, double s3){
        score1 = s1;
        score2 = s2;
        score3 = s3;
    }
    public void setScore1(double n){
        score1 = n;
    }
    public void setScore2(double n){
        score2 = n;
    }
    public void setScore3(double n){
        score3 = n;
    }
    public double getScore1(){
        return score1;
    }
    public double getScore2(){
        return score2;
    }
    public double getScore3(){
        return score3;
    }
    public double getAverageScore(){
      return (score1 + score2 + score3) / 3.0;
    }
}
