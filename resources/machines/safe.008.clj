{:parts {:cpu9652 {:children nil, :saved-value 0, :color :blue, :pins {:lamp9644 {:x 290, :trigger false, :value 0}, :lamp9643 {:x 190, :trigger false, :value 0}, :probe9948 {:x 70, :trigger true, :value 0}}, :scale [0.3 0.07 0.3], :gates {:gate-not9654 {:type :not, :x 70, :y 80, :tab 0}}, :value 0, :functions nil, :type :cpu, :layer 1, :connections {:connection9655 {:points [:probe9948 :gate-not9654], :tab 0}, :connection9658 {:points [:probe9948 :lamp9643], :tab 0}, :connection9659 {:points [:gate-not9654 [300 80] :lamp9644], :tab 0}}, :tab 0}, :block10017-copy10036 {:children nil, :saved-value 0, :color [128 128 128], :pins nil, :scale (0.1 0.1 0.1), :value 0, :functions nil, :type :block, :layer 7, :connections nil}, :cylinder10038 {:children {:track10050 {:position [0.0 0.19999987 5.9604645E-7], :rotation [0.0 1.0 0.0 0.0]}, :track10051 {:position [2.9802322E-8 0.4000001 8.34465E-7], :rotation [0.0 1.0 0.0 0.0]}, :track10052 {:position [2.9802322E-8 0.29999992 7.1525574E-7], :rotation [0.0 1.0 0.0 0.0]}}, :saved-value 0, :color [128 128 128], :pins nil, :scale (0.5 0.2 0.5), :value 0, :functions nil, :type :cylinder, :layer 1, :connections nil}, :chip9945 {:children nil, :saved-value 0, :color :dark-gray, :pins nil, :scale [0.3 0.07 0.3], :value 0, :time 0.3200000151991844, :functions {:wagon9943 {:points [[0 0.75] [0.30000000000000004 0.25]], :relative false, :final-points [[0 0.75] [0.30000000000000004 0.25]]}}, :type :chip, :layer 1, :connections nil, :view {:offset [0.025 0.1], :zoom-x 0.5, :zoom-y 0.5}, :final-time 0.30000000000000004}, :chip9944 {:children nil, :saved-value 0, :color :dark-gray, :pins nil, :scale [0.3 0.07 0.3], :value 0, :time 0.3200000151991844, :functions {:wagon9943 {:points [[0 0.25] [0.30000000000000004 0.75]], :relative false, :final-points [[0 0.25] [0.30000000000000004 0.75]]}}, :type :chip, :layer 1, :connections nil, :view {:offset [0.025 0.1], :zoom-x 0.5, :zoom-y 0.5}, :final-time 0.30000000000000004}, :track10050 {:children {:cylinder10014 {:position [-2.9802322E-8 0.050000012 -1.1920929E-7], :rotation [0.0 1.0 0.0 0.0]}}, :saved-value 0.25, :color :red, :pins nil, :scale [0.1 0.1 0.1], :snap 0.25, :free true, :value 0.25, :functions nil, :type :track, :layer 8, :connections nil}, :track10052 {:children {:cylinder10015 {:position [2.9802322E-8 0.04999999 0.0], :rotation [0.0 1.0 0.0 0.0]}}, :saved-value 0.0, :color :red, :pins nil, :scale [0.1 0.19999999999999998 0.1], :snap 0.25, :free true, :value 0.0, :functions nil, :type :track, :layer 7, :connections nil}, :track10048-copy10057 {:children {:probe10049-copy10057 {:position [-1.1920929E-7 0.050000012 0.0], :rotation [0.0 1.0 0.0 0.0]}}, :saved-value 0, :color [51 51 51], :pins nil, :scale [0.1 0.5 0.1], :snap 0, :value 0, :functions nil, :type :track, :layer 6, :connections nil}, :cylinder10014 {:children {:block10017-copy10037 {:position [-8.940697E-8 1.7881393E-7 -0.4499998], :rotation [0.0 1.0 0.0 0.0]}, :track10048 {:position [0.19999993 -0.35000035 0.25000027], :rotation [1.0 -1.7616324E-7 -2.403428E-7 179.99997768819966]}}, :saved-value 0, :color [51 51 51], :pins nil, :scale [0.9 0.1 0.9], :value 0, :functions nil, :type :cylinder, :layer 8, :connections nil}, :lamp9643 {:children nil, :saved-value 0, :color :red, :pins nil, :scale [0.4 0.2 0.4], :dark-color [76 0 0], :value 0, :functions nil, :type :lamp, :layer 1, :connections nil}, :track10048 {:children {:probe10049 {:position [-1.1920929E-7 0.050000012 0.0], :rotation [0.0 1.0 0.0 0.0]}}, :saved-value 0, :color [51 51 51], :pins nil, :scale [0.1 0.29999999999999993 0.1], :snap 0, :free false, :value 0, :functions nil, :type :track, :layer 8, :connections nil}, :track10034 {:children {:block9935 {:position [0.0 1.1 0.0], :rotation [0.0 1.0 0.0 0.0]}}, :saved-value 0, :color [10 10 10], :pins nil, :scale [0.1 0.1 0.1], :snap 0, :value 0, :functions nil, :type :track, :layer 1, :connections nil}, :block9913 {:children {:cpu9652 {:position [0.75 0.6999996 -0.13500005], :rotation [-1.0 -4.3167855E-10 5.8207696E-11 90.00002299504568]}, :cylinder10038 {:position [1.1920929E-7 -2.3841858E-7 -0.10000032], :rotation [1.0 7.525907E-9 0.0 90.00000250447816]}, :chip9945 {:position [1.3499999 -0.5499999 -0.13499996], :rotation [-1.0 -4.3212392E-10 2.3283064E-10 89.99997518372149]}, :chip9944 {:position [1.7499999 -0.5499999 -0.13500011], :rotation [-1.0 -4.3212392E-10 2.3283064E-10 89.99997518372149]}, :track9941 {:position [1.0 0.05000019 -0.20000017], :rotation [-1.0 1.7767254E-10 3.4924597E-10 89.99998201391065]}, :block9967 {:position [1.75 -0.14999974 0.2000001], :rotation [1.0 1.4871471E-8 -1.4901163E-8 89.99998201391065]}, :cpu9947 {:position [0.95 -0.5499999 -0.13499981], :rotation [-1.0 1.1499312E-10 1.8626451E-9 89.99998201391065]}, :probe9949 {:position [1.9999999 0.29999995 -0.15000015], :rotation [-1.0 -1.6780188E-8 4.4703494E-8 90.00000250447816]}, :block10035 {:position [1.55 0.0 1.7881393E-7], :rotation [9.313226E-10 -9.313226E-10 -1.0 90.00000250447816]}}, :saved-value 0, :color :white, :pins nil, :scale (2.0999999999999996 2.2 0.19999999999999996), :value 0, :functions nil, :type :block, :layer 1, :connections nil}, :track10051 {:children {:cylinder10016 {:position [-2.9802322E-8 0.050000012 -1.1920929E-7], :rotation [0.0 1.0 0.0 0.0]}}, :saved-value -0.25, :color :red, :pins nil, :scale [0.1 0.30000000000000004 0.1], :snap 0.25, :free true, :value -0.25, :functions nil, :type :track, :layer 6, :connections nil}, :button9946 {:children nil, :saved-value 0, :color [255 0 0], :pins nil, :scale [0.5 0.2 0.5], :value 0, :functions nil, :type :button, :layer 1, :connections nil}, :ground-part {:children {:track9912 {:position [-1.8 0.20000002 -0.75], :rotation [0.0 1.0 0.0 0.0]}, :track10034 {:position [1.5 0.20000002 -0.7], :rotation [0.0 1.0 0.0 0.0]}, :button9946 {:position [2.25 0.2 -0.75], :rotation [0.0 1.0 0.0 0.0]}}, :saved-value nil, :color :dark-gray, :pins nil, :scale [12 0.2 12], :functions nil, :type :ground, :connections nil}, :wagon9943 {:children {:block9939 {:position [0.024999857 0.25 0.14999998], :rotation [0.0 0.0 1.0 90.00000250447816]}}, :saved-value 0.25, :color [51 51 51], :pins nil, :scale [0.15 0.15 0.15], :snap 0, :final-points [[0 0.75] [0.30000000000000004 0.25]], :value 0.25, :functions nil, :track-lengths (1.0000001192092967), :type :wagon, :loop-fn ([0.0 [0.0 -1.0000001 -1.1920929E-7]] [1.0 [0.0 0.0 0.0]]), :layer 1, :connections nil, :controlling-chip :chip9945}, :block9936 {:children {:block9938 {:position [-0.1500001 0.15000004 -0.20000005], :rotation [0.0 1.0 0.0 0.0]}}, :saved-value 0, :color [10 10 10], :pins nil, :scale (0.4 0.2 0.1), :value 0, :functions nil, :type :block, :layer 1, :connections nil, :collision true}, :block10033 {:children nil, :saved-value 0, :color [128 128 128], :pins nil, :scale (0.1 0.1 0.1), :value 0, :functions nil, :type :block, :layer 1, :connections nil}, :probe10049-copy10057 {:children nil, :saved-value 1, :color :purple, :pins nil, :scale [0.1 0.1 0.1], :value 1, :functions nil, :type :probe, :layer 6, :connections nil}, :block10486 {:type :block, :color :white, :value 0, :layer 1, :scale (0.5 0.2 0.7999999999999999), :saved-value 0, :children nil}, :track10048-copy10056 {:children {:probe10049-copy10056 {:position [-1.1920929E-7 0.050000012 0.0], :rotation [0.0 1.0 0.0 0.0]}}, :saved-value 0, :color [51 51 51], :pins nil, :scale [0.1 0.3999999999999999 0.1], :snap 0, :value 0, :functions nil, :type :track, :layer 7, :connections nil}, :track9912 {:children {:block9913 {:position [0.9499998 1.1000001 -5.9604645E-8], :rotation [0.0 1.0 0.0 0.0]}}, :saved-value 0.0010308901938712303, :color [10 10 10], :pins nil, :scale [0.1 0.1 0.1], :snap 0, :free true, :value 0.0010308901938712303, :functions nil, :type :track, :layer 1, :connections nil}, :block9938 {:children nil, :saved-value 0, :color [10 10 10], :pins nil, :scale (0.7 0.1 0.5), :value 0, :functions nil, :type :block, :layer 4, :connections nil, :collision true}, :block10017-copy10037 {:children nil, :saved-value 0, :color [51 51 51], :pins nil, :scale (0.1 0.1 0.1), :value 0, :functions nil, :type :block, :layer 8, :connections nil}, :track9941 {:children {:track9942 {:position [1.0 0.0 0.0], :rotation [0.0 0.0 -1.0 90.00000250447816]}}, :saved-value 0, :color [10 10 10], :pins nil, :scale [0.1 0.1 0.1], :snap 0, :value 0, :functions nil, :type :track, :layer 1, :connections nil}, :probe10049 {:children nil, :saved-value 1, :color :purple, :pins nil, :scale [0.1 0.1 0.1], :value 1, :functions nil, :type :probe, :layer 8, :connections nil}, :block9936-copy9937 {:children nil, :saved-value 0, :color [10 10 10], :pins nil, :scale (0.4 0.2 0.1), :value 0, :functions nil, :type :block, :layer 1, :connections nil, :collision true}, :block10017 {:children nil, :saved-value 0, :color [51 51 51], :pins nil, :scale (0.1 0.1 0.1), :value 0, :functions nil, :type :block, :layer 6, :connections nil}, :block9935 {:children {:block9936 {:position [0.0 0.39999998 -0.20000017], :rotation [-1.0 0.0 0.0 90.00000250447816]}, :block9936-copy9937 {:position [0.0 0.0 -0.20000005], :rotation [-1.0 0.0 0.0 90.00000250447816]}}, :saved-value 0, :color :white, :pins nil, :scale (0.4 2.2 0.2), :value 0, :functions nil, :type :block, :layer 1, :connections nil, :collision true}, :lamp9644 {:children nil, :saved-value 1, :color [0 255 0], :pins nil, :scale [0.4 0.2 0.4], :dark-color [0 76 0], :value 1, :functions nil, :type :lamp, :layer 1, :connections nil}, :block9967 {:children {:block9968 {:position [-0.14999998 0.14999998 0.0], :rotation [0.0 1.0 0.0 0.0]}}, :saved-value 0, :color [51 51 51], :pins nil, :scale (0.5 0.19999999999999996 0.19999999999999996), :value 0, :functions nil, :type :block, :layer 1, :connections nil}, :block9968 {:children nil, :saved-value 0, :color [51 51 51], :pins nil, :scale (0.8 0.1 0.19999999999999996), :value 0, :functions nil, :type :block, :layer 1, :connections nil}, :block9939 {:children {:probe9948 {:position [-1.1920929E-7 0.0 0.14999986], :rotation [1.0 -3.2847353E-7 -1.5610985E-7 90.00000250447816]}, :block10033 {:position [0.4499998 -1.1920929E-7 -1.3113022E-6], :rotation [4.4482636E-7 3.932786E-8 -1.0 90.00005714599153]}}, :saved-value 0, :color [51 51 51], :pins nil, :scale (0.8 0.1 0.19999999999999998), :value 0, :functions nil, :type :block, :layer 1, :connections nil, :collision true}, :cylinder10016 {:children {:block10017 {:position [0.0 0.0 -0.25], :rotation [0.0 1.0 0.0 0.0]}, :track10048-copy10057 {:position [0.0 -0.5500002 -0.25000012], :rotation [1.0 2.6775524E-8 -1.4774727E-7 180.00000500895632]}}, :saved-value 0, :color [51 51 51], :pins nil, :scale (0.5 0.1 0.5), :value 0, :functions nil, :type :cylinder, :layer 6, :connections nil}, :probe9948 {:children nil, :saved-value 0, :color :purple, :pins nil, :scale [0.1 0.1 0.1], :value 0, :functions nil, :type :probe, :layer 3, :connections nil}, :cpu9947 {:children nil, :saved-value 0, :color :blue, :pins {:button9946 {:x 60, :trigger true, :value 0}, :chip9944 {:x 490, :trigger false, :value 0}, :chip9945 {:x 390, :trigger false, :value 0}, :probe9948 {:x 120, :trigger false, :value 1}, :probe10049 {:x 230, :trigger false, :value 1}, :probe10049-copy10056 {:x 210, :trigger false, :value 1}, :probe10049-copy10057 {:x 250, :trigger false, :value 1}}, :scale [0.3 0.07 0.3], :gates {:gate-and9950 {:type :and, :x 120, :y 80, :tab 0}, :gate-not9954 {:type :not, :x 120, :y 50, :tab 1}, :gate-and9955 {:type :and, :x 120, :y 100, :tab 1}, :gate-and10062 {:type :and, :x 230, :y 50, :tab 0}}, :value 0, :functions nil, :type :cpu, :layer 1, :connections {:connection9953 {:points [:gate-and9950 [390 80] :chip9945], :tab 0}, :connection9956 {:points [:button9946 [60 100] :gate-and9955], :tab 1}, :connection9957 {:points [:probe9948 :gate-not9954], :tab 1}, :connection9951 {:points [:probe9948 :gate-and9950], :tab 0}, :connection10065 {:points [:probe10049-copy10056 :gate-and10062], :tab 0}, :connection9959 {:points [:gate-and9955 [490 100] :chip9944], :tab 1}, :connection10067 {:points [:probe10049-copy10057 :gate-and10062], :tab 0}, :connection9952 {:points [:button9946 [60 80] :gate-and9950], :tab 0}, :connection10066 {:points [:probe10049 :gate-and10062], :tab 0}, :connection9958 {:points [:gate-not9954 :gate-and9955], :tab 1}, :connection10069 {:points [:gate-and10062 :gate-and9950], :tab 0}}, :tab 2}, :probe10049-copy10056 {:children nil, :saved-value 1, :color :purple, :pins nil, :scale [0.1 0.1 0.1], :value 1, :functions nil, :type :probe, :layer 7, :connections nil}, :track9942 {:children {:wagon9943 {:position [0.0 0.0 0.0], :rotation [0.0 1.0 0.0 0.0]}}, :saved-value 0, :color [128 128 128], :pins nil, :scale [0.1 1 0.1], :snap 0, :value 0, :functions nil, :type :track, :layer 1, :connections nil}, :probe9949 {:children nil, :saved-value 0, :color :purple, :pins nil, :scale [0.1 0.1 0.1], :value 0, :functions nil, :type :probe, :layer 3, :connections nil}, :cylinder10015 {:children {:block10017-copy10036 {:position [-8.940697E-8 5.9604645E-8 -0.3499998], :rotation [0.0 1.0 0.0 0.0]}, :track10048-copy10056 {:position [0.25000003 -0.44999966 -0.10000038], :rotation [1.0 9.3132235E-10 2.217202E-9 180.00001866933468]}}, :saved-value 0, :color [128 128 128], :pins nil, :scale [0.7 0.1 0.7], :value 0, :functions nil, :type :cylinder, :layer 7, :connections nil}, :block10035 {:children {:lamp9643 {:position [-0.74999964 -0.15000004 -0.2999997], :rotation [1.0 7.9157303E-10 -2.3782081E-7 90.00000250447816]}, :lamp9644 {:position [-0.7499994 0.15000004 -0.2999997], :rotation [1.0 7.9157303E-10 -2.3782081E-7 90.00000250447816]}, :block10486 {:position [-0.7499993 2.9802322E-7 -0.19999981], :rotation [-1.0 -3.5801872E-7 -2.4020542E-7 90.00007080636986]}}, :saved-value 0, :color [179 179 179], :pins nil, :scale (2.2 1.0 0.2), :value 0, :functions nil, :type :block, :layer 2, :connections nil}}, :camera {:vector [0 0 1], :distance 31.512470486230455, :x-angle 25.4000000000005, :y-angle -755.3999999999812, :pivot [0.1399900527988992 1.2109753509483687 -0.8060513538558309], :eye [16.630003175357494 14.72778099975208 22.397636313990848]}, :visible-layers [7 6 8 1 2 4], :sphere-transforms []}