
import scala.collection.mutable
import java.util.Scanner
import java.util.Iterator
import java.io.File

object concordance {

    // Regex to remove invalid chars from the text
    val invalid_chars = """[^\w'.]""".r

    // Split into sentences
    val sentence_sep = """\.[ \n]"""

    type MapOfLists = mutable.HashMap[String, mutable.ArrayBuffer[Int]]

    /**
    The result of this function will be a list of lists [ [word, ...], ... ]
    The outer list will contain the 'sections' and each section will contain a list of words
    */
    def split_into_words(input: String): Array[String] = {
        return invalid_chars.replaceAllIn(input, " ")
              .toLowerCase
              .split(" +")
              .map(_.trim)
              .filter(_ != "")
    }

    /**
    Count of how often each word appears and citations of where each word appears in the text

    :param input: a string iterator
    Taking an iterator over reading the whole string into memory will reduce the memory footprint
    :returns: a data structure of {word: [section_num, ... ] }
    */
    def concordance(input: java.util.Iterator[String]): MapOfLists = {
        // Create an empty result value
        var result = new MapOfLists()

        var section_num = 0

        while (input.hasNext) {
            val section = split_into_words(input.next())

            // Loop over the words in a section
            for (word <- section) {
                // Get the record of which sections the word is in
                var word_record = result.getOrElseUpdate(word, mutable.ArrayBuffer.empty[Int])
                // Append the current section to the array
                word_record += section_num
            }
            section_num += 1
        }
        return result
    }

    /**
    Print the result of the concordance function to stdout.

    :param result: result of the concordance function
    */
    def printer(result: MapOfLists) = {
        for((word, record) <- result.toSeq.sortBy(_._1)) {
            val total_occurrences = record.length
            val sentence_numbers = record mkString  ","
            println(f"$word%-15s {$total_occurrences:$sentence_numbers}")
        }
    }

    /**
     * The main function this will accept input on stdin and 
     * output the result to stdout
     */
    def main(args: Array[String]): Unit = {
        val input =  new Scanner(System.in).useDelimiter(sentence_sep)
        val concordance_result = concordance(input)
        printer(concordance_result)
    }





}
