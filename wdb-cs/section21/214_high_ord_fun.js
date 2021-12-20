function rollDiceSixTimes(func) {
    for(let i=0;i<6;i++) {
        func();
    }
}

function rollDie() {
    let dice = Math.floor(Math.random() * 6) + 1;
    console.log(dice);
}

rollDiceSixTimes(rollDie);