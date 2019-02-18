function solution(str){
    string = "";
    for(i = 0; i < str.length; i++) {
        string += str[str.length - 1 - i];
    }
    return string;
}