public class Challange4 {
//    Challenge 4: Calculate the average
    public double average(Integer[] numList) {
        double sum = 0;
        for(int i = 0; i < numList.length; i++){
            sum += numList[i];

        }
        double average = sum/numList.length;
        return average;


    }

}
