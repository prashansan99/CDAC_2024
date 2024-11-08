const promise1=new Promise((resolve,reject)=>{
    setTimeout(()=>{
        resolve(10);

    },3000);
});

const promise2=new Promise((resolve,reject)=>{
    setTimeout(()=>{
        resolve(20);
    },5000);
})

Promise.all([promise1,promise2]).then((values)=>{
    const firstValue=values[0];
    const secondValue=values[1];
    console.log(values);
    console.log(firstValue,secondValue);
    console.log(firstValue+secondValue);
})