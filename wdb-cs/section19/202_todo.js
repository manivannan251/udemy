let action = prompt("Enter what do you want to do");
let todo = [];
while(action !== 'quit') {
    switch(action) {
        case 'new':
            let task = prompt("Enter the task");
            console.log(`${task} added to list`);
            todo.push(task);
            action = prompt("Enter what do you want to do");
            break;
        case 'list':
            for(let i=0;i<todo.length;i++) {
                console.log(`${i}: ${todo[i]}`);
            }
            action = prompt("Enter what do you want to do");
            break;
        case 'delete':
            let ind = prompt("Enter the index to delete");
            todo.splice(ind,1);
            action = prompt("Enter what do you want to do");
            break;
    }
}
