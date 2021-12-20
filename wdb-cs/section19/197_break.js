let targetNum = Math.floor(Math.random() * 10);
let guess = Math.floor(Math.random() * 10);
while(true) {
    guess = Math.floor(Math.random() * 10);
    if(guess === targetNum) {
        console.log(`Correct! Your guess was ${guess} and target was ${targetNum}`);
        break;
    }
    else {
        console.log(`Wrong your guess was ${guess}`);
    }
}