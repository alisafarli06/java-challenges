public class Challange1 {
    //    Challenge 1: Find Maximum
    public Integer maximum(Integer[] numList) {
        int max = numList[0];
        for (int i = 1; i < numList.length; i++) {
            if (numList[i] > max) {
                max = numList[i];
            }
        }
        return max;
    }
}
