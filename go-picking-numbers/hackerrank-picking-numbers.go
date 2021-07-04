package main

import (
    "fmt"
    "math"
	"strconv"
)

/*
 * Complete the 'pickingNumbers' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY a as parameter.
 */

func pickingNumbers(a []int32) int32 {
    // Write your code here
    length := 0
    for i:=0 ; i < len(a); i++{
        tempArrayBigger := []int32{a[i]}
  	tempArraySmaller := []int32{a[i]}
        for j:=0; j<len(a); j++{
            if math.Abs(float64(a[i]-a[j])) <= 1 && i!=j{
                if a[j]>=a[i]{
			tempArrayBigger = append(tempArrayBigger, a[j])
		} 
		
		if a[j]<=a[i]{
			tempArraySmaller = append(tempArraySmaller, a[j]) 
		}
            }
        }
  
	for k:=0; k<len(tempArrayBigger); k++{
		fmt.Print(strconv.Itoa(int(tempArrayBigger[k])))
	}
	fmt.Println("")
	
	for l:=0; l<len(tempArraySmaller); l++{
		fmt.Print(strconv.Itoa(int(tempArraySmaller[l])))
	}
	fmt.Println("")
	
    	fmt.Println(strconv.Itoa(length))
	
	if !(length > len(tempArrayBigger) || length > len(tempArraySmaller)){	
        	if len(tempArrayBigger) > len(tempArraySmaller){
         	   	length = len(tempArrayBigger)
       		 } else {
			length = len(tempArraySmaller)
		}	
	}
        
    }
    
    return int32(length)
}

func main() {
	a:=[]int32{4, 2, 3, 4, 4, 9, 98, 98, 3, 3, 3, 4, 2, 98, 1, 98, 98, 1, 1, 4, 98, 2, 98, 3, 9, 9, 3, 1, 4, 1, 98, 9, 9, 2, 9, 4, 2, 2, 9, 98, 4, 98, 1, 3, 4, 9, 1, 98, 98, 4, 2, 3, 98, 98, 1, 99, 9, 98, 98, 3, 98, 98, 4, 98, 2, 98, 4, 2, 1, 1, 9, 2, 4}
	length := pickingNumbers(a)
	fmt.Println(strconv.Itoa(int(length)))
}
