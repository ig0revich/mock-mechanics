{:parts {:cpu35176 {:children nil, :saved-value 0, :color :blue, :pins {:button35174 {:x 110, :trigger true, :value 0}, :chip35173 {:x 330, :trigger false, :value 0}, :chip35177 {:x 410, :trigger false, :value 0}, :probe35182 {:x 220, :trigger false, :value 1}}, :scale [0.3 0.07 0.3], :gates {:gate-and35178 {:type :and, :x 220, :y 100, :tab 0}, :gate-not35184 {:type :not, :x 220, :y 50, :tab 1}, :gate-and35185 {:type :and, :x 220, :y 100, :tab 1}}, :value 0, :functions nil, :type :cpu, :layer 1, :connections {:connection35179 {:points [:button35174 [110 100] :gate-and35178], :tab 0}, :connection35180 {:points [:gate-and35178 [330 100] :chip35173], :tab 0}, :connection35183 {:points [:probe35182 :gate-and35178], :tab 0}, :connection35186 {:points [:button35174 [110 100] :gate-and35185], :tab 1}, :connection35187 {:points [:probe35182 :gate-not35184], :tab 1}, :connection35188 {:points [:gate-not35184 :gate-and35185], :tab 1}, :connection35189 {:points [:gate-and35185 [410 100] :chip35177], :tab 1}}, :tab 1}, :probe35181 {:children nil, :saved-value 1, :color :purple, :pins nil, :scale [0.1 0.1 0.1], :value 1, :functions nil, :type :probe, :layer 1, :connections nil}, :probe35182 {:children nil, :saved-value 1, :color :purple, :pins nil, :scale [0.1 0.1 0.1], :value 1, :functions nil, :type :probe, :layer 1, :connections nil}, :block35168 {:children {:track35170 {:position [0.3 0.3 0.35000002], :rotation [1.0 0.0 0.0 90.00000250447816]}, :chip35173 {:position [0.25 0.25 -0.28500003], :rotation [-1.0 0.0 0.0 90.00000250447816]}, :button35174 {:position [-0.25 0.6 0.0], :rotation [0.0 1.0 0.0 0.0]}, :cpu35176 {:position [-0.25 0.25 -0.28500003], :rotation [-1.0 0.0 0.0 90.00000250447816]}, :chip35177 {:position [0.25 -0.25 -0.28500003], :rotation [-1.0 0.0 0.0 90.00000250447816]}, :probe35181 {:position [0.45 0.19999999 0.3], :rotation [1.0 0.0 0.0 90.00000250447816]}}, :saved-value 0, :color :white, :pins nil, :scale (1.0 1.0 0.5), :value 0, :functions nil, :type :block, :layer 1, :connections nil}, :track35191 {:children nil, :saved-value 0, :color :red, :pins nil, :scale [0.1 0.1 0.1], :snap 0, :value 0, :functions nil, :type :track, :layer 1, :connections nil}, :ground-part {:children {:block35168 {:position [-2.5 0.6 -1.25], :rotation [0.0 1.0 0.0 0.0]}, :block35190 {:position [-2.5 0.6 0.75], :rotation [0.0 1.0 0.0 0.0]}, :block35168-copy35192 {:position [2.0 0.6 0.75], :rotation [0.0 1.0 0.0 180.00000500895632]}, :block35190-copy35193 {:position [2.0 0.6 -1.25], :rotation [0.0 1.0 0.0 0.0]}}, :saved-value nil, :color :dark-gray, :pins nil, :scale [12 0.2 12], :functions nil, :type :ground, :connections nil}, :block35190 {:children nil, :saved-value 0, :color :white, :pins nil, :scale (1.0 1.0 0.5), :value 0, :functions nil, :type :block, :layer 2, :connections nil}, :chip35173 {:children nil, :saved-value 0, :color :dark-gray, :pins nil, :scale [0.3 0.07 0.3], :value 0, :time 1.0240000486373901, :functions {:track35170 {:points [[0 0] [1.0 0.15]], :relative false, :final-points [[0 0] [1.0 0.15]]}, :track35170-copy35192 {:points [[0 0] [1.0 0.15]], :relative false, :final-points [[0 0] [1.0 0.15]]}}, :type :chip, :layer 1, :connections nil, :view {:offset [0.08014153838157653 0.23992691548840644], :zoom-x 0.5, :zoom-y 2.7799586567461194}, :final-time 1.0}, :button35174 {:children nil, :saved-value 0, :color :red, :pins nil, :scale [0.5 0.2 0.5], :value 0, :functions nil, :type :button, :layer 1, :connections nil}, :block35171-copy35192 {:children {:track35191-copy35192 {:position [-0.8499998 0.7500006 0.0], :rotation [0.0 1.0 0.0 0.0]}}, :saved-value 0, :color [0 145 0], :pins nil, :scale (2.2 1.3 0.1), :value 0, :functions nil, :type :block, :layer 1, :connections nil}, :block35171 {:children {:probe35182 {:position [-0.70000017 -0.6 0.10000014], :rotation [1.0 -5.4363674E-8 -3.5527137E-15 89.99998201391065]}, :track35191 {:position [-0.85000026 0.7500002 -2.3841858E-7], :rotation [0.0 1.0 0.0 0.0]}}, :saved-value 0, :color [0 0 255], :pins nil, :scale (2.2 1.3 0.1), :value 0, :functions nil, :type :block, :layer 1, :connections nil}, :track35191-copy35192 {:children nil, :saved-value 0, :color :red, :pins nil, :scale [0.1 0.1 0.1], :snap 0, :value 0, :functions nil, :type :track, :layer 1, :connections nil}, :track35170-copy35192 {:children {:block35171-copy35192 {:position [0.85000014 0.6499999 2.3841858E-7], :rotation [0.0 1.0 0.0 0.0]}}, :saved-value 0.0, :color :red, :pins nil, :scale [0.1 0.1 0.1], :snap 0, :final-points [[0 0.15] [1 0.0]], :value 0.0, :functions nil, :type :track, :layer 1, :connections nil}, :track35170 {:children {:block35171 {:position [0.85000014 0.6500001 0.0], :rotation [0.0 1.0 0.0 0.0]}}, :saved-value 0.0, :color :red, :pins nil, :scale [0.1 0.1 0.1], :snap 0, :final-points [[0 0.15] [1 0.0]], :value 0.0, :functions nil, :type :track, :layer 1, :connections nil}, :block35168-copy35192 {:children {:track35170-copy35192 {:position [0.3 0.3 0.35000002], :rotation [1.0 0.0 0.0 90.00000250447816]}}, :saved-value 0, :color :white, :pins nil, :scale (1.0 1.0 0.5), :value 0, :functions nil, :type :block, :layer 1, :connections nil}, :chip35177 {:children nil, :saved-value 0, :color :dark-gray, :pins nil, :scale [0.3 0.07 0.3], :value 0, :time 1.0240000486373901, :functions {:track35170 {:points [[0 0.15] [1 0.0]], :relative false, :final-points [[0 0.15] [1 0.0]]}, :track35170-copy35192 {:points [[0 0.15] [1 0.0]], :relative false, :final-points [[0 0.15] [1 0.0]]}}, :type :chip, :layer 1, :connections nil, :view {:offset [0.0995156705379486 0.2648073710457939], :zoom-x 0.5, :zoom-y 3.0579545224207316}, :final-time 1}, :block35190-copy35193 {:children nil, :saved-value 0, :color :white, :pins nil, :scale (1.0 1.0 0.5), :value 0, :functions nil, :type :block, :layer 2, :connections nil}}, :camera {:vector [0 0 1], :distance 42.47487944010914, :x-angle 37.39999999999994, :y-angle -200.59999999999945, :pivot [-0.24422020291685698 1.4210854715202004E-14 0.20995296463120106], :eye [-12.116298144811388 25.798217773437514 -31.375187263640285]}, :visible-layers [1 2], :sphere-transforms []}