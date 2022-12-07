(ns ogbe.fulcro.mui.icons.female
  #?(:cljs (:require
            ["@mui/icons-material/Female" :default Female]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-female
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Female)))