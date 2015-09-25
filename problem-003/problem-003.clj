(defn is-prime? [x]
	(loop [divisor 2]
		(cond
			(> divisor (/ x 2)) true
			(zero? (mod x divisor)) false
			:else (recur (inc divisor)))))

(defn next-prime [x]
	(if (is-prime? x)
		x
		(next-prime (inc x))))

(defn prime-factorization [x]
	(loop [current-value x
		   current-factor 2
		   factors (list)]
		(cond
			(= current-value 1) factors
			(zero? (mod current-value current-factor))
				(recur (/ current-value current-factor) current-factor (cons current-factor factors))
			:else
				(recur current-value (next-prime (inc current-factor)) factors))))

(defn problem-3 []
	(apply max (prime-factorization 600851475143)))
