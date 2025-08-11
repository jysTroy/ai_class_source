type User = {
    name: string
    age: number
}

type Userkey = keyof User // 'name' | 'age'

let key: Userkey = 'name';
// key = 'email'