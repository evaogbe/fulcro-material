(ns ogbe.fulcro.mui.icons.arrow-circle-down
  #?(:cljs (:require
            ["@mui/icons-material/ArrowCircleDown" :default ArrowCircleDown]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-arrow-circle-down
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ArrowCircleDown)))