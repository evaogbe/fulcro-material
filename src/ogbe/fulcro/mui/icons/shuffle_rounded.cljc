(ns ogbe.fulcro.mui.icons.shuffle-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ShuffleRounded" :default ShuffleRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shuffle-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShuffleRounded)))