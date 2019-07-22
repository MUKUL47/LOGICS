function find_3QuestionMark_Between10_BruteForce(s) {
    /*
    Algo : O(n^2+n) worst
    Iterate array 1st time to keep track of numbers store then in dictionary i.e { INDEX : VALUE }
    Iterate every item in dictionary and check if dictionary[currentIndex].Value+dictionary[currentIndex].Value === 10
        Then check if Index range between then is >=4 i.e can hold atleast 3 question mark
            Iterate Again with indexes and count how many '?' occured if excatly equal to 3 
                then RETURN TRUE 
    return FALSE
    */
    let keepTrack = []
    s.split('').forEach((val, index) => {
        if (s.charCodeAt(index) >= 48 && s.charCodeAt(index) <= 57) {
            keepTrack.push({
                i: index,
                v: val
            })
        }
    })
    for (let i = 0; i < keepTrack.length - 1; i++) {
        let startIndex = keepTrack[i].i,
            endIndex = keepTrack[i + 1].i;
        let sum = keepTrack[i].v.charCodeAt(0) - 48 + keepTrack[i + 1].v.charCodeAt(0) - 48;
        if (endIndex - startIndex >= 4 && sum == 10) {
            let times = 0;
            for (let j = startIndex + 1; j < endIndex; j++) {
                if (s.charAt(j) === '?') {
                    times += 1
                }
            }
            if (times === 3) {
                return true
            }
        }

    }
    return false
}

console.log(find_3QuestionMark_Between10_BruteForce("aa6?9"))
console.log(find_3QuestionMark_Between10_BruteForce("dsa5???23???7"))
console.log(find_3QuestionMark_Between10_BruteForce("acc?7??sss?3rr1??????5"))
console.log(find_3QuestionMark_Between10_BruteForce("aa2???9"))
console.log(find_3QuestionMark_Between10_BruteForce("aa5????5"))