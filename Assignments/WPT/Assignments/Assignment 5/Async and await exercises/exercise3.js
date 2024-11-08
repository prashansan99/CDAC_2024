const goGetCandies=()=>{
    return new Promise((resolve,reject)=>{
      setTimeout(()=>{
        resolve({candy:"sour keys",quantity:10});
      },2000);

    });
};

const sellcandies=(candy)=>{
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            resolve(25*candy.quantity);

        },3000);
    });
    return 25*candy.quantity
};

const usedCandies=async()=>{
    const candy= await goGetCandies();
    const result= await sellcandies(candy);

    //await use(result)
    console.log(result);
    const time2=new Date();
    console.log(`${time2-time2}ms passed`);
};

console.log("Program starting");
const time1=new Date();

usedCandies();

const candy=goGetCandies();
candy.then((result)=>{
    const sellValue=sellcandies(result);
    console.log(sellValue);
    sellValue.then((value)=>{
        console.log(value);
        const time2=new Date();
        console.log(`${time2-time1}ms passed`);

    });
});
console.log("Program complete");