const shoppingCart = [
    {
        product: 'Jenga Classic',
        price: 6.88,
        quantity: 1
    },
    {
        product: 'Echo Dot',
        price: 29,
        quantity: 2
    },
    {
        product: 'Fire Stick',
        price: 40,
        quantity: 5
    }
]

console.log('accessing echo dot price ->'+shoppingCart[1]['price']);

const student = {
    firstName: 'Sarah',
    lastName: 'Sahi',
    strengths: ['Stunts','Acting'],
    exams: {
        midterm: 78,
        final: 98
    }
}

console.log('Accessing strenths of students -> '+student.strengths);
console.log('Accessing final mark of student -> '+student['exams']['final']);