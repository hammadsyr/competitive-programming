package main

import (
	"fmt"
	"strconv"
)

func main() {
	for i := 0; i < 100; i++ {
		isPrime(i)
	}
}

func isPrime(n int) {
	if n <= 1 {
		fmt.Println(strconv.Itoa(n) + " not prime number")
	} else {
		j := 0
		for i := 2; i <= n; i++ {
			if i < n {
				if n%i == 0 {
					j++
				}
			} else {
				if j != 0 {
					fmt.Println(strconv.Itoa(n) + " not prime number")
				} else if j == 0 && n%i == 0 {
					fmt.Println(strconv.Itoa(n) + " prime number")
					j = 0
				} else {
					fmt.Println(strconv.Itoa(n) + " unknown number")
				}
			}
		}
	}
}
