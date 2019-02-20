function tribonacci(signature,n){
    if(n == 0) {
        return [];
    } else if(n < 3) {
        return signature.slice(0, n);
    }
    for(i = 0; i < n-3; i++) {
        let sumOfLastThree = signature[0 + i] + signature[1 + i] + signature[2 + i];
        signature.push(sumOfLastThree);
    }
    return signature;
}
