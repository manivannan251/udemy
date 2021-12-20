const rating = parseInt(prompt("enter a rating"));

if (rating === 3) {
    console.log("Exceeds Expectations");
}
else if (rating === 2) {
    console.log("Meets Expectations");
}
else if (rating === 1) {
    console.log("Needs Improvement");
}
else {
    console.log("Invalid rating");
}