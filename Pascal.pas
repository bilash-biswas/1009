var
    a : string;
    b : double;
    c : double;
    x : double;

begin
    read(a);
    read(b);
    read(c);
    x := c * 0.15 + b;
    writeln('TOTAL = R$ ', x:-1:2);
end.
