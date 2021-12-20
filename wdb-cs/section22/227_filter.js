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

const gm = movies.filter(movie => movie.score>60)

const bmt = movies.filter(movie => movie.score<60).map(m=>m.title)