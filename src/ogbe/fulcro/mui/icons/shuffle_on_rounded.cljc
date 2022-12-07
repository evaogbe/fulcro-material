(ns ogbe.fulcro.mui.icons.shuffle-on-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ShuffleOnRounded" :default ShuffleOnRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shuffle-on-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShuffleOnRounded)))