(ns ogbe.fulcro.mui.icons.arrow-downward
  #?(:cljs (:require
            ["@mui/icons-material/ArrowDownward" :default ArrowDownward]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-arrow-downward
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ArrowDownward)))