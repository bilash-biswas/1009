A = tostring(io.read())
B = io.read()
C = io.read()
result = C * 0.15 + B
print("TOTAL = R$ "..string.format( "%.2f", result ))
