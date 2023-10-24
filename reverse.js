// Take a sentence as an input and reverse every word in that sentence. 

function reverseWords(sentence) {
    let words = sentence.split(' ');
    let reversedWords = [];

    for (let word of words) {
        let reversedWord = '';
        for (let i = word.length - 1; i >= 0; i--) {
            reversedWord += word[i];
        }
        reversedWords.push(reversedWord);
    }

    return reversedWords.join(' ');
}
let inputSentence = "This is a sunny day";
let reversedSentence = reverseWords(inputSentence);
console.log(reversedSentence);
