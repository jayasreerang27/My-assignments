package week1.day2;

public class FindIntersection {
public static void main(String[] args) {
	
	int[] arr1 = {3,2,11,4,6,7};
	int[] arr2 = {2,1,8,4,9,7};
	
	
	int lOfArr1 = arr1.length;
	int lOfArr2 = arr2.length;
	
	
	for(int i = 0; i < lOfArr1; i++) {  
        for(int j = 0; j < lOfArr2; j++) {  
            if(arr1[i] == arr2[j])  
                System.out.println(arr2[j]);  
        }  
    }  
	
	
}
}
