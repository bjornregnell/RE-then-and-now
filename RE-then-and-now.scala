//> using lib "taggy:taggy:0.0.5,url=https://github.com/bjornregnell/taggy/releases/download/v0.0.5/taggy_3-0.0.5.jar"
//> using scala "3.3.0"

import taggy.*

@main def makeSlides = slides.toPdf(out = "RE-then-and-now", dir = "tex")

val arrow = "\\hspace{1em}$\\longrightarrow$\\hspace{1em}"
def fromTo(a: String, b: String) = s"\\pause\\hspace{1em}`$a` $arrow `$b`"

def slides = document("RE Then and Now"):
  frame("Requirements Engineering **Then and Now**"):
    p("What is Requirements Engineering?")
    space(1)
    p("A **brief reflection** over the past 30 years of")
    p("Requirements Engineering research (and teaching)")
    p("1993-2023.")
    space(3)
    p("Professor Björn Regnell, LTH, Lund University")
    p("https://cs.lth.se/bjornregnell")
    space(2)
    p("15 min talk, Farewell Symposium of Professor Claes Wohlin")
    p("Slides here: https://github.com/bjornregnell/RE-then-and-now")
    
  frame("Starting-point: RE at ''**then**''"):
    image("../img/RE-book-2005-and-proceedings-1995.jpg", width = 1.05)

  frame("RE evolution from 1993 to 2023"):
    p("RE has evolved over the past 30 years by shifting focus:")
    space(2)
    p(fromTo("Complete     ", "Economical"))
    p(fromTo("Specification", "Prioritization"))
    p(fromTo("Analytical   ", "Empirical"))
    p(fromTo("Toy examples ", "Industrial cases"))
    p(fromTo("Proactive    ", "Reactive"))
    p(fromTo("Closed       ", "Open"))
    p(fromTo("Manual       ", "Smart"))
    space(2)
    p("\\pause see these trends for example at RE'14 in Karlskrona  https://re14.lmsteiner.com/")

  frame("Software Engineering teaching from 1993--2023"):
    p("The ''Swedish school'' of SE teaching.")
    space(2)
    p(fromTo("Analytical     ", "Empirical"))
    p(fromTo("Passive reading", "Activating projects"))
    p(fromTo("Ivory tower    ", "Industrial relevance"))

  frame("RE at ''**now**'' and forward"):
    p("Some current/future topics that I believe are hot:")
    itemize:
      p("**RE for OSS**: elevate your open source community")
      p("**Open RE:** engage your users")
      p("**AI for RE**: smart, rapid RE")
      p("**RE for AI**: relevant, good AI")
    space(1)
    p("\\pause My current personal favorites:")
    itemize:
      p("**RE-aware code, RE at runtime**")
      p("**RE for programming languages**\\\\(as I'm member of the **Scala** committee)")
      p("**RE by end-user programming**\\\\(nowadays known as **Low Code/No Code**)")
    space(1)
    p("\\pause see emerging RE areas in the REFSQ series\\\\e.g. at REFS'2023 in Barcelona: https://2023.refsq.org/")
    p("and REFSQ'2024 in Winterthur, Switzerland: https://2024.refsq.org/")
  
  frame(" "):
    p("\\centering**Tank You for listening!**")
    image("../img/br.jpg", width= 0.35)
    p("https://cs.lth.se/bjornregnell")
    p("https://github.com/bjornregnell/RE-then-and-now")

