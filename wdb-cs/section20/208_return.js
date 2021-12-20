function add(x,y) {
    if(typeof(x)!=='number' || typeof(y)!=='number') {
        return false;
    }
    return x+y;
}

let sum = add(5,7);
console.log("The sum is "+sum);