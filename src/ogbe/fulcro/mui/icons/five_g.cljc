(ns ogbe.fulcro.mui.icons.five-g
  #?(:cljs (:require
            ["@mui/icons-material/FiveG" :default FiveG]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-five-g
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FiveG)))