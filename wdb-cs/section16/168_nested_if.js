const password = prompt("Enter a password");

if(password.length>=6) {
    if(password.indexOf(' ') === -1) {
        console.log("password accepted");
    }
    else {
        console.log("password cannot contain spaces ");
    }
}
else {
    console.log("password too short");
}