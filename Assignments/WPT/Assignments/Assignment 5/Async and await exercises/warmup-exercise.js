const fetchPokemon=()=>{
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            //resolve({data: {name: "Pickachu", power: 20}});
            reject(new Error("Danger, danger!"));

        },2000);
       
    });
};

console.log("Program starting....");


const usePokemon=async()=>{
    try{
    const data= await fetchPokemon();    //line 15 will not execute for 2s after line 14
    console.log(data);
    console.log("Done fetching...");
    }catch{
        console.error(error);
    }
    console.log("There was an error with our code but we are ok");
};

usePokemon();
console.log("Program completed");

