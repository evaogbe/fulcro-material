(ns ogbe.fulcro.mui.icons.shuffle-on-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ShuffleOnSharp" :default ShuffleOnSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shuffle-on-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShuffleOnSharp)))