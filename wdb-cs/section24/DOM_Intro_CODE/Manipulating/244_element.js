const allImg = document.getElementsByTagName('a');

console.log('The total number of links are ',allImg.length);

const imgs = document.getElementsByClassName('square');

console.log('The number of images having square class is ',imgs.length);

for(let a of imgs) {
    a.src="https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Silky_bantam.jpg/440px-Silky_bantam.jpg";
}