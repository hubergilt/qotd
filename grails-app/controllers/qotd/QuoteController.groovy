package qotd

class QuoteController {

    // def index() { }
    static scaffold = true

    // def index = {
    //     redirect(action: home)
    // }

    // def home = {
    //     render"<h1>Real Programmers do not eat Quiche</h1>"
    // }

   // def random = {
   //     def staticAuthor = "Anonymous"
   //     def staticContent = "Real Programmers don't eat much quiche"
   //     [ author: staticAuthor, content: staticContent]
   // }

   // def random = {
   //     def staticQuote = new Quote(author: "Anonymous", content: "Real Programmers Don't eat quiche")
   //     [ quote : staticQuote]
   // }

  def quoteService
  def random = {
    def randomQuote = quoteService.getRandomQuote()
    [ quote : randomQuote ]
  }
    // def random = {
    //     def allQuotes = Quote.list()
    //     def randomQuote
    //     if (allQuotes.size()>0){
    //         def randomIdx = new Random().nextInt(allQuotes.size())
    //         randomQuote = allQuotes[randomIdx]
    //     } else {
    //         randomQuote = new Quote(author: "Anonymous", content: "Real Programmers Don't eat quiche")
    //     }
    //     [quote: randomQuote]
    // }

  def ajaxRandom = {
    def randomQuote = quoteService.getRandomQuote()
    render "<q>${randomQuote.content}</q>" +
           "<p>${randomQuote.author}</p>"
  }

}
