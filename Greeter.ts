class Greeter {
    greeting: string;
    constructor(message: string) {
        this.greeting = message;
    }
    greet(): string {
        return this.greeting;
    }
};

let greeter = new Greeter("Engineer java");
console.log(greeter.greet());