package week1.day2;

public class PrintDuplicatesJava {
public static void main(String[] args) {
	
	int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
	
	int lOfArr = arr.length;
	
	
	for(int i = 0; i < lOfArr; i++) {  
        for(int j = i + 1; j < lOfArr; j++) {  
            if(arr[i] == arr[j])  
                System.out.println(arr[j]);  
        }  
    }  
	
	
}
}
