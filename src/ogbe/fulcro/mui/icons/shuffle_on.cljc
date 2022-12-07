(ns ogbe.fulcro.mui.icons.shuffle-on
  #?(:cljs (:require
            ["@mui/icons-material/ShuffleOn" :default ShuffleOn]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shuffle-on
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShuffleOn)))