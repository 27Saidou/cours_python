var BankAccount = /** @class */ (function () {
    function BankAccount() {
        this.balance = 0;
    }
    BankAccount.prototype.deposit = function (credit) {
        this.balance += credit;
        return this.balance;
    };
    return BankAccount;
}());
var x = "Hello";
function t(x) {
    console.log(x);
    return x;
}
t(x);
