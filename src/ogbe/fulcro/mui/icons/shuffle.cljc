(ns ogbe.fulcro.mui.icons.shuffle
  #?(:cljs (:require
            ["@mui/icons-material/Shuffle" :default Shuffle]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shuffle
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Shuffle)))