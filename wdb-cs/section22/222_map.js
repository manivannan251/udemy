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

const titles = movies.map(function(movie) {
    return movie.title;
})