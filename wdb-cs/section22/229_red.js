const prices = [4.50,3.88,7.99,20,6.66,11.12];

const min = prices.reduce((min,curr)=>{
    if(curr<min)
        min = curr;
    return min;
})

const evens = [2,4,6,8];
const evenSum = evens.reduce((sum,num)=>{
    return sum+num;
},20)