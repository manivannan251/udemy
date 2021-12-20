const testscores = {
    shawn: 91,
    dwayne: 88,
    vonnie: 66,
    nadia: 55,
    mitchel: 89
}

for(let person in testscores) {
    console.log(`${person} scored ${testscores[person]}`);
}


//count the total value of scores
let total = 0;
let scoreArray = Object.values(testscores);
for(let value of scoreArray) {
    total+=value;
}

console.log("The total is "+total);
console.log("The score array length is "+scoreArray.length);