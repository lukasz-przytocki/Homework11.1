public class Test {
    public static void main(String[] args) {
        UniqueArray[] array = new UniqueArray[3];

        for (int i = 0; i < array.length; i++) {
           Data.inputData(array, i);                //static method
           if(i>0){
               for (int j = 0; j <i ; j++) {
                   while (array[j].equals(array[i])){
                       System.out.println("Duplicate, please enter data again ");
                       Data.inputData(array, i);
                   }

               }
           }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getName() + " " + array[i].getAge());
        }
    }


}