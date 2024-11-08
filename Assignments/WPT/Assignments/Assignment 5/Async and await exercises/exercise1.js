const fetchUser=()=>{
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            resolve({data: {user: "Monkey", admin: true}});
        },3000);
    });
};

const login=(user)=>{
    if(user.admin===true){

        console.log("successfully logged in");
    }else{
        console.log("Failed to log in, Please try again");
    }
};


const useAdmin=async ()=>{
    //const user= await fetchUser();
    const result=await fetchUser();
    //console.log(user);
    console.log(result);
    login(result.data);

    //login(user.data);

};

useAdmin();
console.log("Program complete");
