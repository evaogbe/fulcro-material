(ns ogbe.fulcro.mui.icons.arrow-circle-right
  #?(:cljs (:require
            ["@mui/icons-material/ArrowCircleRight" :default ArrowCircleRight]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-arrow-circle-right
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ArrowCircleRight)))