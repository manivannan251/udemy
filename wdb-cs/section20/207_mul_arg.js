function repeat(str,num) {
    let repeatString = "";
    for(let i=0;i<num;i++) {
        repeatString+=str;
    }
    console.log(repeatString);
}

repeat('hi',5);