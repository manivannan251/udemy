const seating = [
    ['Sanjeevi','Arun'],
    ['Datta','Swami'],
    ['Diwakar','Sriram','Rama']
]

for(let i=0;i<seating.length;i++) {
    const row = seating[i];
    console.log(`ROW ${i+1}`);
    for(let j=0;j<row.length;j++) {
        console.log(row[j]);
    }
}