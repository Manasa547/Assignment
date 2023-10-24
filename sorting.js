//. Perform sorting of an array in descending order.

let numbers = [5, 2, 9, 1, 5, 6];
// Sorting the array in descending order
numbers.sort(function(a, b) {
    return b - a;
});

console.log(numbers); 