function s(s:string){
    return s;
}
function vote(candidate: string, callback: (result: string) => any) {
    // ...
}
vote("BigPig",
    function (result: string) {
        if (result === "BigPig") {
            // ...
        }
    }
);

interface Friend {
    name: string;
    
}
function add(friend: Friend) {
    let name = friend.name;
    return name;
}

console.log(add({ name: "Fred" })); 


console.log(s("Hello"));