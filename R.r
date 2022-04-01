input <- file('stdin', 'r')

a <- readLines(input, n=1)
b <- as.numeric(readLines(input, n=1))
c <- as.numeric(readLines(input, n=1))

write(sprintf("TOTAL = R$ %.2f",b+c*0.15),'')
