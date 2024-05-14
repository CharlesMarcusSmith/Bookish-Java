import './style.css'

document.querySelector('#app').innerHTML = `
   <div id="back-panel">
        <div id="content">
            <div id=hs><h1>Bookish Frontend</h1></div>
            <p class="im-scared">
              <h2>All the books in the library:</h2>
              <div id = "bookdata" >  </div>
            </p>
        </div>
   </div>
`

function setupAllBooks() {
  fetch("http://localhost:8080/books")
      .then(response => response.json()) // this takes raw data to json
      .then(data => setMyData(data));   // this passes this new JSON data into 'data' object, and passes in into method.
}

function setMyData(data) {
// get some data - input parameter ^
// selected a new html element,
const element = document.querySelector("#bookdata") // Book data is line 9; element is something we named, not js termanology
// document is overview of page, selecting one item from doc, selecting the thing that has the #id - bookdata
// this is an empty div on line 33 and filling our element empty div

//const, var and let are used to describe variable
//put that data inside that html element
element.innerHTML = data    //JSON data selected line 20

//Looping through the JSON array
for(let i = 0; i<data.length; i++){
    let bookTitle = data[i].title; // retrieving the JSON object at position i, getting the title, and saving as bookTitle variable.
    element.innerHTML = bookTitle; // updating the element variable we made to the value of book title.
}
}

function setMyDataWeisje(data) {
    const element = document.querySelector('#all-books') //UNORDERED LIST
    for(const book of data){ //for each
        const listItem = document.createElement(`li`) //
        listItem.innerHTML = book.title //innerHTML one way of setting html
        element.appendChild(listItem) //can append children if they are HTML items themselves.
        // element is the parent of line 29

        // some bits like java, some bits are web specific like interacting like html.
        // like getting specific items from html or creating html
        // slightly different syntax and trusts the developer that the data type matches its functional use.
        // Its the innerHTML function that converts these scrupts to HTML within the div this app is called
        // Cant specify dynamic stuff like data,
    }
}


setupAllBooks()
