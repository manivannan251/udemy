const movies = [
    {
        title:'Jai Bhim',
        score: 95
    },
    {
        title:'Annathe',
        score: 45
    },
    {
        title:'Janaa',
        score: 15
    },
    {
        title:'Beast',
        score: 65
    }
]

// const rating = movies.map(function(movie) {
//     return `${movie.title} - ${movie.score/10}`;
// })

const rating = movies.map(movie =>(
    `${movie.title} - ${movie.score/10}`
)
)