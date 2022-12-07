(ns ogbe.fulcro.mui.icons.build
  #?(:cljs (:require
            ["@mui/icons-material/Build" :default Build]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-build
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Build)))