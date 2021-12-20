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

movies.forEach(function(movie) {
    console.log(`${movie.title} -> ${movie.score}/100`)
})