// 1. Simple Arrow Function
let add = (a, b) => a + b;
console.log("Addition:", add(10, 20));

// 2. Array map() Example
let arr = [1, 2, 3, 4];
let result = arr.map(x => x * 2);
console.log("Map:", result);

// 3. Callback Example
function greet(name, callback) {
    callback(name);
}

greet("Hari", name => {
    console.log("Hello", name);
});