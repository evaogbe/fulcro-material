(ns ogbe.fulcro.mui.icons.arrow-upward
  #?(:cljs (:require
            ["@mui/icons-material/ArrowUpward" :default ArrowUpward]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-arrow-upward
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ArrowUpward)))