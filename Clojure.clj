(let [num1 (do (read-line))
     num2 (do (Double/parseDouble (read-line)))
     num3 (do (Double/parseDouble (read-line)))] 
  (println "TOTAL = R$" (format "%.2f" (+ num2 (* num3 0.15 )))))
