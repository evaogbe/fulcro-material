(ns ogbe.fulcro.mui.icons.tour
  #?(:cljs (:require
            ["@mui/icons-material/Tour" :default Tour]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tour
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Tour)))