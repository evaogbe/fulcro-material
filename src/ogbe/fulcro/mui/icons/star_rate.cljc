(ns ogbe.fulcro.mui.icons.star-rate
  #?(:cljs (:require
            ["@mui/icons-material/StarRate" :default StarRate]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-star-rate
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StarRate)))