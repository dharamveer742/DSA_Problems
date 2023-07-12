package SortingAlgorithms;

import java.util.Arrays;

public class LargestPerimeterTriangle {
    // return largest perimeter triangle with non-zero area
    public static int largestPerimeter(int[] sides){
        Arrays.sort(sides);
        int peri = 0;
        for(int i=sides.length-1;i>=2;i--){
            if(sides[i-1]+sides[i-2]>sides[i]){
                peri = sides[i-1]+sides[i-2]+sides[i];
                break;
            }
        }
        return peri;
    }

    public static void main(String[] args) {
        int[]  sides ={25,6,9,11,8,12,10,3,2};
        System.out.println(largestPerimeter(sides));
    }

}
