function s(s) {
    return s;
}
function vote(candidate, callback) {
    // ...
}
vote("BigPig", function (result) {
    if (result === "BigPig") {
        // ...
    }
});
function add(friend) {
    var name = friend.name;
    return name;
}
console.log(add({ name: "Fred" }));
console.log(s("Hello"));
