const nums = [3,4,12,345,123,678,222]

console.log(`Printing the array without spread ${nums}`)

console.log(`Printing the array with spread`)
console.log(...nums)

console.log(`Finding max with Math.max with spread ${Math.max(...nums)}`)