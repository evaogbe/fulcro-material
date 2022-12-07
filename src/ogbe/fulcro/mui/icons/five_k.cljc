(ns ogbe.fulcro.mui.icons.five-k
  #?(:cljs (:require
            ["@mui/icons-material/FiveK" :default FiveK]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-five-k
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FiveK)))