const anch = document.querySelectorAll('a');
for(let link of anch) {
    link.style.color = 'cyan';
    link.style.textDecorationColor = 'magenta';
    link.style.textDecorationStyle = 'wavy';
}
const he = document.querySelector('h1');

const cs = window.getComputedStyle(he);

console.log(cs.color);