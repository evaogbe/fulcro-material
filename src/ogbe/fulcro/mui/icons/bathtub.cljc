(ns ogbe.fulcro.mui.icons.bathtub
  #?(:cljs (:require
            ["@mui/icons-material/Bathtub" :default Bathtub]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bathtub
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Bathtub)))