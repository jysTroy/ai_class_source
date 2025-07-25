abstract class BaseUser {
    constructor(public email: string, public password: string) {}

    public abstract autenticate(): void
}

// class User extends BaseUser {
//     constructor(public email: string, public password: string) {
        
//     }

//     public autenticate(): void {
//         console.log("email", super.email, "password", super.password)
//     }
// }

// const user01 = new User('user01@test.org', '12345678')
// user01.autenticate()