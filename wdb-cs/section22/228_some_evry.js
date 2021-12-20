const scores = [45,66,77,98,50,35];

const allPass = scores.every(score => score>40);

const isFail = scores.some(score => score<40);