{:ground-children {:ground-part {:position [0.0 0.0 0.0], :rotation [-1.0 0.0 0.0 90.00000250447816]}}, :parts {:block8668 {:type :block, :color [255 255 0], :value 0, :scale (1.5 0.1 0.5), :children {:probe8682 {:position [0.7 -0.100000024 0.0], :rotation [1.0 -4.371139E-8 0.0 180.00000500895632]}}, :functions nil}, :block8671 {:type :block, :color :white, :value 0, :scale (0.5 1.7000000000000002 0.5), :children {:probe8683 {:position [0.3 0.5 0.0], :rotation [0.0 0.0 -1.0 90.00000250447816]}, :cpu8685 {:position [0.0 -0.6 0.3], :rotation [1.0 0.0 0.0 90.00000250447816]}}, :functions nil}, :probe8683 {:type :probe, :color :purple, :value 1, :scale [0.1 0.1 0.1], :children nil}, :probe8682 {:type :probe, :color :purple, :value 1, :scale [0.1 0.1 0.1], :children nil, :functions nil}, :ground-part {:type :ground, :color [40 40 40], :value 0, :scale [12 12 1], :children {:block8671 {:position [-0.75 -0.25 0.85], :rotation [1.0 0.0 0.0 90.00000250447816]}, :block8666 {:position [0.75 -0.25 0.25], :rotation [1.0 0.0 0.0 90.00000250447816]}, :button8684 {:position [0.75 -1.25 0.1], :rotation [1.0 0.0 0.0 90.00000250447816]}}, :functions nil}, :track8667 {:type :track, :color :red, :value 0.5, :scale [0.1 1 0.1], :children {:block8668 {:position [0.49999994 0.049999952 0.0], :rotation [0.0 1.0 0.0 0.0]}}, :functions nil}, :chip8669 {:children nil, :color :gray, :scale [0.3 0.1 0.3], :value 0, :time 1.0, :functions {:track8667 {:points [[0 0] [1.0 0.5]], :relative false, :final-points [[0 0] [1.0 0.5]]}}, :type :chip, :view {:offset [0 0], :zoom 1}, :final-time 1.0}, :button8684 {:type :button, :color [255 0 0], :value 0, :scale [0.5 0.2 0.5], :children nil}, :chip8670 {:children nil, :color :gray, :scale [0.3 0.1 0.3], :value 0, :time 1, :functions {:track8667 {:points [[0 0.5] [1 1]], :relative false, :final-points [[0 0.5] [1 1]]}}, :type :chip, :view {:offset [0 0], :zoom 1}, :final-time 1}, :cpu8685 {:children nil, :color :blue, :scale [0.3 0.1 0.3], :root-filename "decider", :value 0, :type :cpu, :inputs {:button8684 {:value 0, :index 0}, :probe8682 {:value 1, :index 1}}, :outputs {:chip8669 {:value 0, :index 1}, :chip8670 {:value 0, :index 0}}}, :block8666 {:type :block, :color :white, :value 0, :scale [0.5 0.5 0.5], :children {:track8667 {:position [0.0 1.25 0.0], :rotation [0.0 1.0 0.0 0.0]}, :chip8669 {:position [0.0 0.0 0.3], :rotation [1.0 0.0 0.0 90.00000250447816]}, :chip8670 {:position [0.29999995 0.0 0.0], :rotation [0.0 0.0 -1.0 90.00000250447816]}}, :functions nil}}, :camera {:vector [0 0 1], :distance 40, :x-angle 25, :y-angle -35, :pivot [0 0 0], :eye [20.793472290039062 16.90473175048828 29.696155548095703]}}