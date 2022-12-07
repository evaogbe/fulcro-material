(ns ogbe.fulcro.mui.icons.arrow-forward
  #?(:cljs (:require
            ["@mui/icons-material/ArrowForward" :default ArrowForward]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-arrow-forward
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ArrowForward)))