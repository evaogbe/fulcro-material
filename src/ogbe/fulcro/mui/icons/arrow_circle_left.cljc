(ns ogbe.fulcro.mui.icons.arrow-circle-left
  #?(:cljs (:require
            ["@mui/icons-material/ArrowCircleLeft" :default ArrowCircleLeft]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-arrow-circle-left
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ArrowCircleLeft)))