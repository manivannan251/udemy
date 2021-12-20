const person = {
    firstName: 'Sarah',
    lastName: 'Sahi'
}

console.log("The firstName of person is -> "+person.firstName);
console.log("The lastName of person is -> "+person['lastName']);

//Add property
person['age']=35;
console.log("The age of person is -> "+person['age']);

//modify property
person['age']=45;
console.log("The age of person after modifying is -> "+person['age']);