let promise = new Promise((resolve, reject) => {
    setTimeout(() => {
        resolve("Data fetched successfully");
    }, 2000);
});

promise.then(msg => {
    document.getElementById("result").innerHTML = msg;
}).catch(err => {
    document.getElementById("result").innerHTML = err;
});