(ns ogbe.fulcro.mui.icons.keyboard
  #?(:cljs (:require
            ["@mui/icons-material/Keyboard" :default Keyboard]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-keyboard
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Keyboard)))