package main

import (
	"fmt"
)

func matchingStrings(strings []string, queries []string) []int32 {
	// Write your code here
	results := []int32{}
	for i := 0; i < len(queries); i++ {
		var counts int32 = 0
		for j := 0; j < len(strings); j++ {
			if queries[i] == strings[j] {
				counts++
			}
		}

		results = append(results, counts)
	}

	return results
}

func main() {
	var stringCount int
	var stringArray []string
	var singleString string
	var queries []string

	fmt.Scanln(&stringCount)
	for i := 0; i < stringCount; i++ {
		fmt.Scanln(&singleString)
		stringArray = append(stringArray, singleString)
	}

	fmt.Scanln(&stringCount)
	for i := 0; i < stringCount; i++ {
		fmt.Scanln(&singleString)
		queries = append(queries, singleString)
	}

	results := matchingStrings(stringArray, queries)

	for i := 0; i < len(results); i++ {
		fmt.Println(results[i])
	}
}
