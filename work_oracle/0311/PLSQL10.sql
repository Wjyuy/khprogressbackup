DECLARE
    i NUMBER := 1;
    name VARCHAR2(20) := 'Kim';
    sal NUMBER :=0;
BEGIN
    WHILE i<=1000000 LOOP
        if i mod 2=0 then
            name := 'Kim' || to_char(i);
            sal := 300;
        elsif i MOD 3=0 THEN
            name := 'park' || to_char(i);
            sal := 400;
        elsif i MOD 5=0 THEN
            name := 'hong' || to_char(i);
            sal := 500;
        else
            name := 'shin' || to_char(i);
            sal := 250;
        end if;
        INSERT INTO emp3 VALUES(i,name,sal);
        i := i+1;
    end LOOP;
END;