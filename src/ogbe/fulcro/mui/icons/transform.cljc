(ns ogbe.fulcro.mui.icons.transform
  #?(:cljs (:require
            ["@mui/icons-material/Transform" :default Transform]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-transform
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Transform)))