function isBetween(min,max) {
    return function(num) {
        return num>=min&& num<=max;
    }
}

const retfunc = isBetween(18,40);