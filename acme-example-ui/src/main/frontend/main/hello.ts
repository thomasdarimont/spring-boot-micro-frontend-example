interface Person {
    firstName: string;
    lastName: string;
}

function greet(person: Person) {
    return "Hello, " + person.firstName + " " + person.lastName;
}

let user = { firstName: "Buddy", lastName: "Holly" };

console.log(greet(user));
