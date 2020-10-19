package piano.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.nfinderc.R


class SetNewPwActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resetpw)
    }
}

// maybe helps to try with: https://www.onlinepianist.com/virtual-piano


// Pseudo code:

// Each note has a specific character, [C, C#, D, D#, E, F, F#, G, G#, A, A#, B], We probably need to skip pitch, i.e. difference between C1 and C2
// Define these notes with an enum
// Each one maps directly to a button in the UI

// When the user enters a passcode:

// Button for "C" sends "C" to the function that adds a new letter to the passcode.

// I don't remember the syntax so just write something similar, but probably wrong:


// enum note = C, C#, D, D#, E, F, F#, G, G#, A, A#, B

// list userSavedPassword = [C, C, G, G, A, A, G]; //e.g.

// list passwordToMatchThisLogin = getPasscodeFromStartNote();


// This is what the user has input. Should be the same as passwordToMatchThisLogin, to be authenticated. Described in authenticationSuccess()
// list currentPasscodeAttempt = new list();

// maxLength = 10 (?)

// startNote = D;

// function addNoteToPassWordAttempt(note userInputNote) {
        // add userInputNote to back of list currentPasscodeAttempt
        // if not already authenticated e.g., or perhaps a pause if you insert incorrect password?
//}

// function undo() {
    // remove element at back of list currentPasscodeAttempt, and update index to -1
//}

//


// function userConfirmPasswordInput() {
    // save etc, confirm and play it again?
//}



//not sure if same functions should be used for authentication as for creating password

// Things for authentication:

// Randomly pick an element from our list [C, C#, D, D#, E, F, F#, G, G#, A, A#, B]
// Idea to not implement but perhaps suggest: Incrementally add more keys. Update probability of different keys showing up over time. When you've mastered all, suggest changing passcode.



// function randomizeStartNote() {
    // startNote = getRandom [C, C#, D, D#, E, F, F#, G, G#, A, A#, B];
//}
//Behavior could either be that it randomizes one each time you restart the app. Or that it remembers which when you restart, to not cheat. Still if you input incorrectly 3 times it maybe changes?

// Write out the start note in the UI, so the user knows what note/key to start with.

// Then internally, convert the password they've saved so it starts on that randomized start note!
// Example:
    // the user entered [C, C, G, G, A, A, G]
    // The startNote randomly became D
    // Then the correct input from the user should be [D, D, A, A, B, B, A]
    // Why? Because C -> D = 2 steps in [C, C#, D, D#, E, F, F#, G, G#, A, A#, B]. '
    // [C, C, G, G, A, A, G] -> + 2 -> [D, D, A, A, B, B, A]

// function getPasscodeFromStartNote() {
    // note distanceBetweenSavedStartNoteAndRandomizedStartNote = distanceBetweenNotes(startNote, userSavedPassword[0]);
    // return transposePasscode(distanceBetweenSavedStartNoteAndRandomizedStartNote);
//}


// Helper function to getPasscodeFromStartNote()
// function distanceBetweenNotes(note startNote, note firstNoteInUserSavedPassword) {
    // not sure what the best algorithm is, can change if you know better way.

    // Mappa dem istället kanske!

    // Sort [C, C#, D, D#, E, F, F#, G, G#, A, A#, B] so that firstNoteInUserSavedPassword (D in example) is at index 0
        // Output: [ D, D#, E, F, F#, G, G#, A, A#, B, C, C#]

    // Modulo

    // count as you go through list until you find startNote
    // if set up correctly this should be the number of steps between them (e.g. 2)
    // return this value
//}

// Helper function to getPasscodeFromStartNote()
// not good for a library, would make more sense to insert what to transpose to instead of nr of steps, but probably ok for our implementation
// function transposePasscode(int howManySteps) {
        // list transposedPasscode = userSavedPassword;
        // loop for each element in transposedPasscode and transpose
            // e.g. from [C, C, G, G, A, A, G]
            // C -> D
            // C -> D
            // G -> A
            // ...
        // return transposedPasscode; // [D, D, A, A, B, B, A]
// }



// function authenticationSuccess() {
    // if currentPasscodeAttempt.length == passwordToMatchThisLogin.length
    // then
        // if passwordToMatchThisLogin == currentPasscodeAttempt
        // then true;
        // else false;
    // else false; // Not authenticated.
//}







// Optional
// function clear() {
// Clear currentPasscodeAttempt and set index to 0
//}