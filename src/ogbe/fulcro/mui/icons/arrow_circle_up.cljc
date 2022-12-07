(ns ogbe.fulcro.mui.icons.arrow-circle-up
  #?(:cljs (:require
            ["@mui/icons-material/ArrowCircleUp" :default ArrowCircleUp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-arrow-circle-up
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ArrowCircleUp)))