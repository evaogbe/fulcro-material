(ns ogbe.fulcro.mui.icons.shuffle-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ShuffleSharp" :default ShuffleSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shuffle-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShuffleSharp)))