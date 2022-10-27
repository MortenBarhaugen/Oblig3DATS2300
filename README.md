# Obligatorisk oppgave 3 i Algoritmer og Datastrukturer

Denne oppgaven er en innlevering i Algoritmer og Datastrukturer. 
Oppgaven er levert av følgende student:
* Morten Barhaugen, S364518, s3645186@oslomet.no


# Oppgavebeskrivelse

I oppgave 1 trengtes kun én liten endring fra programkode 5.2.3 a) på linje 101 i SBinTre fra p = new Node<>(verdi) til p = new Node<>(verdi, q)

I oppgave 2 så brukte jeg en hjelpevariabel "ant" til å telle antall ganger "verdi" forekommer i treet med utgangspunkt i roten. Bruker variabelen "cmp" til å sammenligne verdi og p.verdi, og resultatet vil gi om vi skal gå videre til venstre eller til høyre i treet. Dersom p.verdi == verdi blir antall økt med 1 og går videre til høyre i treet. Dette skjer helt til p == null.

Oppgave 3: førstePostorden(): Sjekker om p har et venstrebarn, hvis det ikke har et venstrebarn sjekkes om det har et høyrebarn. Dersom det ikke har et høyrebarn er det første node i postorden. Denne returneres. NestePostorden(): Finner den neste noden i treet med p som rot. Instansierer en node f = p.forelder. Sjekker om f er null og returnerer null dersom den er det. Hvis p er det høyre barnet til forelderen eller forelders høyre barn er nul (p er enebarn) er forelder neste i postorden. Hvis ikke kalles førstePostorden() med forelders høyrebarn som parameterverdi.
