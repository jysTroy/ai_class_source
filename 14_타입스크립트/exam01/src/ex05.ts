function sayHello(name: string): void { 
    // 매개변수가 string, 반환값은 없다.
    // return name
}

function sayHello2(name: string): string {
    return `${name}아 그래그래 반갑다.`
}

type CallbackType = (string) => void // 함수 타입

function sayHello3(name: string, callback: (string?) => void) {
    console.log('name', name)
    callback(name)
}