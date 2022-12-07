(ns ogbe.fulcro.mui.icons.sort
  #?(:cljs (:require
            ["@mui/icons-material/Sort" :default Sort]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sort
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Sort)))