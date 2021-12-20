const cat = {
    name: 'Alex Mahone',
    meow() {
        console.log(`${this.name} says meow`);
    }
}

const mew = cat.meow;