package Array;

public class secondLargestElement {

    public int secondLargest(int[] elements){
        int largest=elements[0];
        int secondLargest=elements[0];
        for(int i=1;i<elements.length;i++){
            if(elements[i]>largest){
                secondLargest=largest;
                largest=elements[i];
            }
            else if(elements[i]>secondLargest && elements[i]!=largest){
                secondLargest=elements[i];
            }
        }
        return secondLargest;
    }

}
class Exec{
    public static void main(String[] args) {
        secondLargestElement object = new secondLargestElement();
        int[] numbers={2,4,5,61,89,45,0};
        System.out.println(object.secondLargest(numbers));
    }
}
