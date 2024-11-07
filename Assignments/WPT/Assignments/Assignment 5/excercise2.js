console.log("Program started");
const myPromise=new Promise((resolve,reject)=>{
    setTimeout(()=>{
        resolve();
    },3000);

})

console.log(myPromise);
console.log("Program in progress");

myPromise.then(()=>{
     console.log("Step 1 complete");

     return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            resolve("step 2 complete");

        },6000)

     })
}).then((val)=>{
    console.log(val);
});