public class Exercise4 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,6,5,4,3,2,1};
        System.out.println( arrayUpAndDown(array));
    }
    public static int arrayUpAndDown(int[] array){
        int checkUpDown = -1;
        boolean flag = false;
        int i;
        for (i=0;i<array.length-1;i++) {
            checkUpDown = i;
            if(array[i] < array[i + 1]) {
                flag = true;
            }
            else {
                flag=false;
                break;
            }
        }
        if (i == array.length - 1) {
            checkUpDown=-1;
        }
        if (!flag){
            for (i=checkUpDown;i<array.length-1;i++){
                if(array[i]>array[i+1]){
                    flag=true;
                }
                else {
                    flag=false;
                    break;
                }
            }
            if (!flag){
                checkUpDown=-1;
            }
        }

        return checkUpDown;
    }


}
