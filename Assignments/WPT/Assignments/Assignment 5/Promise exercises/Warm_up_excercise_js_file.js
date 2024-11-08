
console.log("Program started");

const myPromise = new Promise((resolve, reject) =>{
    setTimeout(()=>{
        resolve("Program complete");

    }, 3000)

});

console.log(myPromise);
console.log("Program in progress...");

myPromise.then((value)=>{
    console.log(value);

});
