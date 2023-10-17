function compute(n) {
    return new Promise(function(resolve, reject) {
        setTimeout(() => {
            if(n >= 0) {
                resolve(n * 2);
            } else {
                reject("invalid input");
            }
        }, 2000);
    });
}

compute(4)
    .then(data => data + 1)
    .then(data => data * 4)
    .then(data => console.log(data));

compute(-4)
    .then(data => data + 1)
    .then(data => data * 4)
    .then(data => console.log(data))
    .catch(err => console.log(`ERROR`: ${err}`));


compute(-4)
    .then(data => data + 1)
    .catch(err => console.log(`ERROR`: ${err}`))
    .then(data => data * 4)
    .then(data => console.log(data));
