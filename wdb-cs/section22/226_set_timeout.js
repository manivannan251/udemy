console.log("Hello");
setTimeout(() => {
    console.log("Hello you there");
},3000)
console.log("GOODBYE!!!");

const id = setInterval(()=>{
    console.log(Math.random());
},2000)