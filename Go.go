package main

import "fmt"

func main() {
	var num1 string
	var num2 float64
	var num3 float64
	fmt.Scanln(&num1)
	fmt.Scanln(&num2)
	fmt.Scanln(&num3)
	var result float64 = (num3 * 0.15) + num2
	fmt.Printf("TOTAL = R$ %.2f\n", result)
}
