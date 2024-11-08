//2 seconds
const fetchFast=()=>{
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            resolve("Fast done!");

        },2000);
    })
}

const fetchSlow=()=>{
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            resolve("Slow done!");

        },6000);
    })
}

//6 seconds

console.log("Program starting.....");
const firstTime=new Date();

const firstTimestamp=new Date();

console.log(new Date()-firstTime);

const useData=async()=>{
    const fastResult= fetchFast();
    console.log(fastResult);
    const slowResult= fetchSlow();
    console.log(slowResult);
    const result= await Promise.all([fastResult,slowResult]);
    console.log(result);
    

    
const secondTimestamp=new Date();
const timeElapsed=secondTimestamp-firstTimestamp;
console.log("Program complete",timeElapsed);
//console.log("Program complete!");
};



useData();

