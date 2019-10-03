class BankAccount {
    balance = 0;
    deposit(credit: number) {
        this.balance += credit;
        return this.balance;
    }
} 

let x:any="Hello";
function t(x){
    console.log(x);
    return x;

}
t(x);
