const person = {
    firstName: 'Tim',
    lastName: 'Cook',
    fullName: function () {
        return `${this.firstName} ${this.lastName}`;
    },
    fullNameArr: () => {
        return `${this.firstName} ${this.lastName}`;
    },
    shoutName: function() {
        setTimeout(()=>{
            console.log(this)
            console.log(this.fullName())
        },2000)
    }
}