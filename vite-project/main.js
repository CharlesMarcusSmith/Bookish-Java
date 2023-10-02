import './style.css'

document.querySelector('#app').innerHTML = `
  <div>
    <h1>Bookish Frontend!</h1>
    <p class="im-scared">
      This is my first time doing a frontend :@
    </p>
  </div>
  <div>
    <p>
        Now to list all the books in the library:

    </p>
  </div>
`

function setupAllBooks() {
  fetch("http://localhost:8080/books")
      .then(response => response.json()) // this takes raw data to json
      .then(data => setMyData(data));   // this passes this new JSON 'data'.
}

function setMyData(data) {
// get some data - input parameter ^
// selected a new html element,
const element = document.querySelector("#bookdata") // element is something we named, not js termanology
// document is overview of page, selecting one item from doc, selecting the thing that has the #id - bookdata
// this is an empty div on line 33 and filling our element empty div

//const, var and let are used to describe variable
//put that data inside that html element
element.innerHTML = data    //JSON data selected line 20


for(let i = 0; i<data.length; i++){
    let bookTitle = data[i].title;
    element.innerHTML = bookTitle;
}
}

function setMyDataWeisje(data) {
    const element = document.querySelector('#all-books') //UNORDERED LIST
    for(const book of data){ //for each
        const listItem = document.createElement(`li`) //
        listItem.innerHTML = book.title //innnerHTML one way of setting html
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
