document.write("<p>Hello World!</p>");

function generateMessage() {
    document.getElementById("output").innerHTML = "This is a generated message!"

}

function generateUsers() {
    var user1 = new User("Fredrik", 31);
    var user2 = new User("Johanna", 28);

    user1.favouritecolour = "Blue";

    document.getElementById("output").innerHTML = user2.greetings();
}