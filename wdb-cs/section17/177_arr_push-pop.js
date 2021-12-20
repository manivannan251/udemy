let dayOfWeek = ['Monday','Tuesday'];

console.log("Initial Array  -> "+dayOfWeek);

//Adding element to the last
dayOfWeek.push('Wednesday');
console.log("Array  after push-> "+dayOfWeek);

//Removing element from last
dayOfWeek.pop();
console.log("Array  after pop-> "+dayOfWeek);

//Insert Elements from first element of list
dayOfWeek.unshift('Sunday');
console.log("Array  after unshift-> "+dayOfWeek);

//Delete element from first of list
dayOfWeek.shift();
console.log("Array  after shift-> "+dayOfWeek);
