const subreddits = ['chickens','java','javascript'];

for (let sub of subreddits) {
    console.log(`Visit reddit.com/r/${sub}`);
}

const seating = [
    ['Sanjeevi','Arun'],
    ['Datta','Swami'],
    ['Diwakar','Sriram','Rama']
]

for(let stu of seating) {
    for(let stud of stu) {
        console.log(stud);
    }
}